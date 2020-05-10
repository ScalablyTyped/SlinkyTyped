package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access boolean conditions in ConditionalFormatRules. Each
  * conditional format rule may contain a single boolean condition. The boolean condition itself
  * contains a boolean criteria (with values) and formatting settings. The criteria is evaluated
  * against the content of a cell resulting in either a true or false value. If the
  * criteria evaluates to true, the condition's formatting settings are applied to the cell.
  */
@js.native
trait BooleanCondition extends js.Object {
  def getBackground(): String | Null = js.native
  def getBold(): Boolean | Null = js.native
  def getCriteriaType(): BooleanCriteria = js.native
  def getCriteriaValues(): js.Array[_] = js.native
  def getFontColor(): String | Null = js.native
  def getItalic(): Boolean | Null = js.native
  def getStrikethrough(): Boolean | Null = js.native
  def getUnderline(): Boolean | Null = js.native
}

object BooleanCondition {
  @scala.inline
  def apply(
    getBackground: () => String | Null,
    getBold: () => Boolean | Null,
    getCriteriaType: () => BooleanCriteria,
    getCriteriaValues: () => js.Array[_],
    getFontColor: () => String | Null,
    getItalic: () => Boolean | Null,
    getStrikethrough: () => Boolean | Null,
    getUnderline: () => Boolean | Null
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = js.Any.fromFunction0(getBackground), getBold = js.Any.fromFunction0(getBold), getCriteriaType = js.Any.fromFunction0(getCriteriaType), getCriteriaValues = js.Any.fromFunction0(getCriteriaValues), getFontColor = js.Any.fromFunction0(getFontColor), getItalic = js.Any.fromFunction0(getItalic), getStrikethrough = js.Any.fromFunction0(getStrikethrough), getUnderline = js.Any.fromFunction0(getUnderline))
    __obj.asInstanceOf[BooleanCondition]
  }
  @scala.inline
  implicit class BooleanConditionOps[Self <: BooleanCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBackground(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBold(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCriteriaType(value: () => BooleanCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCriteriaType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCriteriaValues(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCriteriaValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontColor(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItalic(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItalic")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrikethrough(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrikethrough")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUnderline(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnderline")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

