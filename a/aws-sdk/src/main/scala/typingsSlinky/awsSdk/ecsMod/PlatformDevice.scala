package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformDevice extends js.Object {
  /**
    * The ID for the GPU(s) on the container instance. The available GPU IDs can also be obtained on the container instance in the /var/lib/ecs/gpu/nvidia_gpu_info.json file.
    */
  var id: String = js.native
  /**
    * The type of device that is available on the container instance. The only supported value is GPU.
    */
  var `type`: PlatformDeviceType = js.native
}

object PlatformDevice {
  @scala.inline
  def apply(id: String, `type`: PlatformDeviceType): PlatformDevice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformDevice]
  }
  @scala.inline
  implicit class PlatformDeviceOps[Self <: PlatformDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PlatformDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

