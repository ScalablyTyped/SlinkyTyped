package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.IndexNumber
import typingsSlinky.primereact.galleriaMod.GalleriaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Galleria {
  @JSImport("primereact/galleria", "Galleria")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactGalleriaMod.Galleria] {
    @scala.inline
    def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def captionTemplate(value: js.Any): this.type = set("captionTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def changePreviewOnIndicatorHover(value: Boolean): this.type = set("changePreviewOnIndicatorHover", value.asInstanceOf[js.Any])
    @scala.inline
    def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: js.Any): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def fullScreen(value: Boolean): this.type = set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorItemTemplate(value: js.Any): this.type = set("indicatorItemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def indicatorsPosition(value: String): this.type = set("indicatorsPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def numVisible(value: Double): this.type = set("numVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def onItemChange(value: /* e */ IndexNumber => Unit): this.type = set("onItemChange", js.Any.fromFunction1(value))
    @scala.inline
    def previewItemTemplate(value: js.Any): this.type = set("previewItemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def responsiveOptions(value: js.Any): this.type = set("responsiveOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def showIndicators(value: Boolean): this.type = set("showIndicators", value.asInstanceOf[js.Any])
    @scala.inline
    def showIndicatorsOnPreview(value: Boolean): this.type = set("showIndicatorsOnPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def showNavButtonsOnPreviewHover(value: Boolean): this.type = set("showNavButtonsOnPreviewHover", value.asInstanceOf[js.Any])
    @scala.inline
    def showPreviewNavButtons(value: Boolean): this.type = set("showPreviewNavButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def showThumbnailNavButtons(value: Boolean): this.type = set("showThumbnailNavButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def showThumbnails(value: Boolean): this.type = set("showThumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbnailItemTemplate(value: js.Any): this.type = set("thumbnailItemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbnailsPosition(value: String): this.type = set("thumbnailsPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionInterval(value: Double): this.type = set("transitionInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GalleriaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Galleria.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

