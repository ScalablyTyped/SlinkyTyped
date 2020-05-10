package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePoolsResize extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The desired number of replicas to resize to. If this number is larger
    * than the existing number of replicas, new replicas will be added. If the
    * number is smaller, then existing replicas will be deleted.
    */
  var numReplicas: js.UndefOr[Double] = js.native
  /**
    * The name of the replica pool for this request.
    */
  var poolName: js.UndefOr[String] = js.native
  /**
    * The project ID for this replica pool.
    */
  var projectName: js.UndefOr[String] = js.native
  /**
    * The zone for this replica pool.
    */
  var zone: js.UndefOr[String] = js.native
}

object ParamsResourcePoolsResize {
  @scala.inline
  def apply(): ParamsResourcePoolsResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoolsResize]
  }
  @scala.inline
  implicit class ParamsResourcePoolsResizeOps[Self <: ParamsResourcePoolsResize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withNumReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numReplicas")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolName")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

