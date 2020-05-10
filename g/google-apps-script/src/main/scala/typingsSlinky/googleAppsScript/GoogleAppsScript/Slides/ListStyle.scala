package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list styling for a range of text.
  */
@js.native
trait ListStyle extends js.Object {
  def applyListPreset(listPreset: ListPreset): ListStyle = js.native
  def getGlyph(): String = js.native
  def getList(): List = js.native
  def getNestingLevel(): Integer = js.native
  def isInList(): Boolean = js.native
  def removeFromList(): ListStyle = js.native
}

object ListStyle {
  @scala.inline
  def apply(
    applyListPreset: ListPreset => ListStyle,
    getGlyph: () => String,
    getList: () => List,
    getNestingLevel: () => Integer,
    isInList: () => Boolean,
    removeFromList: () => ListStyle
  ): ListStyle = {
    val __obj = js.Dynamic.literal(applyListPreset = js.Any.fromFunction1(applyListPreset), getGlyph = js.Any.fromFunction0(getGlyph), getList = js.Any.fromFunction0(getList), getNestingLevel = js.Any.fromFunction0(getNestingLevel), isInList = js.Any.fromFunction0(isInList), removeFromList = js.Any.fromFunction0(removeFromList))
    __obj.asInstanceOf[ListStyle]
  }
  @scala.inline
  implicit class ListStyleOps[Self <: ListStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyListPreset(value: ListPreset => ListStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyListPreset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGlyph(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGlyph")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetList(value: () => List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNestingLevel(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNestingLevel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInList(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveFromList(value: () => ListStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromList")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

