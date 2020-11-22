package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestStepFinished. */
@js.native
trait ITestStepFinished extends js.Object {
  
  /** TestStepFinished testCaseStartedId */
  var testCaseStartedId: js.UndefOr[String | Null] = js.native
  
  /** TestStepFinished testResult */
  var testResult: js.UndefOr[ITestResult | Null] = js.native
  
  /** TestStepFinished testStepId */
  var testStepId: js.UndefOr[String | Null] = js.native
  
  /** TestStepFinished timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.native
}
object ITestStepFinished {
  
  @scala.inline
  def apply(): ITestStepFinished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestStepFinished]
  }
  
  @scala.inline
  implicit class ITestStepFinishedOps[Self <: ITestStepFinished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTestCaseStartedId(value: String): Self = this.set("testCaseStartedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseStartedId: Self = this.set("testCaseStartedId", js.undefined)
    
    @scala.inline
    def setTestCaseStartedIdNull: Self = this.set("testCaseStartedId", null)
    
    @scala.inline
    def setTestResult(value: ITestResult): Self = this.set("testResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestResult: Self = this.set("testResult", js.undefined)
    
    @scala.inline
    def setTestResultNull: Self = this.set("testResult", null)
    
    @scala.inline
    def setTestStepId(value: String): Self = this.set("testStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestStepId: Self = this.set("testStepId", js.undefined)
    
    @scala.inline
    def setTestStepIdNull: Self = this.set("testStepId", null)
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTimestampNull: Self = this.set("timestamp", null)
  }
}
