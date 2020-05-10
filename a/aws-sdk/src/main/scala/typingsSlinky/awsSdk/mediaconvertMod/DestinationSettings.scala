package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationSettings extends js.Object {
  /**
    * Settings associated with S3 destination
    */
  var S3Settings: js.UndefOr[S3DestinationSettings] = js.native
}

object DestinationSettings {
  @scala.inline
  def apply(): DestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationSettings]
  }
  @scala.inline
  implicit class DestinationSettingsOps[Self <: DestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Settings(value: S3DestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Settings")(js.undefined)
        ret
    }
  }
  
}

