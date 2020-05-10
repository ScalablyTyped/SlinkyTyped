package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolOutputReference extends js.Object {
  /**
    * The creation time of the file.
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * A FileReference to an output file.
    *
    * - In response: always set - In create/update request: always set
    */
  var output: js.UndefOr[FileReference] = js.native
  /**
    * The test case to which this output file belongs.
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var testCase: js.UndefOr[TestCaseReference] = js.native
}

object ToolOutputReference {
  @scala.inline
  def apply(): ToolOutputReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolOutputReference]
  }
  @scala.inline
  implicit class ToolOutputReferenceOps[Self <: ToolOutputReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: FileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withTestCase(value: TestCaseReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCase")(js.undefined)
        ret
    }
  }
  
}

