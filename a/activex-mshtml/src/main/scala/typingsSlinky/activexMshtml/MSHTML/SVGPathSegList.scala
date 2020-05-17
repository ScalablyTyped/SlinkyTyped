package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegList extends js.Object {
  @JSName("MSHTML.SVGPathSegList_typekey")
  var MSHTMLDotSVGPathSegList_typekey: SVGPathSegList = js.native
  var numberOfItems: Double = js.native
  def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): SVGPathSeg = js.native
  def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
  def removeItem(index: Double): SVGPathSeg = js.native
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
}

object SVGPathSegList {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegList_typekey: SVGPathSegList,
    appendItem: SVGPathSeg => SVGPathSeg,
    clear: () => Unit,
    getItem: Double => SVGPathSeg,
    initialize: SVGPathSeg => SVGPathSeg,
    insertItemBefore: (SVGPathSeg, Double) => SVGPathSeg,
    numberOfItems: Double,
    removeItem: Double => SVGPathSeg,
    replaceItem: (SVGPathSeg, Double) => SVGPathSeg
  ): SVGPathSegList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGPathSegList_typekey")(MSHTMLDotSVGPathSegList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegList]
  }
  @scala.inline
  implicit class SVGPathSegListOps[Self <: SVGPathSegList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathSegList_typekey(value: SVGPathSegList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathSegList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendItem(value: SVGPathSeg => SVGPathSeg): Self = {
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
    def withGetItem(value: Double => SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: SVGPathSeg => SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItemBefore(value: (SVGPathSeg, Double) => SVGPathSeg): Self = {
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
    def withRemoveItem(value: Double => SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceItem(value: (SVGPathSeg, Double) => SVGPathSeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

