package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element of text that is dynamically replaced with content that can change over time, such as a
  * slide number.
  */
@js.native
trait AutoText extends js.Object {
  def getAutoTextType(): AutoTextType = js.native
  def getIndex(): Integer = js.native
  def getRange(): TextRange = js.native
}

object AutoText {
  @scala.inline
  def apply(getAutoTextType: () => AutoTextType, getIndex: () => Integer, getRange: () => TextRange): AutoText = {
    val __obj = js.Dynamic.literal(getAutoTextType = js.Any.fromFunction0(getAutoTextType), getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
    __obj.asInstanceOf[AutoText]
  }
  @scala.inline
  implicit class AutoTextOps[Self <: AutoText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAutoTextType(value: () => AutoTextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoTextType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRange(value: () => TextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

