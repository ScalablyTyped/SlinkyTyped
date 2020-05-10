package typingsSlinky.pulumiKubernetes.inputMod.policy.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
  */
@js.native
trait AllowedFlexVolume extends js.Object {
  /**
    * driver is the name of the Flexvolume driver.
    */
  var driver: Input[String] = js.native
}

object AllowedFlexVolume {
  @scala.inline
  def apply(driver: Input[String]): AllowedFlexVolume = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedFlexVolume]
  }
  @scala.inline
  implicit class AllowedFlexVolumeOps[Self <: AllowedFlexVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

