package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AttachedVolume describes a volume attached to a node
  */
@js.native
trait AttachedVolume extends js.Object {
  /**
    * DevicePath represents the device path where the volume should be available
    */
  var devicePath: Input[String] = js.native
  /**
    * Name of the attached volume
    */
  var name: Input[String] = js.native
}

object AttachedVolume {
  @scala.inline
  def apply(devicePath: Input[String], name: Input[String]): AttachedVolume = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedVolume]
  }
  @scala.inline
  implicit class AttachedVolumeOps[Self <: AttachedVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevicePath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

