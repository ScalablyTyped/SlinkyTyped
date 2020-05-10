package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for mail export.
  */
@js.native
trait SchemaMailExportOptions extends js.Object {
  /**
    * The export file format.
    */
  var exportFormat: js.UndefOr[String] = js.native
  /**
    * Set to true to export confidential mode content.
    */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.native
}

object SchemaMailExportOptions {
  @scala.inline
  def apply(): SchemaMailExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailExportOptions]
  }
  @scala.inline
  implicit class SchemaMailExportOptionsOps[Self <: SchemaMailExportOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withShowConfidentialModeContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfidentialModeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConfidentialModeContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfidentialModeContent")(js.undefined)
        ret
    }
  }
  
}

