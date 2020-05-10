package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API
  * volumes support ownership management and SELinux relabeling.
  */
@js.native
trait DownwardAPIVolumeSource extends js.Object {
  /**
    * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
    * Defaults to 0644. Directories within the path are not affected by this setting. This might
    * be in conflict with other options that affect the file mode, like fsGroup, and the result
    * can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.native
  /**
    * Items is a list of downward API volume file
    */
  var items: js.UndefOr[Input[js.Array[Input[DownwardAPIVolumeFile]]]] = js.native
}

object DownwardAPIVolumeSource {
  @scala.inline
  def apply(): DownwardAPIVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownwardAPIVolumeSource]
  }
  @scala.inline
  implicit class DownwardAPIVolumeSourceOps[Self <: DownwardAPIVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultMode(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMode")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Input[js.Array[Input[DownwardAPIVolumeFile]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

