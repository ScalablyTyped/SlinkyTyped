package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.AnonDriverConfig
import typingsSlinky.dockerode.AnonPropagation
import typingsSlinky.dockerode.AnonSizeBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountSettings extends js.Object {
  var BindOptions: js.UndefOr[AnonPropagation] = js.native
  var Consistency: js.UndefOr[MountConsistency] = js.native
  var ReadOnly: js.UndefOr[Boolean] = js.native
  var Source: String = js.native
  var Target: String = js.native
  var TmpfsOptions: js.UndefOr[AnonSizeBytes] = js.native
  var Type: MountType = js.native
  var VolumeOptions: js.UndefOr[AnonDriverConfig] = js.native
}

object MountSettings {
  @scala.inline
  def apply(Source: String, Target: String, Type: MountType): MountSettings = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountSettings]
  }
  @scala.inline
  implicit class MountSettingsOps[Self <: MountSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindOptions(value: AnonPropagation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withConsistency(value: MountConsistency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Consistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Consistency")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpfsOptions(value: AnonSizeBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TmpfsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpfsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TmpfsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeOptions(value: AnonDriverConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeOptions")(js.undefined)
        ret
    }
  }
  
}

