package typingsSlinky.pdfViewerReactjs

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.pdfViewerReactjs.mod.AlertHandler
import typingsSlinky.pdfViewerReactjs.mod.BtnClickHandler
import typingsSlinky.pdfViewerReactjs.mod.DocClickHandler
import typingsSlinky.pdfViewerReactjs.mod.Document
import typingsSlinky.pdfViewerReactjs.mod.Err
import typingsSlinky.pdfViewerReactjs.mod.PDFViewer
import typingsSlinky.pdfViewerReactjs.mod.RotationClickHandler
import typingsSlinky.pdfViewerReactjs.mod.Watermark
import typingsSlinky.pdfViewerReactjs.mod.ZoomClickHandler
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<pdf-viewer-reactjs.pdf-viewer-reactjs.PDFViewerProps> */
@js.native
trait PartialPDFViewerProps extends js.Object {
  var alert: js.UndefOr[AlertHandler] = js.native
  var canvasCss: js.UndefOr[String] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var css: js.UndefOr[String] = js.native
  var defaultScale: js.UndefOr[Double] = js.native
  var document: js.UndefOr[Document] = js.native
  var hideNavbar: js.UndefOr[Boolean] = js.native
  var hideRotation: js.UndefOr[Boolean] = js.native
  var hideZoom: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var loader: js.UndefOr[TagMod[Any]] = js.native
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
  var ref: js.UndefOr[LegacyRef[PDFViewer]] = js.native
  var rotationAngle: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var scaleStep: js.UndefOr[Double] = js.native
  var watermark: js.UndefOr[Watermark] = js.native
}

object PartialPDFViewerProps {
  @scala.inline
  def apply(): PartialPDFViewerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPDFViewerProps]
  }
  @scala.inline
  implicit class PartialPDFViewerPropsOps[Self <: PartialPDFViewerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: /* err */ Err => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasCss")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScale")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNavbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNavbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavbar")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoader(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(js.undefined)
        ret
    }
    @scala.inline
    def withNavbarOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbarOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavbarOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbarOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDocumentClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDocumentClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDocumentClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDocumentClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNextBtnClick(value: /* page */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextBtnClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNextBtnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextBtnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevBtnClick(value: /* page */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevBtnClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPrevBtnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevBtnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRotation(value: /* angle */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoom(value: /* scale */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectContent")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[PDFViewer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ PDFViewer | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: LegacyRef[PDFViewer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStep")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermark(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermark")(js.undefined)
        ret
    }
  }
  
}

