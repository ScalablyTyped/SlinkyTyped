package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateElasticIpRequest extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String = js.native
}

object DisassociateElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String): DisassociateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateElasticIpRequest]
  }
  @scala.inline
  implicit class DisassociateElasticIpRequestOps[Self <: DisassociateElasticIpRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElasticIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

