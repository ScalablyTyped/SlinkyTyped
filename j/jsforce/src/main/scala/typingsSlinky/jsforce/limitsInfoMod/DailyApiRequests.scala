package typingsSlinky.jsforce.limitsInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DailyApiRequests extends Limit {
  var `Chatter Desktop`: Limit = js.native
  var `Chatter Mobile for BlackBerry`: Limit = js.native
  var `Salesforce Files`: Limit = js.native
  var `Salesforce Marketing Cloud`: Limit = js.native
  var `Salesforce for Android`: Limit = js.native
  var `Salesforce for iOS`: Limit = js.native
  var SalesforceA: Limit = js.native
}

object DailyApiRequests {
  @scala.inline
  def apply(
    `Chatter Desktop`: Limit,
    `Chatter Mobile for BlackBerry`: Limit,
    Max: Double,
    Remaining: Double,
    `Salesforce Files`: Limit,
    `Salesforce Marketing Cloud`: Limit,
    `Salesforce for Android`: Limit,
    `Salesforce for iOS`: Limit,
    SalesforceA: Limit
  ): DailyApiRequests = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any], SalesforceA = SalesforceA.asInstanceOf[js.Any])
    __obj.updateDynamic("Chatter Desktop")((`Chatter Desktop`).asInstanceOf[js.Any])
    __obj.updateDynamic("Chatter Mobile for BlackBerry")((`Chatter Mobile for BlackBerry`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce Files")((`Salesforce Files`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce Marketing Cloud")((`Salesforce Marketing Cloud`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce for Android")((`Salesforce for Android`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce for iOS")((`Salesforce for iOS`).asInstanceOf[js.Any])
    __obj.asInstanceOf[DailyApiRequests]
  }
  @scala.inline
  implicit class DailyApiRequestsOps[Self <: DailyApiRequests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withChatter Desktop`(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chatter Desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withChatter Mobile for BlackBerry`(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chatter Mobile for BlackBerry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSalesforce Files`(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salesforce Files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSalesforce Marketing Cloud`(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salesforce Marketing Cloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSalesforce for Android`(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salesforce for Android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSalesforce for iOS`(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salesforce for iOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalesforceA(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SalesforceA")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

