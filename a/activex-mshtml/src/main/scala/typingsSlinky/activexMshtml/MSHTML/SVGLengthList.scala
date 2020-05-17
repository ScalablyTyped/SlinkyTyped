package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGLengthList extends js.Object {
  @JSName("MSHTML.SVGLengthList_typekey")
  var MSHTMLDotSVGLengthList_typekey: SVGLengthList = js.native
  var numberOfItems: Double = js.native
  def appendItem(newItem: SVGLength): SVGLength = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): SVGLength = js.native
  def initialize(newItem: SVGLength): SVGLength = js.native
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength = js.native
  def removeItem(index: Double): SVGLength = js.native
  def replaceItem(newItem: SVGLength, index: Double): SVGLength = js.native
}

object SVGLengthList {
  @scala.inline
  def apply(
    MSHTMLDotSVGLengthList_typekey: SVGLengthList,
    appendItem: SVGLength => SVGLength,
    clear: () => Unit,
    getItem: Double => SVGLength,
    initialize: SVGLength => SVGLength,
    insertItemBefore: (SVGLength, Double) => SVGLength,
    numberOfItems: Double,
    removeItem: Double => SVGLength,
    replaceItem: (SVGLength, Double) => SVGLength
  ): SVGLengthList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGLengthList_typekey")(MSHTMLDotSVGLengthList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLengthList]
  }
  @scala.inline
  implicit class SVGLengthListOps[Self <: SVGLengthList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGLengthList_typekey(value: SVGLengthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGLengthList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendItem(value: SVGLength => SVGLength): Self = {
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
    def withGetItem(value: Double => SVGLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: SVGLength => SVGLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItemBefore(value: (SVGLength, Double) => SVGLength): Self = {
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
    def withRemoveItem(value: Double => SVGLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceItem(value: (SVGLength, Double) => SVGLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

