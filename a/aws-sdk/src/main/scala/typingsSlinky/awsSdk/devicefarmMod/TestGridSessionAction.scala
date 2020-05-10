package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestGridSessionAction extends js.Object {
  /**
    * The action taken by the session.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * The time, in milliseconds, that the action took to complete in the browser.
    */
  var duration: js.UndefOr[Long] = js.native
  /**
    * HTTP method that the browser used to make the request.
    */
  var requestMethod: js.UndefOr[String] = js.native
  /**
    * The time that the session invoked the action.
    */
  var started: js.UndefOr[js.Date] = js.native
  /**
    * HTTP status code returned to the browser when the action was taken.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object TestGridSessionAction {
  @scala.inline
  def apply(): TestGridSessionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSessionAction]
  }
  @scala.inline
  implicit class TestGridSessionActionOps[Self <: TestGridSessionAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

