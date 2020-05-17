package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGNumberList extends js.Object {
  @JSName("MSHTML.SVGNumberList_typekey")
  var MSHTMLDotSVGNumberList_typekey: SVGNumberList = js.native
  var numberOfItems: Double = js.native
  def appendItem(newItem: SVGNumber): SVGNumber = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): SVGNumber = js.native
  def initialize(newItem: SVGNumber): SVGNumber = js.native
  def insertItemBefore(newItem: SVGNumber, index: Double): SVGNumber = js.native
  def removeItem(index: Double): SVGNumber = js.native
  def replaceItem(newItem: SVGNumber, index: Double): SVGNumber = js.native
}

object SVGNumberList {
  @scala.inline
  def apply(
    MSHTMLDotSVGNumberList_typekey: SVGNumberList,
    appendItem: SVGNumber => SVGNumber,
    clear: () => Unit,
    getItem: Double => SVGNumber,
    initialize: SVGNumber => SVGNumber,
    insertItemBefore: (SVGNumber, Double) => SVGNumber,
    numberOfItems: Double,
    removeItem: Double => SVGNumber,
    replaceItem: (SVGNumber, Double) => SVGNumber
  ): SVGNumberList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGNumberList_typekey")(MSHTMLDotSVGNumberList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumberList]
  }
  @scala.inline
  implicit class SVGNumberListOps[Self <: SVGNumberList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGNumberList_typekey(value: SVGNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGNumberList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendItem(value: SVGNumber => SVGNumber): Self = {
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
    def withGetItem(value: Double => SVGNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: SVGNumber => SVGNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItemBefore(value: (SVGNumber, Double) => SVGNumber): Self = {
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
    def withRemoveItem(value: Double => SVGNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceItem(value: (SVGNumber, Double) => SVGNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

