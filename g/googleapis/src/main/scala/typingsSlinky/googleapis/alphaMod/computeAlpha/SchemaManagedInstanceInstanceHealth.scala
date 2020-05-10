package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceInstanceHealth extends js.Object {
  /**
    * [Output Only] The current detailed instance health state.
    */
  var detailedHealthState: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL for the health check that verifies whether the
    * instance is healthy.
    */
  var healthCheck: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current instance health state.
    */
  var healthState: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceInstanceHealth {
  @scala.inline
  def apply(): SchemaManagedInstanceInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceInstanceHealth]
  }
  @scala.inline
  implicit class SchemaManagedInstanceInstanceHealthOps[Self <: SchemaManagedInstanceInstanceHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailedHealthState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedHealthState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailedHealthState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedHealthState")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthState")(js.undefined)
        ret
    }
  }
  
}

