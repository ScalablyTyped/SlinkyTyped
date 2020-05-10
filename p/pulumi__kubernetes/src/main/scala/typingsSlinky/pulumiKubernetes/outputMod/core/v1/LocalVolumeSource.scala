package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Local represents directly-attached storage with node affinity (Beta feature)
  */
@js.native
trait LocalVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. It applies only when the Path is a block device. Must be a
    * filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The
    * default value is to auto-select a fileystem if unspecified.
    */
  val fsType: String = js.native
  /**
    * The full path to the volume on the node. It can be either a directory or block device
    * (disk, partition, ...).
    */
  val path: String = js.native
}

object LocalVolumeSource {
  @scala.inline
  def apply(fsType: String, path: String): LocalVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVolumeSource]
  }
  @scala.inline
  implicit class LocalVolumeSourceOps[Self <: LocalVolumeSource] (val x: Self) extends AnyVal {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

