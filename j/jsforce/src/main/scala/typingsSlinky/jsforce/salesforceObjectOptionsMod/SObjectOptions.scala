package typingsSlinky.jsforce.salesforceObjectOptionsMod

import typingsSlinky.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SObjectOptions extends js.Object {
  var ExtId__c: js.UndefOr[String] = js.native
  var Id: js.UndefOr[SalesforceId] = js.native
  var Name: js.UndefOr[String] = js.native
}

object SObjectOptions {
  @scala.inline
  def apply(): SObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SObjectOptions]
  }
  @scala.inline
  implicit class SObjectOptionsOps[Self <: SObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtId__c(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtId__c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtId__c: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtId__c")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: SalesforceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

