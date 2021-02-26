package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Direction
import typingsSlinky.primereact.pickListControlsMod.PickListControlsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickListControls {
  
  @JSImport("primereact/components/picklist/PickListControls", "PickListControls")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.pickListControlsMod.PickListControls] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def list(value: js.Array[_]): this.type = set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listVarargs(value: js.Any*): this.type = set("list", js.Array(value :_*))
    
    @scala.inline
    def onReorder(value: /* e */ Direction => Unit): this.type = set("onReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def selection(value: js.Array[_]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionVarargs(value: js.Any*): this.type = set("selection", js.Array(value :_*))
  }
  
  implicit def make(companion: PickListControls.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickListControlsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
