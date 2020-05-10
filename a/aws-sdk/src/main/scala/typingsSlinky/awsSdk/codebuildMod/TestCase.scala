package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCase extends js.Object {
  /**
    *  The number of nanoseconds it took to run this test case. 
    */
  var durationInNanoSeconds: js.UndefOr[WrapperLong] = js.native
  /**
    *  The date and time a test case expires. A test case expires 30 days after it is created. An expired test case is not available to view in CodeBuild. 
    */
  var expired: js.UndefOr[js.Date] = js.native
  /**
    *  A message associated with a test case. For example, an error message or stack trace. 
    */
  var message: js.UndefOr[String] = js.native
  /**
    *  The name of the test case. 
    */
  var name: js.UndefOr[String] = js.native
  /**
    *  A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix depends on the framework used to generate the tests. 
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    *  The ARN of the report to which the test case belongs. 
    */
  var reportArn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The status returned by the test case after it was run. Valid statuses are SUCCEEDED, FAILED, ERROR, SKIPPED, and UNKNOWN. 
    */
  var status: js.UndefOr[String] = js.native
  /**
    *  The path to the raw data file that contains the test result. 
    */
  var testRawDataPath: js.UndefOr[String] = js.native
}

object TestCase {
  @scala.inline
  def apply(): TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCase]
  }
  @scala.inline
  implicit class TestCaseOps[Self <: TestCase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationInNanoSeconds(value: WrapperLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInNanoSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInNanoSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInNanoSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withExpired(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withReportArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTestRawDataPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRawDataPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestRawDataPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRawDataPath")(js.undefined)
        ret
    }
  }
  
}

