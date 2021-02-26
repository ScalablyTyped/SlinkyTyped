package typingsSlinky.pdfViewerReactjs.components

import org.scalajs.dom.raw.Document
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.pdfViewerReactjs.mod.Err
import typingsSlinky.pdfViewerReactjs.mod.PDFViewerProps
import typingsSlinky.pdfViewerReactjs.mod.Watermark
import typingsSlinky.pdfViewerReactjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PdfViewerReactjs {
  
  @scala.inline
  def apply(document: Document): Builder = {
    val __props = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PDFViewerProps]))
  }
  
  @JSImport("pdf-viewer-reactjs", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def alert(value: /* err */ Err => ReactElement): this.type = set("alert", js.Any.fromFunction1(value))
    
    @scala.inline
    def canvasCss(value: String): this.type = set("canvasCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def css(value: String): this.type = set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultScale(value: Double): this.type = set("defaultScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideNavbar(value: Boolean): this.type = set("hideNavbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideRotation(value: Boolean): this.type = set("hideRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideZoom(value: Boolean): this.type = set("hideZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loader(value: ReactElement): this.type = set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loaderReactElement(value: ReactElement): this.type = set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxScale(value: Double): this.type = set("maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minScale(value: Double): this.type = set("minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def navbarOnTop(value: Boolean): this.type = set("navbarOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def navigation(value: js.Any): this.type = set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDocumentClick(value: () => Unit): this.type = set("onDocumentClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def onNextBtnClick(value: /* page */ Double => Unit): this.type = set("onNextBtnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPrevBtnClick(value: /* page */ Double => Unit): this.type = set("onPrevBtnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRotation(value: /* angle */ Double => Unit): this.type = set("onRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def onZoom(value: /* scale */ Double => Unit): this.type = set("onZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def protectContent(value: Boolean): this.type = set("protectContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotationAngle(value: Double): this.type = set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleStep(value: Double): this.type = set("scaleStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def watermark(value: Watermark): this.type = set("watermark", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PDFViewerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
