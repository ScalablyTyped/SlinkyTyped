package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestDetails extends js.Object {
  /**
    * If the TestState is ERROR, then this string will contain human-readable
    * details about the error.
    * @OutputOnly
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Human-readable, detailed descriptions of the test's progress.
    * For example: "Provisioning a device", "Starting Test".
    *
    * During the course of execution new data may be appended
    * to the end of progress_messages.
    * @OutputOnly
    */
  var progressMessages: js.UndefOr[js.Array[String]] = js.native
}

object TestDetails {
  @scala.inline
  def apply(): TestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestDetails]
  }
  @scala.inline
  implicit class TestDetailsOps[Self <: TestDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressMessages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressMessages")(js.undefined)
        ret
    }
  }
  
}

