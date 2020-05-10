package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMapValidationResult extends js.Object {
  var loadErrors: js.UndefOr[js.Array[String]] = js.native
  /** Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the reasons. */
  var loadSucceeded: js.UndefOr[Boolean] = js.native
  var testFailures: js.UndefOr[js.Array[TestFailure]] = js.native
  /** If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's indicate the reason of failure. */
  var testPassed: js.UndefOr[Boolean] = js.native
}

object UrlMapValidationResult {
  @scala.inline
  def apply(): UrlMapValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapValidationResult]
  }
  @scala.inline
  implicit class UrlMapValidationResultOps[Self <: UrlMapValidationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSucceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withTestFailures(value: js.Array[TestFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withTestPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPassed")(js.undefined)
        ret
    }
  }
  
}

