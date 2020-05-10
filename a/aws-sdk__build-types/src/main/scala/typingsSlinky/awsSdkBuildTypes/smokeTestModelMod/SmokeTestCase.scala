package typingsSlinky.awsSdkBuildTypes.smokeTestModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmokeTestCase extends js.Object {
  /**
    * Whether the test should expect an error-level (4xx or 5xx) HTTP status code.
    * If false, the status code is expected to be between 200 and 299, inclusive.
    */
  var errorExpectedFromService: Boolean = js.native
  /**
    * A hash of arguments to pass to the operation under test.
    */
  var input: js.Object = js.native
  /**
    * The operation under test.
    * This name must appear as an operation in the model of the service version under test.
    */
  var operationName: String = js.native
}

object SmokeTestCase {
  @scala.inline
  def apply(errorExpectedFromService: Boolean, input: js.Object, operationName: String): SmokeTestCase = {
    val __obj = js.Dynamic.literal(errorExpectedFromService = errorExpectedFromService.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmokeTestCase]
  }
  @scala.inline
  implicit class SmokeTestCaseOps[Self <: SmokeTestCase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorExpectedFromService(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorExpectedFromService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

