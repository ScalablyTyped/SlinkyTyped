package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTransformList extends js.Object {
  @JSName("MSHTML.SVGTransformList_typekey")
  var MSHTMLDotSVGTransformList_typekey: SVGTransformList = js.native
  var numberOfItems: Double = js.native
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  def clear(): Unit = js.native
  def consolidate(): SVGTransform = js.native
  def createSVGTransformFromMatrix(newItem: SVGMatrix): SVGTransform = js.native
  def getItem(index: Double): SVGTransform = js.native
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  def removeItem(index: Double): SVGTransform = js.native
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
}

object SVGTransformList {
  @scala.inline
  def apply(
    MSHTMLDotSVGTransformList_typekey: SVGTransformList,
    appendItem: SVGTransform => SVGTransform,
    clear: () => Unit,
    consolidate: () => SVGTransform,
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    getItem: Double => SVGTransform,
    initialize: SVGTransform => SVGTransform,
    insertItemBefore: (SVGTransform, Double) => SVGTransform,
    numberOfItems: Double,
    removeItem: Double => SVGTransform,
    replaceItem: (SVGTransform, Double) => SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGTransformList_typekey")(MSHTMLDotSVGTransformList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransformList]
  }
  @scala.inline
  implicit class SVGTransformListOps[Self <: SVGTransformList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGTransformList_typekey(value: SVGTransformList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGTransformList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendItem(value: SVGTransform => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConsolidate(value: () => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGTransformFromMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: SVGTransform => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItemBefore(value: (SVGTransform, Double) => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertItemBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNumberOfItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveItem(value: Double => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceItem(value: (SVGTransform, Double) => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

