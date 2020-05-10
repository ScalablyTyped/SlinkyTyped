package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logging extends js.Object {
  /**
    * The cluster control plane logging configuration for your cluster.
    */
  var clusterLogging: js.UndefOr[LogSetups] = js.native
}

object Logging {
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  @scala.inline
  implicit class LoggingOps[Self <: Logging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterLogging(value: LogSetups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterLogging")(js.undefined)
        ret
    }
  }
  
}

