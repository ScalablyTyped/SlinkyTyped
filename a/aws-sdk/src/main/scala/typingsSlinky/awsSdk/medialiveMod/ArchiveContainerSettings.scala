package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveContainerSettings extends js.Object {
  var M2tsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.M2tsSettings] = js.native
}

object ArchiveContainerSettings {
  @scala.inline
  def apply(): ArchiveContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveContainerSettings]
  }
  @scala.inline
  implicit class ArchiveContainerSettingsOps[Self <: ArchiveContainerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withM2tsSettings(value: M2tsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M2tsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM2tsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M2tsSettings")(js.undefined)
        ret
    }
  }
  
}

