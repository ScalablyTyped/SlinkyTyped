package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper around an Element with a possible start and end offset. These offsets allow a
  * range of characters within a Text
  * element to be represented in search results, document selections, and named ranges.
  */
@js.native
trait RangeElement extends js.Object {
  def getElement(): Element = js.native
  def getEndOffsetInclusive(): Integer = js.native
  def getStartOffset(): Integer = js.native
  def isPartial(): Boolean = js.native
}

object RangeElement {
  @scala.inline
  def apply(
    getElement: () => Element,
    getEndOffsetInclusive: () => Integer,
    getStartOffset: () => Integer,
    isPartial: () => Boolean
  ): RangeElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getEndOffsetInclusive = js.Any.fromFunction0(getEndOffsetInclusive), getStartOffset = js.Any.fromFunction0(getStartOffset), isPartial = js.Any.fromFunction0(isPartial))
    __obj.asInstanceOf[RangeElement]
  }
  @scala.inline
  implicit class RangeElementOps[Self <: RangeElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElement(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndOffsetInclusive(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndOffsetInclusive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStartOffset(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPartial(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartial")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

