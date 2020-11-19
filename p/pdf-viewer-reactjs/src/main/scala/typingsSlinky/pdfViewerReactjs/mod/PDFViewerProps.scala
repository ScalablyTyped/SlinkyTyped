package typingsSlinky.pdfViewerReactjs.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerProps extends Props[PDFViewer] {
  
  var alert: js.UndefOr[AlertHandler] = js.native
  
  var canvasCss: js.UndefOr[String] = js.native
  
  var css: js.UndefOr[String] = js.native
  
  var defaultScale: js.UndefOr[Double] = js.native
  
  var document: Document = js.native
  
  var hideNavbar: js.UndefOr[Boolean] = js.native
  
  var hideRotation: js.UndefOr[Boolean] = js.native
  
  var hideZoom: js.UndefOr[Boolean] = js.native
  
  var loader: js.UndefOr[ReactElement] = js.native
  
  var maxScale: js.UndefOr[Double] = js.native
  
  var minScale: js.UndefOr[Double] = js.native
  
  var navbarOnTop: js.UndefOr[Boolean] = js.native
  
  var navigation: js.UndefOr[js.Any] = js.native
  
  var onDocumentClick: js.UndefOr[DocClickHandler] = js.native
  
  var onNextBtnClick: js.UndefOr[BtnClickHandler] = js.native
  
  var onPrevBtnClick: js.UndefOr[BtnClickHandler] = js.native
  
  var onRotation: js.UndefOr[RotationClickHandler] = js.native
  
  var onZoom: js.UndefOr[ZoomClickHandler] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var protectContent: js.UndefOr[Boolean] = js.native
  
  var rotationAngle: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var scaleStep: js.UndefOr[Double] = js.native
  
  var watermark: js.UndefOr[Watermark] = js.native
}
object PDFViewerProps {
  
  @scala.inline
  def apply(document: Document): PDFViewerProps = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerProps]
  }
  
  @scala.inline
  implicit class PDFViewerPropsOps[Self <: PDFViewerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlert(value: /* err */ Err => ReactElement): Self = this.set("alert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setCanvasCss(value: String): Self = this.set("canvasCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasCss: Self = this.set("canvasCss", js.undefined)
    
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDefaultScale(value: Double): Self = this.set("defaultScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultScale: Self = this.set("defaultScale", js.undefined)
    
    @scala.inline
    def setHideNavbar(value: Boolean): Self = this.set("hideNavbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideNavbar: Self = this.set("hideNavbar", js.undefined)
    
    @scala.inline
    def setHideRotation(value: Boolean): Self = this.set("hideRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideRotation: Self = this.set("hideRotation", js.undefined)
    
    @scala.inline
    def setHideZoom(value: Boolean): Self = this.set("hideZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideZoom: Self = this.set("hideZoom", js.undefined)
    
    @scala.inline
    def setLoaderReactElement(value: ReactElement): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader(value: ReactElement): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScale: Self = this.set("minScale", js.undefined)
    
    @scala.inline
    def setNavbarOnTop(value: Boolean): Self = this.set("navbarOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavbarOnTop: Self = this.set("navbarOnTop", js.undefined)
    
    @scala.inline
    def setNavigation(value: js.Any): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setOnDocumentClick(value: () => Unit): Self = this.set("onDocumentClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDocumentClick: Self = this.set("onDocumentClick", js.undefined)
    
    @scala.inline
    def setOnNextBtnClick(value: /* page */ Double => Unit): Self = this.set("onNextBtnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNextBtnClick: Self = this.set("onNextBtnClick", js.undefined)
    
    @scala.inline
    def setOnPrevBtnClick(value: /* page */ Double => Unit): Self = this.set("onPrevBtnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPrevBtnClick: Self = this.set("onPrevBtnClick", js.undefined)
    
    @scala.inline
    def setOnRotation(value: /* angle */ Double => Unit): Self = this.set("onRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRotation: Self = this.set("onRotation", js.undefined)
    
    @scala.inline
    def setOnZoom(value: /* scale */ Double => Unit): Self = this.set("onZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoom: Self = this.set("onZoom", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setProtectContent(value: Boolean): Self = this.set("protectContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectContent: Self = this.set("protectContent", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScaleStep(value: Double): Self = this.set("scaleStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleStep: Self = this.set("scaleStep", js.undefined)
    
    @scala.inline
    def setWatermark(value: Watermark): Self = this.set("watermark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermark: Self = this.set("watermark", js.undefined)
  }
}
