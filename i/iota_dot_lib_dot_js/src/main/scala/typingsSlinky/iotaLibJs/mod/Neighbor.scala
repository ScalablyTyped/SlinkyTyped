package typingsSlinky.iotaLibJs.mod

import typingsSlinky.iotaLibJs.iotaLibJsStrings.tcp
import typingsSlinky.iotaLibJs.iotaLibJsStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Neighbor extends js.Object {
  var address: String = js.native
  var connectionType: udp | tcp = js.native
  var numberOfAllTransactions: Double = js.native
  var numberOfInvalidTransactions: Double = js.native
  var numberOfNewTransactions: Double = js.native
  var numberOfRandomTransactionRequests: Double = js.native
  var numberOfSentTransactions: Double = js.native
}

object Neighbor {
  @scala.inline
  def apply(
    address: String,
    connectionType: udp | tcp,
    numberOfAllTransactions: Double,
    numberOfInvalidTransactions: Double,
    numberOfNewTransactions: Double,
    numberOfRandomTransactionRequests: Double,
    numberOfSentTransactions: Double
  ): Neighbor = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], numberOfAllTransactions = numberOfAllTransactions.asInstanceOf[js.Any], numberOfInvalidTransactions = numberOfInvalidTransactions.asInstanceOf[js.Any], numberOfNewTransactions = numberOfNewTransactions.asInstanceOf[js.Any], numberOfRandomTransactionRequests = numberOfRandomTransactionRequests.asInstanceOf[js.Any], numberOfSentTransactions = numberOfSentTransactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Neighbor]
  }
  @scala.inline
  implicit class NeighborOps[Self <: Neighbor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionType(value: udp | tcp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfAllTransactions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfAllTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfInvalidTransactions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInvalidTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfNewTransactions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNewTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfRandomTransactionRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRandomTransactionRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfSentTransactions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSentTransactions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

