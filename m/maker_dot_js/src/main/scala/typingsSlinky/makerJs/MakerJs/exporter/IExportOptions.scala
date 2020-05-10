package typingsSlinky.makerJs.MakerJs.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  */
@js.native
trait IExportOptions extends js.Object {
  /**
    * Unit system to embed in exported file.
    */
  var units: js.UndefOr[String] = js.native
}

object IExportOptions {
  @scala.inline
  def apply(): IExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportOptions]
  }
  @scala.inline
  implicit class IExportOptionsOps[Self <: IExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

