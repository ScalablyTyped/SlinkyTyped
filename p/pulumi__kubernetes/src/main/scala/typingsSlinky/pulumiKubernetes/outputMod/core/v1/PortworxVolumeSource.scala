package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PortworxVolumeSource represents a Portworx volume resource.
  */
@js.native
trait PortworxVolumeSource extends js.Object {
  /**
    * FSType represents the filesystem type to mount Must be a filesystem type supported by the
    * host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean = js.native
  /**
    * VolumeID uniquely identifies a Portworx volume
    */
  val volumeID: String = js.native
}

object PortworxVolumeSource {
  @scala.inline
  def apply(fsType: String, readOnly: Boolean, volumeID: String): PortworxVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortworxVolumeSource]
  }
  @scala.inline
  implicit class PortworxVolumeSourceOps[Self <: PortworxVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

