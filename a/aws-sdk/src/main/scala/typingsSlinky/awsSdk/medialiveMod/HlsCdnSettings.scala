package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsCdnSettings extends js.Object {
  var HlsAkamaiSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsAkamaiSettings] = js.native
  var HlsBasicPutSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsBasicPutSettings] = js.native
  var HlsMediaStoreSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsMediaStoreSettings] = js.native
  var HlsWebdavSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsWebdavSettings] = js.native
}

object HlsCdnSettings {
  @scala.inline
  def apply(): HlsCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCdnSettings]
  }
  @scala.inline
  implicit class HlsCdnSettingsOps[Self <: HlsCdnSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHlsAkamaiSettings(value: HlsAkamaiSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsAkamaiSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsAkamaiSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsAkamaiSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsBasicPutSettings(value: HlsBasicPutSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsBasicPutSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsBasicPutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsBasicPutSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsMediaStoreSettings(value: HlsMediaStoreSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsMediaStoreSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsMediaStoreSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsMediaStoreSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsWebdavSettings(value: HlsWebdavSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsWebdavSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsWebdavSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsWebdavSettings")(js.undefined)
        ret
    }
  }
  
}

