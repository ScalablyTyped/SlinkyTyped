package typingsSlinky.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollections extends js.Object {
  var collections: js.Any = js.native
  var events: js.Any = js.native
  var pageSize: AnonGetHeight = js.native
  var pages: js.Array[Double] = js.native
  var scaleFactor: Double = js.native
  def f2(number: Double): Double = js.native
  def getCoordinateString(value: Double): Double = js.native
  def getCurrentPageInfo(): js.Any = js.native
  def getFont(): js.Any = js.native
  def getFontSize(): Double = js.native
  def getLineHeight(): Double = js.native
  def getNumberOfPages(): Double = js.native
  def getPageInfo(pageNumberOneBased: Double): js.Any = js.native
  def getStyle(style: String): js.Any = js.native
  def getVerticalCoordinateString(value: Double): Double = js.native
  def newAdditionalObject(): js.Any = js.native
  def newObject(): Double = js.native
  def newObjectDeferred(): Double = js.native
  def newObjectDeferredBegin(oid: Double): Unit = js.native
  def out(string: String): Unit = js.native
  def output(`type`: js.Any, options: js.Any): js.Any = js.native
  def pdfEscape(text: String, flags: js.Any): js.Any = js.native
  def putStream(str: String): Unit = js.native
  def write(string1: String): js.Any = js.native
}

object AnonCollections {
  @scala.inline
  def apply(
    collections: js.Any,
    events: js.Any,
    f2: Double => Double,
    getCoordinateString: Double => Double,
    getCurrentPageInfo: () => js.Any,
    getFont: () => js.Any,
    getFontSize: () => Double,
    getLineHeight: () => Double,
    getNumberOfPages: () => Double,
    getPageInfo: Double => js.Any,
    getStyle: String => js.Any,
    getVerticalCoordinateString: Double => Double,
    newAdditionalObject: () => js.Any,
    newObject: () => Double,
    newObjectDeferred: () => Double,
    newObjectDeferredBegin: Double => Unit,
    out: String => Unit,
    output: (js.Any, js.Any) => js.Any,
    pageSize: AnonGetHeight,
    pages: js.Array[Double],
    pdfEscape: (String, js.Any) => js.Any,
    putStream: String => Unit,
    scaleFactor: Double,
    write: String => js.Any
  ): AnonCollections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], f2 = js.Any.fromFunction1(f2), getCoordinateString = js.Any.fromFunction1(getCoordinateString), getCurrentPageInfo = js.Any.fromFunction0(getCurrentPageInfo), getFont = js.Any.fromFunction0(getFont), getFontSize = js.Any.fromFunction0(getFontSize), getLineHeight = js.Any.fromFunction0(getLineHeight), getNumberOfPages = js.Any.fromFunction0(getNumberOfPages), getPageInfo = js.Any.fromFunction1(getPageInfo), getStyle = js.Any.fromFunction1(getStyle), getVerticalCoordinateString = js.Any.fromFunction1(getVerticalCoordinateString), newAdditionalObject = js.Any.fromFunction0(newAdditionalObject), newObject = js.Any.fromFunction0(newObject), newObjectDeferred = js.Any.fromFunction0(newObjectDeferred), newObjectDeferredBegin = js.Any.fromFunction1(newObjectDeferredBegin), out = js.Any.fromFunction1(out), output = js.Any.fromFunction2(output), pageSize = pageSize.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], pdfEscape = js.Any.fromFunction2(pdfEscape), putStream = js.Any.fromFunction1(putStream), scaleFactor = scaleFactor.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[AnonCollections]
  }
  @scala.inline
  implicit class AnonCollectionsOps[Self <: AnonCollections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF2(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f2")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCoordinateString(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordinateString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentPageInfo(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPageInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFont(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFont")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumberOfPages(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberOfPages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPageInfo(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStyle(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVerticalCoordinateString(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVerticalCoordinateString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewAdditionalObject(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAdditionalObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewObject(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewObjectDeferred(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newObjectDeferred")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewObjectDeferredBegin(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newObjectDeferredBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOut(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutput(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPageSize(value: AnonGetHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPdfEscape(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfEscape")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPutStream(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

