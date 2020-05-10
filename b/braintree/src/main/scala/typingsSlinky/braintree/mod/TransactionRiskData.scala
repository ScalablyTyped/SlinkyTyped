package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionRiskData extends js.Object {
  var decision: String = js.native
  var deviceDataCaptured: Boolean = js.native
  var fraudServiceProvider: String = js.native
  var id: String = js.native
}

object TransactionRiskData {
  @scala.inline
  def apply(decision: String, deviceDataCaptured: Boolean, fraudServiceProvider: String, id: String): TransactionRiskData = {
    val __obj = js.Dynamic.literal(decision = decision.asInstanceOf[js.Any], deviceDataCaptured = deviceDataCaptured.asInstanceOf[js.Any], fraudServiceProvider = fraudServiceProvider.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRiskData]
  }
  @scala.inline
  implicit class TransactionRiskDataOps[Self <: TransactionRiskData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceDataCaptured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDataCaptured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFraudServiceProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraudServiceProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

