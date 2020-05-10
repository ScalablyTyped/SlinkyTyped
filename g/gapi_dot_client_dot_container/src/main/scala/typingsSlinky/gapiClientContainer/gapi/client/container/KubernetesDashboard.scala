package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KubernetesDashboard extends js.Object {
  /** Whether the Kubernetes Dashboard is enabled for this cluster. */
  var disabled: js.UndefOr[Boolean] = js.native
}

object KubernetesDashboard {
  @scala.inline
  def apply(): KubernetesDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesDashboard]
  }
  @scala.inline
  implicit class KubernetesDashboardOps[Self <: KubernetesDashboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
  }
  
}

