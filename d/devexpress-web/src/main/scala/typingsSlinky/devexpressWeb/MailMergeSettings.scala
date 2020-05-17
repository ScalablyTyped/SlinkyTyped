package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to set up mail merge operations.
  */
@js.native
trait MailMergeSettings extends js.Object {
  /**
    * Gets or sets the index of the row from which the exported range starts.
    */
  var exportFrom: Double = js.native
  /**
    * Gets or sets the number of data rows in the exported mail-merge range.
    */
  var exportRecordsCount: Double = js.native
  /**
    * Gets or sets the merge mode.
    */
  var mergeMode: MergeMode = js.native
  /**
    * Specifies which data rows should be exported into a merged document.
    */
  var range: MailMergeExportRange = js.native
}

object MailMergeSettings {
  @scala.inline
  def apply(exportFrom: Double, exportRecordsCount: Double, mergeMode: MergeMode, range: MailMergeExportRange): MailMergeSettings = {
    val __obj = js.Dynamic.literal(exportFrom = exportFrom.asInstanceOf[js.Any], exportRecordsCount = exportRecordsCount.asInstanceOf[js.Any], mergeMode = mergeMode.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeSettings]
  }
  @scala.inline
  implicit class MailMergeSettingsOps[Self <: MailMergeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportRecordsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportRecordsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeMode(value: MergeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: MailMergeExportRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

