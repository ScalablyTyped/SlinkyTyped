package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuHealth extends js.Object {
  /**
    * The health status.
    */
  var Status: js.UndefOr[ElasticGpuStatus] = js.native
}

object ElasticGpuHealth {
  @scala.inline
  def apply(): ElasticGpuHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuHealth]
  }
  @scala.inline
  implicit class ElasticGpuHealthOps[Self <: ElasticGpuHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: ElasticGpuStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

