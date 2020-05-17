package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var cascade: Boolean = js.native
  var cols: Double = js.native
  var pickerPrefixCls: String = js.native
  var popupPrefixCls: String = js.native
  var prefixCls: String = js.native
  var title: String = js.native
  var triggerType: String = js.native
  def format(values: js.Array[String]): String = js.native
}

object Format {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[String] => String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    title: String,
    triggerType: String
  ): Format = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCascade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: js.Array[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPickerPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

