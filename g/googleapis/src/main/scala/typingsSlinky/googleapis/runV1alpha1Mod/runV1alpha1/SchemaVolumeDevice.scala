package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
@js.native
trait SchemaVolumeDevice extends js.Object {
  /**
    * devicePath is the path inside of the container that the device will be
    * mapped to.
    */
  var devicePath: js.UndefOr[String] = js.native
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaVolumeDevice {
  @scala.inline
  def apply(): SchemaVolumeDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeDevice]
  }
  @scala.inline
  implicit class SchemaVolumeDeviceOps[Self <: SchemaVolumeDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePath")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

