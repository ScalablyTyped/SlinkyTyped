package typingsSlinky.pdfjsDist.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFAnnotations extends js.Object {
  def getData(): PDFAnnotationData = js.native
   // throw new NotImplementedException()
  def getEmptyContainer(tagName: String, rect: js.Array[Double]): HTMLElement = js.native
   // always false
  def getHtmlElement(commonOjbs: js.Any): HTMLElement = js.native
  def getOperatorList(evaluator: js.Any): PDFPromise[_] = js.native
  def hasHtml(): Boolean = js.native
   // deprecated
  def isViewable(): Boolean = js.native
  def loadResources(keys: js.Any): PDFPromise[_] = js.native
}

object PDFAnnotations {
  @scala.inline
  def apply(
    getData: () => PDFAnnotationData,
    getEmptyContainer: (String, js.Array[Double]) => HTMLElement,
    getHtmlElement: js.Any => HTMLElement,
    getOperatorList: js.Any => PDFPromise[_],
    hasHtml: () => Boolean,
    isViewable: () => Boolean,
    loadResources: js.Any => PDFPromise[_]
  ): PDFAnnotations = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getEmptyContainer = js.Any.fromFunction2(getEmptyContainer), getHtmlElement = js.Any.fromFunction1(getHtmlElement), getOperatorList = js.Any.fromFunction1(getOperatorList), hasHtml = js.Any.fromFunction0(hasHtml), isViewable = js.Any.fromFunction0(isViewable), loadResources = js.Any.fromFunction1(loadResources))
    __obj.asInstanceOf[PDFAnnotations]
  }
  @scala.inline
  implicit class PDFAnnotationsOps[Self <: PDFAnnotations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetData(value: () => PDFAnnotationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEmptyContainer(value: (String, js.Array[Double]) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmptyContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetHtmlElement(value: js.Any => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHtmlElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOperatorList(value: js.Any => PDFPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOperatorList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasHtml(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsViewable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViewable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadResources(value: js.Any => PDFPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadResources")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

