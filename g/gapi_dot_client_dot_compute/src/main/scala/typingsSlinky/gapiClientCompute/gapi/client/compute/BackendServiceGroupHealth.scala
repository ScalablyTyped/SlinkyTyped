package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServiceGroupHealth extends js.Object {
  var healthStatus: js.UndefOr[js.Array[HealthStatus]] = js.native
  /** [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of backend services. */
  var kind: js.UndefOr[String] = js.native
}

object BackendServiceGroupHealth {
  @scala.inline
  def apply(): BackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceGroupHealth]
  }
  @scala.inline
  implicit class BackendServiceGroupHealthOps[Self <: BackendServiceGroupHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthStatus(value: js.Array[HealthStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

