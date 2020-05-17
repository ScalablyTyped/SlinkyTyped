package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One number format code and its attributes, returned in a sequence by {@link XLocaleData.getAllFormats()} .
  *
  * Contains raw data defined in the XML locale data files.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait FormatElement extends js.Object {
  /** The format code, for example, "YYYY-MM-DD". */
  var formatCode: String = js.native
  /** The index used by the number formatter, predefined values corresponding with {@link NumberFormatIndex} values. */
  var formatIndex: Double = js.native
  /** A unique (within one locale) identifier. */
  var formatKey: String = js.native
  /** A name or description that is displayed in the number formatter dialog. */
  var formatName: String = js.native
  /** Type may be one of "short", "medium", "long". */
  var formatType: String = js.native
  /** Usage category, for example, "DATE" or "FIXED_NUMBER", corresponding with {@link KNumberFormatUsage} values. */
  var formatUsage: String = js.native
  /** If a format code is the default code of a **formatType** group. */
  var isDefault: Boolean = js.native
}

object FormatElement {
  @scala.inline
  def apply(
    formatCode: String,
    formatIndex: Double,
    formatKey: String,
    formatName: String,
    formatType: String,
    formatUsage: String,
    isDefault: Boolean
  ): FormatElement = {
    val __obj = js.Dynamic.literal(formatCode = formatCode.asInstanceOf[js.Any], formatIndex = formatIndex.asInstanceOf[js.Any], formatKey = formatKey.asInstanceOf[js.Any], formatName = formatName.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any], formatUsage = formatUsage.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatElement]
  }
  @scala.inline
  implicit class FormatElementOps[Self <: FormatElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatUsage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

