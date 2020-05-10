package typingsSlinky.reactToolbox.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToolbox.listListItemActionMod.ListItemActionTheme
import typingsSlinky.reactToolbox.listListItemActionsMod.ListItemActionsProps
import typingsSlinky.reactToolbox.listListItemActionsMod.ListItemActionsTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.left
import typingsSlinky.reactToolbox.reactToolboxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemActions {
  @JSImport("react-toolbox/lib/list", "ListItemActions")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemActions] {
    @scala.inline
    def theme(value: ListItemActionsTheme with ListItemActionTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: left | right): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemActions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

