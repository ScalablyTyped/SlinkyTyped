package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCopyJobsOutput extends StObject {
  
  /**
    * An array of structures containing metadata about your copy jobs returned in JSON format. 
    */
  var CopyJobs: js.UndefOr[CopyJobsList] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token. 
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListCopyJobsOutput {
  
  @scala.inline
  def apply(): ListCopyJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCopyJobsOutput]
  }
  
  @scala.inline
  implicit class ListCopyJobsOutputMutableBuilder[Self <: ListCopyJobsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyJobs(value: CopyJobsList): Self = StObject.set(x, "CopyJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyJobsUndefined: Self = StObject.set(x, "CopyJobs", js.undefined)
    
    @scala.inline
    def setCopyJobsVarargs(value: CopyJob*): Self = StObject.set(x, "CopyJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
