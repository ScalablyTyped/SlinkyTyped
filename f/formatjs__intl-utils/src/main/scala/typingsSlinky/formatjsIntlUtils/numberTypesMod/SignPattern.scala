package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignPattern extends js.Object {
  var negativePattern: String = js.native
  var positivePattern: String = js.native
  var zeroPattern: String = js.native
}

object SignPattern {
  @scala.inline
  def apply(negativePattern: String, positivePattern: String, zeroPattern: String): SignPattern = {
    val __obj = js.Dynamic.literal(negativePattern = negativePattern.asInstanceOf[js.Any], positivePattern = positivePattern.asInstanceOf[js.Any], zeroPattern = zeroPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignPattern]
  }
  @scala.inline
  implicit class SignPatternOps[Self <: SignPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNegativePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositivePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positivePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroPattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

