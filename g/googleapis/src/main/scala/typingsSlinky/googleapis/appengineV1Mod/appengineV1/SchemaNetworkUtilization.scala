package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by network usage. Only applicable in the App Engine flexible
  * environment.
  */
@js.native
trait SchemaNetworkUtilization extends js.Object {
  /**
    * Target bytes received per second.
    */
  var targetReceivedBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target packets received per second.
    */
  var targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target bytes sent per second.
    */
  var targetSentBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target packets sent per second.
    */
  var targetSentPacketsPerSecond: js.UndefOr[Double] = js.native
}

object SchemaNetworkUtilization {
  @scala.inline
  def apply(): SchemaNetworkUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkUtilization]
  }
  @scala.inline
  implicit class SchemaNetworkUtilizationOps[Self <: SchemaNetworkUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetReceivedBytesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReceivedBytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetReceivedBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReceivedBytesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetReceivedPacketsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReceivedPacketsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetReceivedPacketsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReceivedPacketsPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSentBytesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSentBytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSentBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSentBytesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSentPacketsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSentPacketsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSentPacketsPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSentPacketsPerSecond")(js.undefined)
        ret
    }
  }
  
}

