package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPrintManagerTemplatePrinter extends js.Object {
  @JSName("MSHTML.CPrintManagerTemplatePrinter_typekey")
  var MSHTMLDotCPrintManagerTemplatePrinter_typekey: CPrintManagerTemplatePrinter = js.native
  var allLinkedDocuments: Boolean = js.native
  var collate: Boolean = js.native
  var copies: Double = js.native
  var currentPage: Boolean = js.native
  var currentPageAvail: Boolean = js.native
  val duplex: Boolean = js.native
  var footer: String = js.native
  var frameActive: Boolean = js.native
  var frameActiveEnabled: Boolean = js.native
  var frameAsShown: Boolean = js.native
  var framesetDocument: Boolean = js.native
  var header: String = js.native
  var headerFooterFont: String = js.native
  var marginBottom: Double = js.native
  var marginLeft: Double = js.native
  var marginRight: Double = js.native
  var marginTop: Double = js.native
  var orientation: String = js.native
  var pageFrom: Double = js.native
  val pageHeight: Double = js.native
  var pageTo: Double = js.native
  val pageWidth: Double = js.native
  val percentScale: Double = js.native
  var selectedPages: Boolean = js.native
  var selection: Boolean = js.native
  var selectionEnabled: Boolean = js.native
  val showHeaderFooter: Boolean = js.native
  val shrinkToFit: Boolean = js.native
  var tableOfLinks: Boolean = js.native
  val unprintableBottom: Double = js.native
  val unprintableLeft: Double = js.native
  val unprintableRight: Double = js.native
  val unprintableTop: Double = js.native
  var usePrinterCopyCollate: Boolean = js.native
  def deviceSupports(bstrProperty: String): js.Any = js.native
  def drawPreviewPage(pElemDisp: js.Any, nPage: Double): Unit = js.native
  def endPrint(): Unit = js.native
  def ensurePrintDialogDefaults(): Boolean = js.native
  def getPageMarginBottom(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginBottomImportant(pageRule: js.Any): Boolean = js.native
  def getPageMarginLeft(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginLeftImportant(pageRule: js.Any): Boolean = js.native
  def getPageMarginRight(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginRightImportant(pageRule: js.Any): Boolean = js.native
  def getPageMarginTop(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginTopImportant(pageRule: js.Any): Boolean = js.native
  def getPrintTaskOptionValue(bstrKey: String): js.Any = js.native
  def invalidatePreview(): Unit = js.native
  def printBlankPage(): Unit = js.native
  def printNonNative(pMarkup: js.Any): Boolean = js.native
  def printNonNativeFrames(pMarkup: js.Any, fActiveFrame: Boolean): Unit = js.native
  def printPage(pElemDisp: js.Any): Unit = js.native
  def setPageCount(nPage: Double): Unit = js.native
  def showPageSetupDialog(): Boolean = js.native
  def showPrintDialog(): Boolean = js.native
  def startDoc(bstrTitle: String): Boolean = js.native
  def startPrint(): Unit = js.native
  def stopDoc(): Unit = js.native
  def updatePageStatus(p: Double): Unit = js.native
}

object CPrintManagerTemplatePrinter {
  @scala.inline
  def apply(
    MSHTMLDotCPrintManagerTemplatePrinter_typekey: CPrintManagerTemplatePrinter,
    allLinkedDocuments: Boolean,
    collate: Boolean,
    copies: Double,
    currentPage: Boolean,
    currentPageAvail: Boolean,
    deviceSupports: String => js.Any,
    drawPreviewPage: (js.Any, Double) => Unit,
    duplex: Boolean,
    endPrint: () => Unit,
    ensurePrintDialogDefaults: () => Boolean,
    footer: String,
    frameActive: Boolean,
    frameActiveEnabled: Boolean,
    frameAsShown: Boolean,
    framesetDocument: Boolean,
    getPageMarginBottom: (js.Any, Double, Double) => js.Any,
    getPageMarginBottomImportant: js.Any => Boolean,
    getPageMarginLeft: (js.Any, Double, Double) => js.Any,
    getPageMarginLeftImportant: js.Any => Boolean,
    getPageMarginRight: (js.Any, Double, Double) => js.Any,
    getPageMarginRightImportant: js.Any => Boolean,
    getPageMarginTop: (js.Any, Double, Double) => js.Any,
    getPageMarginTopImportant: js.Any => Boolean,
    getPrintTaskOptionValue: String => js.Any,
    header: String,
    headerFooterFont: String,
    invalidatePreview: () => Unit,
    marginBottom: Double,
    marginLeft: Double,
    marginRight: Double,
    marginTop: Double,
    orientation: String,
    pageFrom: Double,
    pageHeight: Double,
    pageTo: Double,
    pageWidth: Double,
    percentScale: Double,
    printBlankPage: () => Unit,
    printNonNative: js.Any => Boolean,
    printNonNativeFrames: (js.Any, Boolean) => Unit,
    printPage: js.Any => Unit,
    selectedPages: Boolean,
    selection: Boolean,
    selectionEnabled: Boolean,
    setPageCount: Double => Unit,
    showHeaderFooter: Boolean,
    showPageSetupDialog: () => Boolean,
    showPrintDialog: () => Boolean,
    shrinkToFit: Boolean,
    startDoc: String => Boolean,
    startPrint: () => Unit,
    stopDoc: () => Unit,
    tableOfLinks: Boolean,
    unprintableBottom: Double,
    unprintableLeft: Double,
    unprintableRight: Double,
    unprintableTop: Double,
    updatePageStatus: Double => Unit,
    usePrinterCopyCollate: Boolean
  ): CPrintManagerTemplatePrinter = {
    val __obj = js.Dynamic.literal(allLinkedDocuments = allLinkedDocuments.asInstanceOf[js.Any], collate = collate.asInstanceOf[js.Any], copies = copies.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], currentPageAvail = currentPageAvail.asInstanceOf[js.Any], deviceSupports = js.Any.fromFunction1(deviceSupports), drawPreviewPage = js.Any.fromFunction2(drawPreviewPage), duplex = duplex.asInstanceOf[js.Any], endPrint = js.Any.fromFunction0(endPrint), ensurePrintDialogDefaults = js.Any.fromFunction0(ensurePrintDialogDefaults), footer = footer.asInstanceOf[js.Any], frameActive = frameActive.asInstanceOf[js.Any], frameActiveEnabled = frameActiveEnabled.asInstanceOf[js.Any], frameAsShown = frameAsShown.asInstanceOf[js.Any], framesetDocument = framesetDocument.asInstanceOf[js.Any], getPageMarginBottom = js.Any.fromFunction3(getPageMarginBottom), getPageMarginBottomImportant = js.Any.fromFunction1(getPageMarginBottomImportant), getPageMarginLeft = js.Any.fromFunction3(getPageMarginLeft), getPageMarginLeftImportant = js.Any.fromFunction1(getPageMarginLeftImportant), getPageMarginRight = js.Any.fromFunction3(getPageMarginRight), getPageMarginRightImportant = js.Any.fromFunction1(getPageMarginRightImportant), getPageMarginTop = js.Any.fromFunction3(getPageMarginTop), getPageMarginTopImportant = js.Any.fromFunction1(getPageMarginTopImportant), getPrintTaskOptionValue = js.Any.fromFunction1(getPrintTaskOptionValue), header = header.asInstanceOf[js.Any], headerFooterFont = headerFooterFont.asInstanceOf[js.Any], invalidatePreview = js.Any.fromFunction0(invalidatePreview), marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pageFrom = pageFrom.asInstanceOf[js.Any], pageHeight = pageHeight.asInstanceOf[js.Any], pageTo = pageTo.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any], percentScale = percentScale.asInstanceOf[js.Any], printBlankPage = js.Any.fromFunction0(printBlankPage), printNonNative = js.Any.fromFunction1(printNonNative), printNonNativeFrames = js.Any.fromFunction2(printNonNativeFrames), printPage = js.Any.fromFunction1(printPage), selectedPages = selectedPages.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionEnabled = selectionEnabled.asInstanceOf[js.Any], setPageCount = js.Any.fromFunction1(setPageCount), showHeaderFooter = showHeaderFooter.asInstanceOf[js.Any], showPageSetupDialog = js.Any.fromFunction0(showPageSetupDialog), showPrintDialog = js.Any.fromFunction0(showPrintDialog), shrinkToFit = shrinkToFit.asInstanceOf[js.Any], startDoc = js.Any.fromFunction1(startDoc), startPrint = js.Any.fromFunction0(startPrint), stopDoc = js.Any.fromFunction0(stopDoc), tableOfLinks = tableOfLinks.asInstanceOf[js.Any], unprintableBottom = unprintableBottom.asInstanceOf[js.Any], unprintableLeft = unprintableLeft.asInstanceOf[js.Any], unprintableRight = unprintableRight.asInstanceOf[js.Any], unprintableTop = unprintableTop.asInstanceOf[js.Any], updatePageStatus = js.Any.fromFunction1(updatePageStatus), usePrinterCopyCollate = usePrinterCopyCollate.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CPrintManagerTemplatePrinter_typekey")(MSHTMLDotCPrintManagerTemplatePrinter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPrintManagerTemplatePrinter]
  }
  @scala.inline
  implicit class CPrintManagerTemplatePrinterOps[Self <: CPrintManagerTemplatePrinter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotCPrintManagerTemplatePrinter_typekey(value: CPrintManagerTemplatePrinter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.CPrintManagerTemplatePrinter_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllLinkedDocuments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allLinkedDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPageAvail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageAvail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceSupports(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSupports")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawPreviewPage(value: (js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPreviewPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDuplex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPrint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPrint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnsurePrintDialogDefaults(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensurePrintDialogDefaults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameActiveEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameActiveEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameAsShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameAsShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramesetDocument(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesetDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPageMarginBottom(value: (js.Any, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginBottom")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPageMarginBottomImportant(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginBottomImportant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPageMarginLeft(value: (js.Any, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginLeft")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPageMarginLeftImportant(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginLeftImportant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPageMarginRight(value: (js.Any, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginRight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPageMarginRightImportant(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginRightImportant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPageMarginTop(value: (js.Any, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginTop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPageMarginTopImportant(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageMarginTopImportant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPrintTaskOptionValue(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrintTaskOptionValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFooterFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFooterFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidatePreview(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidatePreview")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintBlankPage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBlankPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintNonNative(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printNonNative")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrintNonNativeFrames(value: (js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printNonNativeFrames")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrintPage(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectedPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPageCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowHeaderFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPageSetupDialog(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageSetupDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowPrintDialog(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrintDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShrinkToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDoc(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDoc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartPrint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPrint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopDoc(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDoc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTableOfLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOfLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprintableBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprintableBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprintableLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprintableLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprintableRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprintableRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprintableTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprintableTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatePageStatus(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePageStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUsePrinterCopyCollate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrinterCopyCollate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

