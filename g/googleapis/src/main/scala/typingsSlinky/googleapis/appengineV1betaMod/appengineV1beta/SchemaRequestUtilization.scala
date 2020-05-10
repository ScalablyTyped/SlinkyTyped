package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by request utilization. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait SchemaRequestUtilization extends js.Object {
  /**
    * Target number of concurrent requests.
    */
  var targetConcurrentRequests: js.UndefOr[Double] = js.native
  /**
    * Target requests per second.
    */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.native
}

object SchemaRequestUtilization {
  @scala.inline
  def apply(): SchemaRequestUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestUtilization]
  }
  @scala.inline
  implicit class SchemaRequestUtilizationOps[Self <: SchemaRequestUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetConcurrentRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetConcurrentRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConcurrentRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetConcurrentRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRequestCountPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRequestCountPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRequestCountPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRequestCountPerSecond")(js.undefined)
        ret
    }
  }
  
}

