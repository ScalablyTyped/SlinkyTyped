package typingsSlinky.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiscovery extends js.Object {
  var discovery: js.UndefOr[AnonKernel] = js.native
}

object AnonDiscovery {
  @scala.inline
  def apply(): AnonDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDiscovery]
  }
  @scala.inline
  implicit class AnonDiscoveryOps[Self <: AnonDiscovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscovery(value: AnonKernel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovery")(js.undefined)
        ret
    }
  }
  
}

