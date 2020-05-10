package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBrokerResponse extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
}

object DeleteBrokerResponse {
  @scala.inline
  def apply(): DeleteBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBrokerResponse]
  }
  @scala.inline
  implicit class DeleteBrokerResponseOps[Self <: DeleteBrokerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

