package typingsSlinky.eggMultipart.anon

import typingsSlinky.eggMultipart.ScheduleOptions
import typingsSlinky.eggMultipart.mod.Context
import typingsSlinky.eggMultipart.mod.MatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFields extends js.Object {
  var autoFields: js.UndefOr[Boolean] = js.native
  var cleanSchedule: js.UndefOr[ScheduleOptions] = js.native
  var defaultCharset: js.UndefOr[String] = js.native
  var fieldNameSize: js.UndefOr[Double] = js.native
  var fieldSize: js.UndefOr[String | Double] = js.native
  var fields: js.UndefOr[Double] = js.native
  var fileExtensions: js.UndefOr[js.Array[String]] = js.native
  var fileModeMatch: js.UndefOr[MatchItem | js.Array[MatchItem]] = js.native
  var fileSize: js.UndefOr[String | Double] = js.native
  var files: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var tmpdir: js.UndefOr[String] = js.native
  var whitelist: js.UndefOr[js.Function0[js.Array[String]] | js.Array[String]] = js.native
}

object AutoFields {
  @scala.inline
  def apply(): AutoFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFields]
  }
  @scala.inline
  implicit class AutoFieldsOps[Self <: AutoFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFields")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanSchedule(value: ScheduleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCharset")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldNameSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNameSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldNameSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNameSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileModeMatchFunction1(value: /* ctx */ Context => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModeMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFileModeMatchRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModeMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileModeMatch(value: MatchItem | js.Array[MatchItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModeMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileModeMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModeMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpdir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistFunction0(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWhitelist(value: js.Function0[js.Array[String]] | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

