package typingsSlinky.materialUi.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Card.CardMediaProps
import typingsSlinky.materialUi.cardMediaMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardMedia {
  @JSImport("material-ui/Card/CardMedia", JSImport.Default)
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
    def mediaStyle(value: CSSProperties): this.type = set("mediaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def overlay(value: TagMod[Any]): this.type = set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayContainerStyle(value: CSSProperties): this.type = set("overlayContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayContentStyle(value: CSSProperties): this.type = set("overlayContentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardMediaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardMedia.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

