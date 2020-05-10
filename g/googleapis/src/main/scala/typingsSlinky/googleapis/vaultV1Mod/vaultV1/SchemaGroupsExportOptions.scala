package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for groups export.
  */
@js.native
trait SchemaGroupsExportOptions extends js.Object {
  /**
    * The export format for groups export.
    */
  var exportFormat: js.UndefOr[String] = js.native
}

object SchemaGroupsExportOptions {
  @scala.inline
  def apply(): SchemaGroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupsExportOptions]
  }
  @scala.inline
  implicit class SchemaGroupsExportOptionsOps[Self <: SchemaGroupsExportOptions] (val x: Self) extends AnyVal {
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

