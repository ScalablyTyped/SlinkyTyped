package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
  */
@js.native
trait AllowedCSIDriver extends js.Object {
  /**
    * Name is the registered name of the CSI driver
    */
  val name: String = js.native
}

object AllowedCSIDriver {
  @scala.inline
  def apply(name: String): AllowedCSIDriver = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedCSIDriver]
  }
  @scala.inline
  implicit class AllowedCSIDriverOps[Self <: AllowedCSIDriver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

