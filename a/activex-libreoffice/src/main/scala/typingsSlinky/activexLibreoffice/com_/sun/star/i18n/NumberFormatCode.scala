package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Number format code information returned by various {@link XNumberFormatCode} methods. */
@js.native
trait NumberFormatCode extends js.Object {
  var Code: String = js.native
  var Default: Boolean = js.native
  var DefaultName: String = js.native
  var Index: Double = js.native
  var NameID: String = js.native
  var Type: Double = js.native
  var Usage: Double = js.native
}

object NumberFormatCode {
  @scala.inline
  def apply(
    Code: String,
    Default: Boolean,
    DefaultName: String,
    Index: Double,
    NameID: String,
    Type: Double,
    Usage: Double
  ): NumberFormatCode = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], DefaultName = DefaultName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], NameID = NameID.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Usage = Usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatCode]
  }
  @scala.inline
  implicit class NumberFormatCodeOps[Self <: NumberFormatCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Usage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

