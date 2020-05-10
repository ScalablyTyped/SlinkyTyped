package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsHeaderFooterItem {
  @JSImport("office-ui-fabric-react", "SuggestionsHeaderFooterItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsHeaderFooterItem] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ js.Object | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def onExecute(value: () => Unit): this.type = set("onExecute", js.Any.fromFunction0(value))
  }
  
  def withProps(p: ISuggestionsHeaderFooterItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String, isSelected: Boolean, renderItem: () => ReactElement): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], renderItem = js.Any.fromFunction0(renderItem))
    new Builder(js.Array(this.component, __props.asInstanceOf[ISuggestionsHeaderFooterItemProps]))
  }
}

