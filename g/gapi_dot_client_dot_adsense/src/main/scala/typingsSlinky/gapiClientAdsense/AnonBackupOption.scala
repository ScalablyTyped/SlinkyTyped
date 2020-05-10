package typingsSlinky.gapiClientAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackupOption extends js.Object {
  /** The backup option to be used in instances where no ad is available. */
  var backupOption: js.UndefOr[AnonColor] = js.native
  /** Size of this ad unit. */
  var size: js.UndefOr[String] = js.native
  /** Type of this ad unit. */
  var `type`: js.UndefOr[String] = js.native
}

object AnonBackupOption {
  @scala.inline
  def apply(): AnonBackupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBackupOption]
  }
  @scala.inline
  implicit class AnonBackupOptionOps[Self <: AnonBackupOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupOption(value: AnonColor): Self = {
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

