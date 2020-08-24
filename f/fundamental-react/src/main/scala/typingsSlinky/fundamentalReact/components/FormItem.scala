package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.formItemMod.FormItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormItem {
  @JSImport("fundamental-react", "FormItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def isHorizontal(value: Boolean): this.type = set("isHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def isInline(value: Boolean): this.type = set("isInline", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

