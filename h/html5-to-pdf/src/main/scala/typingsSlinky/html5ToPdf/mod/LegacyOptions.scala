package typingsSlinky.html5ToPdf.mod

import typingsSlinky.html5ToPdf.html5ToPdfStrings.A3
import typingsSlinky.html5ToPdf.html5ToPdfStrings.A4
import typingsSlinky.html5ToPdf.html5ToPdfStrings.Legal
import typingsSlinky.html5ToPdf.html5ToPdfStrings.Tabloid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyOptions extends js.Object {
  /**
    * [COMPATIBLE]\
    * True for landscape, false for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  /**
    * [NOT COMPATIBLE]\
    * 0 - default\
    * 1 - none\
    * 2 - minimum
    */
  var marginsType: js.UndefOr[Double] = js.native
  /**
    * [COMPATIBLE]\
    * Page size
    */
  var pageSize: js.UndefOr[A3 | A4 | Legal | Tabloid] = js.native
  /**
    * [COMPATIBLE]\
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
}

object LegacyOptions {
  @scala.inline
  def apply(): LegacyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyOptions]
  }
  @scala.inline
  implicit class LegacyOptionsOps[Self <: LegacyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginsType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginsType")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: A3 | A4 | Legal | Tabloid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBackground")(js.undefined)
        ret
    }
  }
  
}

