package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details about the progress of the running test.
  */
@js.native
trait SchemaTestDetails extends js.Object {
  /**
    * Output only. If the TestState is ERROR, then this string will contain
    * human-readable details about the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Output only. Human-readable, detailed descriptions of the test&#39;s
    * progress. For example: &quot;Provisioning a device&quot;, &quot;Starting
    * Test&quot;.  During the course of execution new data may be appended to
    * the end of progress_messages.
    */
  var progressMessages: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTestDetails {
  @scala.inline
  def apply(): SchemaTestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestDetails]
  }
  @scala.inline
  implicit class SchemaTestDetailsOps[Self <: SchemaTestDetails] (val x: Self) extends AnyVal {
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

