package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveOutputSettings extends js.Object {
  /**
    * Settings specific to the container type of the file.
    */
  var ContainerSettings: ArchiveContainerSettings = js.native
  /**
    * Output file extension. If excluded, this will be auto-selected from the container type.
    */
  var Extension: js.UndefOr[string] = js.native
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[string] = js.native
}

object ArchiveOutputSettings {
  @scala.inline
  def apply(ContainerSettings: ArchiveContainerSettings): ArchiveOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveOutputSettings]
  }
  @scala.inline
  implicit class ArchiveOutputSettingsOps[Self <: ArchiveOutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerSettings(value: ArchiveContainerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(js.undefined)
        ret
    }
    @scala.inline
    def withNameModifier(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(js.undefined)
        ret
    }
  }
  
}

