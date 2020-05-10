package typingsSlinky.baseui.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.listMod.LabelPropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemLabel {
  @JSImport("baseui/list", "ListItemLabel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def description(value: TagMod[Any]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def sublist(value: Boolean): this.type = set("sublist", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LabelPropsT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

