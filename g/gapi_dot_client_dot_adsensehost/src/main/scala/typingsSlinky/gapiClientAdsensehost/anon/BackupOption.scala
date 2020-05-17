package typingsSlinky.gapiClientAdsensehost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupOption extends js.Object {
  /** The backup option to be used in instances where no ad is available. */
  var backupOption: js.UndefOr[Color] = js.native
  /** Size of this ad unit. Size values are in the form SIZE_{width}_{height}. */
  var size: js.UndefOr[String] = js.native
  /** Type of this ad unit. Possible values are TEXT, TEXT_IMAGE, IMAGE and LINK. */
  var `type`: js.UndefOr[String] = js.native
}

object BackupOption {
  @scala.inline
  def apply(): BackupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupOption]
  }
  @scala.inline
  implicit class BackupOptionOps[Self <: BackupOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupOption(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

