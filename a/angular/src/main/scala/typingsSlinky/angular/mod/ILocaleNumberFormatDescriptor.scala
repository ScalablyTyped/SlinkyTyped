package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocaleNumberFormatDescriptor extends js.Object {
  var CURRENCY_SYM: String = js.native
  var DECIMAL_SEP: String = js.native
  var GROUP_SEP: String = js.native
  var PATTERNS: js.Array[ILocaleNumberPatternDescriptor] = js.native
}

object ILocaleNumberFormatDescriptor {
  @scala.inline
  def apply(
    CURRENCY_SYM: String,
    DECIMAL_SEP: String,
    GROUP_SEP: String,
    PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
  ): ILocaleNumberFormatDescriptor = {
    val __obj = js.Dynamic.literal(CURRENCY_SYM = CURRENCY_SYM.asInstanceOf[js.Any], DECIMAL_SEP = DECIMAL_SEP.asInstanceOf[js.Any], GROUP_SEP = GROUP_SEP.asInstanceOf[js.Any], PATTERNS = PATTERNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleNumberFormatDescriptor]
  }
  @scala.inline
  implicit class ILocaleNumberFormatDescriptorOps[Self <: ILocaleNumberFormatDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCURRENCY_SYM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CURRENCY_SYM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDECIMAL_SEP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DECIMAL_SEP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGROUP_SEP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GROUP_SEP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPATTERNS(value: js.Array[ILocaleNumberPatternDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATTERNS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

