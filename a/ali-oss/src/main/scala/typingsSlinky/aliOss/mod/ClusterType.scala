package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterType extends js.Object {
  var accessKeyId: String = js.native
  var accessKeySecret: String = js.native
  var host: String = js.native
}

object ClusterType {
  @scala.inline
  def apply(accessKeyId: String, accessKeySecret: String, host: String): ClusterType = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterType]
  }
  @scala.inline
  implicit class ClusterTypeOps[Self <: ClusterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessKeySecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeySecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

