package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationsInput extends js.Object {
  
  /**
    * An identifier returned from the previous list applications call. It can be used to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListApplicationsInput {
  
  @scala.inline
  def apply(): ListApplicationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsInput]
  }
  
  @scala.inline
  implicit class ListApplicationsInputOps[Self <: ListApplicationsInput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
