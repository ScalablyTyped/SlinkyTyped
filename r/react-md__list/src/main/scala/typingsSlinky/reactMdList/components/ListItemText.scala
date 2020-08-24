package typingsSlinky.reactMdList.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdList.listItemTextMod.ListItemTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemText {
  @JSImport("@react-md/list", "ListItemText")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def secondaryTextReactElement(value: ReactElement): this.type = set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def secondaryText(value: ReactElement): this.type = set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def secondaryTextClassName(value: String): this.type = set("secondaryTextClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

