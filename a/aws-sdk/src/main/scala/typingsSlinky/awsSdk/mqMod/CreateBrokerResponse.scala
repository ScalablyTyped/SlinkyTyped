package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBrokerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.native
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
}

object CreateBrokerResponse {
  @scala.inline
  def apply(): CreateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrokerResponse]
  }
  @scala.inline
  implicit class CreateBrokerResponseOps[Self <: CreateBrokerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerId")(js.undefined)
        ret
    }
  }
  
}

