package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCommitOutput extends StObject {
  
  /**
    * A commit data type object that contains information about the specified commit.
    */
  var commit: Commit = js.native
}
object GetCommitOutput {
  
  @scala.inline
  def apply(commit: Commit): GetCommitOutput = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommitOutput]
  }
  
  @scala.inline
  implicit class GetCommitOutputMutableBuilder[Self <: GetCommitOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: Commit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
  }
}
