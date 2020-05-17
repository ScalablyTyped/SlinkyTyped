package typingsSlinky.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discovery extends js.Object {
  var discovery: js.UndefOr[Kernel] = js.native
}

object Discovery {
  @scala.inline
  def apply(): Discovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discovery]
  }
  @scala.inline
  implicit class DiscoveryOps[Self <: Discovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscovery(value: Kernel): Self = {
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

