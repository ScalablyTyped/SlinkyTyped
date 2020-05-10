package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteTranscodeSetting extends js.Object {
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SiteTranscodeSetting {
  @scala.inline
  def apply(): SiteTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteTranscodeSetting]
  }
  @scala.inline
  implicit class SiteTranscodeSettingOps[Self <: SiteTranscodeSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabledVideoFormats(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledVideoFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledVideoFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledVideoFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

