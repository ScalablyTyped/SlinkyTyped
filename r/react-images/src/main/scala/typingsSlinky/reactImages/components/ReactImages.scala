package typingsSlinky.reactImages.components

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.img.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactHTMLElement
import typingsSlinky.reactImages.mod.Image
import typingsSlinky.reactImages.mod.LightboxProps
import typingsSlinky.reactImages.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImages {
  
  @JSImport("react-images", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def backdropClosesModal(value: Boolean): this.type = set("backdropClosesModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeButtonTitle(value: String): this.type = set("closeButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentImage(value: Double): this.type = set("currentImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customControlsVarargs(value: ReactHTMLElement[js.Any]*): this.type = set("customControls", js.Array(value :_*))
    
    @scala.inline
    def customControls(value: js.Array[ReactHTMLElement[_]]): this.type = set("customControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableKeyboardInput(value: Boolean): this.type = set("enableKeyboardInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageCountSeparator(value: String): this.type = set("imageCountSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftArrowTitle(value: String): this.type = set("leftArrowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClickImage(value: /* e */ SyntheticMouseEvent[HTMLImageElement] => Unit): this.type = set("onClickImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickNext(value: () => Unit): this.type = set("onClickNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def onClickPrev(value: () => Unit): this.type = set("onClickPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def onClickThumbnail(value: /* index */ Double => Unit): this.type = set("onClickThumbnail", js.Any.fromFunction1(value))
    
    @scala.inline
    def preloadNextImage(value: Boolean): this.type = set("preloadNextImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventScroll(value: Boolean): this.type = set("preventScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightArrowTitle(value: String): this.type = set("rightArrowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showImageCount(value: Boolean): this.type = set("showImageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showThumbnails(value: Boolean): this.type = set("showThumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spinner(value: () => ReactElement): this.type = set("spinner", js.Any.fromFunction0(value))
    
    @scala.inline
    def spinnerColor(value: String): this.type = set("spinnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spinnerSize(value: Double): this.type = set("spinnerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LightboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(images: js.Array[Image], onClose: () => Unit): Builder = {
    val __props = js.Dynamic.literal(images = images.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    new Builder(js.Array(this.component, __props.asInstanceOf[LightboxProps]))
  }
}
