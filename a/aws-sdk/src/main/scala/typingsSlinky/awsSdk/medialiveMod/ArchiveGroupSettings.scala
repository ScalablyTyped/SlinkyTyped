package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveGroupSettings extends js.Object {
  /**
    * A directory and base filename where archive files should be written.
    */
  var Destination: OutputLocationRef = js.native
  /**
    * Number of seconds to write to archive file before closing and starting a new one.
    */
  var RolloverInterval: js.UndefOr[integerMin1] = js.native
}

object ArchiveGroupSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): ArchiveGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveGroupSettings]
  }
  @scala.inline
  implicit class ArchiveGroupSettingsOps[Self <: ArchiveGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: OutputLocationRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRolloverInterval(value: integerMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RolloverInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolloverInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RolloverInterval")(js.undefined)
        ret
    }
  }
  
}

