package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPointList extends js.Object {
  @JSName("MSHTML.SVGPointList_typekey")
  var MSHTMLDotSVGPointList_typekey: SVGPointList = js.native
  var numberOfItems: Double = js.native
  def appendItem(pNewItem: SVGPoint): SVGPoint = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): SVGPoint = js.native
  def initialize(pNewItem: SVGPoint): SVGPoint = js.native
  def insertItemBefore(pNewItem: SVGPoint, index: Double): SVGPoint = js.native
  def removeItem(index: Double): SVGPoint = js.native
  def replaceItem(pNewItem: SVGPoint, index: Double): SVGPoint = js.native
}

object SVGPointList {
  @scala.inline
  def apply(
    MSHTMLDotSVGPointList_typekey: SVGPointList,
    appendItem: SVGPoint => SVGPoint,
    clear: () => Unit,
    getItem: Double => SVGPoint,
    initialize: SVGPoint => SVGPoint,
    insertItemBefore: (SVGPoint, Double) => SVGPoint,
    numberOfItems: Double,
    removeItem: Double => SVGPoint,
    replaceItem: (SVGPoint, Double) => SVGPoint
  ): SVGPointList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGPointList_typekey")(MSHTMLDotSVGPointList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPointList]
  }
  @scala.inline
  implicit class SVGPointListOps[Self <: SVGPointList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPointList_typekey(value: SVGPointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPointList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendItem(value: SVGPoint => SVGPoint): Self = {
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
    def withGetItem(value: Double => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: SVGPoint => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItemBefore(value: (SVGPoint, Double) => SVGPoint): Self = {
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
    def withRemoveItem(value: Double => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceItem(value: (SVGPoint, Double) => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

