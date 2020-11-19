package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setOutput(value: FileReference): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setTestCase(value: TestCaseReference): Self = this.set("testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCase: Self = this.set("testCase", js.undefined)
  }
}
