package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FulfillmentActivity extends js.Object {
  /**
    *  A description of the Lambda function that is run to fulfill the intent. 
    */
  var codeHook: js.UndefOr[CodeHook] = js.native
  /**
    *  How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the client application. 
    */
  var `type`: FulfillmentActivityType = js.native
}

object FulfillmentActivity {
  @scala.inline
  def apply(`type`: FulfillmentActivityType): FulfillmentActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentActivity]
  }
  @scala.inline
  implicit class FulfillmentActivityOps[Self <: FulfillmentActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: FulfillmentActivityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeHook(value: CodeHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeHook")(js.undefined)
        ret
    }
  }
  
}

