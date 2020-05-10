package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintToPDFOptions extends js.Object {
  /**
    * true for landscape, false for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the type of margins to use. Uses 0 for default margin, 1 for no
    * margin, and 2 for minimum margin.
    */
  var marginsType: js.UndefOr[Double] = js.native
  /**
    * Specify page size of the generated PDF. Can be A3, A4, A5, Legal, Letter,
    * Tabloid or an Object containing height and width in microns.
    */
  var pageSize: js.UndefOr[String | Size] = js.native
  /**
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  /**
    * Whether to print selection only.
    */
  var printSelectionOnly: js.UndefOr[Boolean] = js.native
}

object PrintToPDFOptions {
  @scala.inline
  def apply(): PrintToPDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintToPDFOptions]
  }
  @scala.inline
  implicit class PrintToPDFOptionsOps[Self <: PrintToPDFOptions] (val x: Self) extends AnyVal {
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
    def withPageSize(value: String | Size): Self = {
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
    @scala.inline
    def withPrintSelectionOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printSelectionOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintSelectionOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printSelectionOnly")(js.undefined)
        ret
    }
  }
  
}

