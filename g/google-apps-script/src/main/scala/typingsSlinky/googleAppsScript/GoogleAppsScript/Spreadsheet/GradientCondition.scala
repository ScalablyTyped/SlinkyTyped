package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access gradient (color) conditions in ConditionalFormatRuleApis.
  * Each conditional format rule may contain a single gradient condition. A gradient condition is
  * defined by three points along a number scale (min, mid, and max), each of which has a color, a
  * value, and a InterpolationType. The content of a cell is
  * compared to the values in the number scale and the color applied to the cell is interpolated
  * based on the cell content's proximity to the gradient condition min, mid, and max points.
  *
  *     // Logs all the information inside gradient conditional format rules on a sheet.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var rules = sheet.getConditionalFormatRules();
  *     for (int i = 0; i < rules.length; i++) {
  *       var gradient = rules[i].getGradientCondition();
  *       Logger.log("The conditional format gradient information for rule %d:\n
  *         MinColor %s, MinType %s, MinValue %s, \n
  *         MidColor %s, MidType %s, MidValue %s, \n
  *         MaxColor %s, MaxType %s, MaxValue %s \n", i,
  *         gradient.getMinColor(), gradient.getMinType(), gradient.getMinValue(),
  *         gradient.getMidColor(), gradient.getMidType(), gradient.getMidValue(),
  *         gradient.getMaxColor(), gradient.getMaxType(), gradient.getMaxValue());
  *     }
  */
@js.native
trait GradientCondition extends js.Object {
  def getMaxColor(): String = js.native
  def getMaxType(): InterpolationType | Null = js.native
  def getMaxValue(): String = js.native
  def getMidColor(): String = js.native
  def getMidType(): InterpolationType | Null = js.native
  def getMidValue(): String = js.native
  def getMinColor(): String = js.native
  def getMinType(): InterpolationType | Null = js.native
  def getMinValue(): String = js.native
}

object GradientCondition {
  @scala.inline
  def apply(
    getMaxColor: () => String,
    getMaxType: () => InterpolationType | Null,
    getMaxValue: () => String,
    getMidColor: () => String,
    getMidType: () => InterpolationType | Null,
    getMidValue: () => String,
    getMinColor: () => String,
    getMinType: () => InterpolationType | Null,
    getMinValue: () => String
  ): GradientCondition = {
    val __obj = js.Dynamic.literal(getMaxColor = js.Any.fromFunction0(getMaxColor), getMaxType = js.Any.fromFunction0(getMaxType), getMaxValue = js.Any.fromFunction0(getMaxValue), getMidColor = js.Any.fromFunction0(getMidColor), getMidType = js.Any.fromFunction0(getMidType), getMidValue = js.Any.fromFunction0(getMidValue), getMinColor = js.Any.fromFunction0(getMinColor), getMinType = js.Any.fromFunction0(getMinType), getMinValue = js.Any.fromFunction0(getMinValue))
    __obj.asInstanceOf[GradientCondition]
  }
  @scala.inline
  implicit class GradientConditionOps[Self <: GradientCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMaxColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxType(value: () => InterpolationType | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMidColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMidColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMidType(value: () => InterpolationType | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMidType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMidValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMidValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinType(value: () => InterpolationType | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

