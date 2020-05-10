package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CuepointSettings extends js.Object {
  var cueType: js.UndefOr[String] = js.native
  var durationSecs: js.UndefOr[Double] = js.native
  var offsetTimeMs: js.UndefOr[String] = js.native
  var walltime: js.UndefOr[String] = js.native
}

object CuepointSettings {
  @scala.inline
  def apply(): CuepointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CuepointSettings]
  }
  @scala.inline
  implicit class CuepointSettingsOps[Self <: CuepointSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cueType")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationSecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withWalltime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walltime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalltime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walltime")(js.undefined)
        ret
    }
  }
  
}

