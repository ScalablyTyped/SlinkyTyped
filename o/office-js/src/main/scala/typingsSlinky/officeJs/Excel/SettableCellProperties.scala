package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setCellProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait SettableCellProperties extends js.Object {
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[CellPropertiesFormat] = js.native
  /**
    *
    * Represents the `hyperlink` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.native
  /**
    *
    * Represents the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[String] = js.native
}

object SettableCellProperties {
  @scala.inline
  def apply(): SettableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableCellProperties]
  }
  @scala.inline
  implicit class SettableCellPropertiesOps[Self <: SettableCellProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: CellPropertiesFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlink(value: RangeHyperlink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

