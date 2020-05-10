package typingsSlinky.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokersData extends js.Object {
  var brokerURIs: js.Array[String] = js.native
}

object UpdateBrokersData {
  @scala.inline
  def apply(brokerURIs: js.Array[String]): UpdateBrokersData = {
    val __obj = js.Dynamic.literal(brokerURIs = brokerURIs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokersData]
  }
  @scala.inline
  implicit class UpdateBrokersDataOps[Self <: UpdateBrokersData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerURIs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerURIs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

