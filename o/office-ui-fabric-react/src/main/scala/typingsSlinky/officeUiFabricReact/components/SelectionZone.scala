package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionZone {
  
  @JSImport("office-ui-fabric-react", "SelectionZone")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SelectionZone] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: () => Unit): this.type = set("componentRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def disableAutoSelectOnInputElements(value: Boolean): this.type = set("disableAutoSelectOnInputElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableTouchInvocationTarget(value: Boolean): this.type = set("enableTouchInvocationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enterModalOnTouch(value: Boolean): this.type = set("enterModalOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isSelectedOnFocus(value: Boolean): this.type = set("isSelectedOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: js.Object): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onItemContextMenu(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): this.type = set("onItemContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def onItemInvoked(
      value: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
    ): this.type = set("onItemInvoked", js.Any.fromFunction3(value))
    
    @scala.inline
    def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionPreservedOnEmptyClick(value: Boolean): this.type = set("selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISelectionZoneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey]): Builder = {
    val __props = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISelectionZoneProps]))
  }
}
