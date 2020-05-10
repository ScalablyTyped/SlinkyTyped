package typingsSlinky.jupyterlabExtensionmanager.companionsMod

import typingsSlinky.jupyterlabExtensionmanager.AnonDiscovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJupyterLabPackageData extends js.Object {
  var jupyterlab: js.UndefOr[AnonDiscovery] = js.native
}

object IJupyterLabPackageData {
  @scala.inline
  def apply(): IJupyterLabPackageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJupyterLabPackageData]
  }
  @scala.inline
  implicit class IJupyterLabPackageDataOps[Self <: IJupyterLabPackageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJupyterlab(value: AnonDiscovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jupyterlab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJupyterlab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jupyterlab")(js.undefined)
        ret
    }
  }
  
}

