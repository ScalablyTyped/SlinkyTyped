package typingsSlinky.materialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Card.CardHeaderProps
import typingsSlinky.materialUi.cardHeaderMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardHeader {
  @JSImport("material-ui/Card/CardHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    @scala.inline
    def avatarReactElement(value: ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def avatar(value: ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def openIconReactElement(value: ReactElement): this.type = set("openIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def openIcon(value: ReactElement): this.type = set("openIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showExpandableButton(value: Boolean): this.type = set("showExpandableButton", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleReactElement(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitle(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleColor(value: String): this.type = set("subtitleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleStyle(value: CSSProperties): this.type = set("subtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: CSSProperties): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleColor(value: String): this.type = set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

