package typingsSlinky.materialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Card.CardTitleProps
import typingsSlinky.materialUi.cardTitleMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardTitle {
  @JSImport("material-ui/Card/CardTitle", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
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
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleColor(value: String): this.type = set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardTitle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

