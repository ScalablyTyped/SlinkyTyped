package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for hangouts chat export.
  */
@js.native
trait SchemaHangoutsChatExportOptions extends js.Object {
  /**
    * The export format for hangouts chat export.
    */
  var exportFormat: js.UndefOr[String] = js.native
}

object SchemaHangoutsChatExportOptions {
  @scala.inline
  def apply(): SchemaHangoutsChatExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatExportOptions]
  }
  @scala.inline
  implicit class SchemaHangoutsChatExportOptionsOps[Self <: SchemaHangoutsChatExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFormat")(js.undefined)
        ret
    }
  }
  
}

