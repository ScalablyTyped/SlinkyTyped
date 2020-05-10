package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mod.MjmlNavbarProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlNavbar {
  @JSImport("mjml-react", "MjmlNavbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlNavbar] {
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def baseUrl(value: String): this.type = set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def hamburger(value: typingsSlinky.mjmlReact.mjmlReactStrings.hamburger): this.type = set("hamburger", value.asInstanceOf[js.Any])
    @scala.inline
    def icoAlign(value: String): this.type = set("icoAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def icoClose(value: String): this.type = set("icoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def icoColor(value: ColorProperty): this.type = set("icoColor", value.asInstanceOf[js.Any])
    @scala.inline
    def icoFontSize(value: String): this.type = set("icoFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def icoLineHeight(value: String): this.type = set("icoLineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def icoOpen(value: String): this.type = set("icoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def icoPadding(value: String): this.type = set("icoPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def icoPaddingBottom(value: String): this.type = set("icoPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def icoPaddingLeft(value: String): this.type = set("icoPaddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def icoPaddingRight(value: String): this.type = set("icoPaddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def icoPaddingTop(value: String): this.type = set("icoPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def icoTextDecoration(value: String): this.type = set("icoTextDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def icoTextTransform(value: String): this.type = set("icoTextTransform", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MjmlNavbarProps with RequiredChildrenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MjmlNavbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

