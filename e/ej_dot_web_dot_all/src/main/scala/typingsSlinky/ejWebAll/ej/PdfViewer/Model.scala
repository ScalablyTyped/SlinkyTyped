package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers after the printing is completed.
    */
  var afterPrint: js.UndefOr[js.Function1[/* e */ AfterPrintEventArgs, Unit]] = js.native
  /** Triggers when the AJAX request is failed.
    */
  var ajaxRequestFailure: js.UndefOr[js.Function1[/* e */ AjaxRequestFailureEventArgs, Unit]] = js.native
  /** Triggers when the ajax request is Success.
    */
  var ajaxRequestSuccess: js.UndefOr[js.Function1[/* e */ AjaxRequestSuccessEventArgs, Unit]] = js.native
  /** Enables or disables the buffering of the PDF pages in the client side.
    */
  var allowClientBuffering: js.UndefOr[Boolean] = js.native
  /** Triggers when an annotation is added over the page of the PDF document.
    */
  var annotationAdd: js.UndefOr[js.Function1[/* e */ AnnotationAddEventArgs, Unit]] = js.native
  /** Enables/disables the annotation context menu.
    */
  var annotationContextMenu: js.UndefOr[AnnotationContextMenu] = js.native
  /** Triggers when the property of the annotation is changed in the page of the PDF document.
    */
  var annotationPropertiesChange: js.UndefOr[js.Function1[/* e */ AnnotationPropertiesChangeEventArgs, Unit]] = js.native
  /** Triggers when an annotation is removed from the page of the PDF document.
    */
  var annotationRemove: js.UndefOr[js.Function1[/* e */ AnnotationRemoveEventArgs, Unit]] = js.native
  /** Specifies the type of the annotations.
    */
  var annotationType: js.UndefOr[AnnotationType | String] = js.native
  /** Triggers before the printing starts.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.native
  /** Triggers when the client buffering process ends.
    */
  var bufferEnd: js.UndefOr[js.Function1[/* e */ BufferEndEventArgs, Unit]] = js.native
  /** Triggers when the client buffering process starts.
    */
  var bufferStart: js.UndefOr[js.Function1[/* e */ BufferStartEventArgs, Unit]] = js.native
  /** Gets or sets the buffering mode of the PDF viewer control when allowClientBuffering is set to true.
    */
  var bufferingMode: js.UndefOr[BufferingMode | String] = js.native
  /** Gets the number of the page being displayed in the PDF viewer.
    */
  var currentPageNumber: js.UndefOr[Double] = js.native
  /** Triggers when PDF viewer control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Triggers when the PDF document gets loaded and is ready to view in the Control.
    */
  var documentLoad: js.UndefOr[js.Function1[/* e */ DocumentLoadEventArgs, Unit]] = js.native
  /** Sets the PDF document path for initial loading.
    */
  var documentPath: js.UndefOr[String] = js.native
  /** Triggers when the PDF document gets unloaded from the PDF viewer.
    */
  var documentUnload: js.UndefOr[js.Function1[/* e */ DocumentUnloadEventArgs, Unit]] = js.native
  /** Triggers when the download is completed or aborted.
    */
  var downloadEnd: js.UndefOr[js.Function1[/* e */ DownloadEndEventArgs, Unit]] = js.native
  /** Triggers when the download is started.
    */
  var downloadStart: js.UndefOr[js.Function1[/* e */ DownloadStartEventArgs, Unit]] = js.native
  /** Enables or disables the highlight annotation.
    */
  var enableHighlightAnnotation: js.UndefOr[Boolean] = js.native
  /** Enables or disables the hyperlinks in PDF document.
    */
  var enableHyperlink: js.UndefOr[Boolean] = js.native
  /** Enables or disables the adding of handwritten signature over the PDF document.
    */
  var enableSignature: js.UndefOr[Boolean] = js.native
  /** Enables or disables the strikethrough annotation.
    */
  var enableStrikethroughAnnotation: js.UndefOr[Boolean] = js.native
  /** Enables or disables the text markup annotations.
    */
  var enableTextMarkupAnnotations: js.UndefOr[Boolean] = js.native
  /** Enables or disables the text selection in PDF document.
    */
  var enableTextSelection: js.UndefOr[Boolean] = js.native
  /** Enables or disables the underline annotation.
    */
  var enableUnderlineAnnotation: js.UndefOr[Boolean] = js.native
  /** Gets the name of the PDF document which loaded in the ejPdfViewer control for downloading.
    */
  var fileName: js.UndefOr[String] = js.native
  /** Gets/sets the settings of the highlight annotation.
    */
  var highlightSettings: js.UndefOr[HighlightSettings] = js.native
  /** Triggers when hyperlink in the PDF Document is clicked
    */
  var hyperlinkClick: js.UndefOr[js.Function1[/* e */ HyperlinkClickEventArgs, Unit]] = js.native
  /** Specifies the open state of the hyperlink in the PDF document.
    */
  var hyperlinkOpenState: js.UndefOr[LinkTarget | String] = js.native
  /** Specifies the viewer interaction mode.
    */
  var interactionMode: js.UndefOr[InteractionMode | String] = js.native
  /** Checks whether the PDF document is edited.
    */
  var isDocumentEdited: js.UndefOr[Boolean] = js.native
  /** Enables or disables the responsiveness of the PDF viewer control during the window resize.
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the locale information of the PDF viewer.
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggers when there is change in current page number.
    */
  var pageChange: js.UndefOr[js.Function1[/* e */ PageChangeEventArgs, Unit]] = js.native
  /** Triggers when the mouse click is performed over the page of the PDF document.
    */
  var pageClick: js.UndefOr[js.Function1[/* e */ PageClickEventArgs, Unit]] = js.native
  /** Gets the total number of pages in PDF document.
    */
  var pageCount: js.UndefOr[Double] = js.native
  /** Specifies the location of the supporting PDF service
    */
  var pdfService: js.UndefOr[PdfService | String] = js.native
  /** Specifies the name of the action method in the server.
    */
  var serverActionSettings: js.UndefOr[ServerActionSettings] = js.native
  /** Sets the PDF Web API service URL
    */
  var serviceUrl: js.UndefOr[String] = js.native
  /** Triggers when a handwritten signature is added over the page of the PDF document.
    */
  var signatureAdd: js.UndefOr[js.Function1[/* e */ SignatureAddEventArgs, Unit]] = js.native
  /** Triggers when a handwritten signature is removed from the page of the PDF document.
    */
  var signatureDelete: js.UndefOr[js.Function1[/* e */ SignatureDeleteEventArgs, Unit]] = js.native
  /** Triggers when a handwritten signature properties is changed in the PDF document.
    */
  var signaturePropertiesChange: js.UndefOr[js.Function1[/* e */ SignaturePropertiesChangeEventArgs, Unit]] = js.native
  /** Triggers when a handwritten signature is resized in the PDF document.
    */
  var signatureResize: js.UndefOr[js.Function1[/* e */ SignatureResizeEventArgs, Unit]] = js.native
  /** Gets/sets the settings of the handwritten signature.
    */
  var signatureSettings: js.UndefOr[SignatureSettings] = js.native
  /** Gets/sets the settings of the strikethrough annotation.
    */
  var strikethroughSettings: js.UndefOr[StrikethroughSettings] = js.native
  /** Enables/ disables the text selection context menu.
    */
  var textSelectionContextMenu: js.UndefOr[TextSelectionContextMenu] = js.native
  /** Specifies the toolbar settings.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  /** Gets/sets the settings of the underline annotation.
    */
  var underlineSettings: js.UndefOr[UnderlineSettings] = js.native
  /** Triggers when there is change in the magnification value.
    */
  var zoomChange: js.UndefOr[js.Function1[/* e */ ZoomChangeEventArgs, Unit]] = js.native
  /** Gets the current zoom percentage of the PDF document in viewer.
    */
  var zoomPercentage: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterPrint(value: /* e */ AfterPrintEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxRequestFailure(value: /* e */ AjaxRequestFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxRequestFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxRequestSuccess(value: /* e */ AjaxRequestSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxRequestSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowClientBuffering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClientBuffering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClientBuffering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClientBuffering")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationAdd(value: /* e */ AnnotationAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnnotationAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationContextMenu(value: AnnotationContextMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationPropertiesChange(value: /* e */ AnnotationPropertiesChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationPropertiesChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnnotationPropertiesChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationPropertiesChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationRemove(value: /* e */ AnnotationRemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnnotationRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationType(value: AnnotationType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationType")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrint")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferEnd(value: /* e */ BufferEndEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBufferEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferStart(value: /* e */ BufferStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBufferStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferingMode(value: BufferingMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentLoad(value: /* e */ DocumentLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDocumentLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentPath")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentUnload(value: /* e */ DocumentUnloadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUnload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDocumentUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadEnd(value: /* e */ DownloadEndEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownloadEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadStart(value: /* e */ DownloadStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownloadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHighlightAnnotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighlightAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHighlightAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighlightAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSignature(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableStrikethroughAnnotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStrikethroughAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableStrikethroughAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStrikethroughAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTextMarkupAnnotations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextMarkupAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTextMarkupAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextMarkupAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTextSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTextSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUnderlineAnnotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUnderlineAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUnderlineAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUnderlineAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSettings(value: HighlightSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinkClick(value: /* e */ HyperlinkClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHyperlinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinkOpenState(value: LinkTarget | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkOpenState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlinkOpenState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkOpenState")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionMode(value: InteractionMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDocumentEdited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDocumentEdited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDocumentEdited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDocumentEdited")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPageChange(value: /* e */ PageChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPageClick(value: /* e */ PageClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfService(value: PdfService | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdfService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfService")(js.undefined)
        ret
    }
    @scala.inline
    def withServerActionSettings(value: ServerActionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverActionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerActionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverActionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAdd(value: /* e */ SignatureAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSignatureAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureDelete(value: /* e */ SignatureDeleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSignatureDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withSignaturePropertiesChange(value: /* e */ SignaturePropertiesChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signaturePropertiesChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSignaturePropertiesChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signaturePropertiesChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureResize(value: /* e */ SignatureResizeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSignatureResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureResize")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureSettings(value: SignatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStrikethroughSettings(value: StrikethroughSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethroughSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrikethroughSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethroughSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSelectionContextMenu(value: TextSelectionContextMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSelectionContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSelectionContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSelectionContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarSettings(value: ToolbarSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineSettings(value: UnderlineSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomChange(value: /* e */ ZoomChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChange")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPercentage")(js.undefined)
        ret
    }
  }
  
}

