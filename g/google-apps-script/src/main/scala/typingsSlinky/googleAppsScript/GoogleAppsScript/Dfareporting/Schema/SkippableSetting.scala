package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkippableSetting extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var progressOffset: js.UndefOr[VideoOffset] = js.native
  var skipOffset: js.UndefOr[VideoOffset] = js.native
  var skippable: js.UndefOr[Boolean] = js.native
}

object SkippableSetting {
  @scala.inline
  def apply(): SkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkippableSetting]
  }
  @scala.inline
  implicit class SkippableSettingOps[Self <: SkippableSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withProgressOffset(value: VideoOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipOffset(value: VideoOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippable")(js.undefined)
        ret
    }
  }
  
}

