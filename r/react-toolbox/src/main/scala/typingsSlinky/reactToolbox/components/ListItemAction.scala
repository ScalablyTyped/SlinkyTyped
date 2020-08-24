package typingsSlinky.reactToolbox.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToolbox.listItemActionMod.ListItemActionProps
import typingsSlinky.reactToolbox.listItemActionMod.ListItemActionTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemAction {
  @JSImport("react-toolbox/components/list", "ListItemAction")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToolbox.listMod.ListItemAction] {
    @scala.inline
    def actionReactElement(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def action(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ListItemActionTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemActionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemAction.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

