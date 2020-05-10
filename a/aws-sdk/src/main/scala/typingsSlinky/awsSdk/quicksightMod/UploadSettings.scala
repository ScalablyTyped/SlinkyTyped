package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSettings extends js.Object {
  /**
    * Whether the file has a header row, or the files each have a header row.
    */
  var ContainsHeader: js.UndefOr[Boolean] = js.native
  /**
    * The delimiter between values in the file.
    */
  var Delimiter: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Delimiter] = js.native
  /**
    * File format.
    */
  var Format: js.UndefOr[FileFormat] = js.native
  /**
    * A row number to start reading data from.
    */
  var StartFromRow: js.UndefOr[PositiveInteger] = js.native
  /**
    * Text qualifier.
    */
  var TextQualifier: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.TextQualifier] = js.native
}

object UploadSettings {
  @scala.inline
  def apply(): UploadSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSettings]
  }
  @scala.inline
  implicit class UploadSettingsOps[Self <: UploadSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: Delimiter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: FileFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withStartFromRow(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartFromRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFromRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartFromRow")(js.undefined)
        ret
    }
    @scala.inline
    def withTextQualifier(value: TextQualifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextQualifier")(js.undefined)
        ret
    }
  }
  
}

