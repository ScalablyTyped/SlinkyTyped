package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintToPDFOptions extends js.Object {
  /**
    * true for landscape, false for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the type of margins to use. Uses 0 for default margin, 1 for no
    * margin, and 2 for minimum margin.
    */
  var marginsType: js.UndefOr[Double] = js.undefined
  /**
    * Specify page size of the generated PDF. Can be A3, A4, A5, Legal, Letter,
    * Tabloid or an Object containing height and width in microns.
    */
  var pageSize: js.UndefOr[String | Size] = js.undefined
  /**
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to print selection only.
    */
  var printSelectionOnly: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMarginsType(value: Double): Self = this.set("marginsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginsType: Self = this.set("marginsType", js.undefined)
    @scala.inline
    def setPageSize(value: String | Size): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
    @scala.inline
    def setPrintSelectionOnly(value: Boolean): Self = this.set("printSelectionOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintSelectionOnly: Self = this.set("printSelectionOnly", js.undefined)
  }
  
}

