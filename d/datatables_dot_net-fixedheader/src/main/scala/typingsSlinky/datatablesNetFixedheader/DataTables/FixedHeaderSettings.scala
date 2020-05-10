package typingsSlinky.datatablesNetFixedheader.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * FixedHeader extension options
  */
@js.native
trait FixedHeaderSettings extends js.Object {
  /*
    * Enable / disable fixed footer
    */
  var footer: js.UndefOr[Boolean] = js.native
  /*
    * Offset the table's fixed footer
    */
  var footerOffset: js.UndefOr[Double] = js.native
  /*
    * Enable / disable fixed header
    */
  var header: js.UndefOr[Boolean] = js.native
  /*
    * Offset the table's fixed header
    */
  var headerOffset: js.UndefOr[Double] = js.native
}

object FixedHeaderSettings {
  @scala.inline
  def apply(): FixedHeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedHeaderSettings]
  }
  @scala.inline
  implicit class FixedHeaderSettingsOps[Self <: FixedHeaderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerOffset")(js.undefined)
        ret
    }
  }
  
}

