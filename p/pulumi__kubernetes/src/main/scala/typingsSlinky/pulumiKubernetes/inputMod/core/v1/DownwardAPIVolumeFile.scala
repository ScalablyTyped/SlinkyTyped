package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DownwardAPIVolumeFile represents information to create the file containing the pod field
  */
@js.native
trait DownwardAPIVolumeFile extends js.Object {
  /**
    * Required: Selects a field of the pod: only annotations, labels, name and namespace are
    * supported.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelector]] = js.native
  /**
    * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
    * specified, the volume defaultMode will be used. This might be in conflict with other
    * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Input[Double]] = js.native
  /**
    * Required: Path is  the relative path name of the file to be created. Must not be absolute
    * or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must
    * not start with '..'
    */
  var path: Input[String] = js.native
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu,
    * limits.memory, requests.cpu and requests.memory) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelector]] = js.native
}

object DownwardAPIVolumeFile {
  @scala.inline
  def apply(path: Input[String]): DownwardAPIVolumeFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIVolumeFile]
  }
  @scala.inline
  implicit class DownwardAPIVolumeFileOps[Self <: DownwardAPIVolumeFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldRef(value: Input[ObjectFieldSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldRef")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceFieldRef(value: Input[ResourceFieldSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFieldRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceFieldRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFieldRef")(js.undefined)
        ret
    }
  }
  
}

