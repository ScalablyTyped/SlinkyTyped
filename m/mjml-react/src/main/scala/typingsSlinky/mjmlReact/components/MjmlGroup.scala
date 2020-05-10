package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlGroupProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlGroup {
  @JSImport("mjml-react", "MjmlGroup")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlGroup] {
    @scala.inline
    def backgroundColor(value: BackgroundColorProperty): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalAlign(value: VerticalAlignProperty[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MjmlGroupProps with RequiredChildrenProps with ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MjmlGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

