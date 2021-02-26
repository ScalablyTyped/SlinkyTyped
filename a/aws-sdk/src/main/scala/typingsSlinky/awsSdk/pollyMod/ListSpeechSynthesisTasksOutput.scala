package typingsSlinky.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSpeechSynthesisTasksOutput extends StObject {
  
  /**
    * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pollyMod.NextToken] = js.native
  
  /**
    * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
    */
  var SynthesisTasks: js.UndefOr[typingsSlinky.awsSdk.pollyMod.SynthesisTasks] = js.native
}
object ListSpeechSynthesisTasksOutput {
  
  @scala.inline
  def apply(): ListSpeechSynthesisTasksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeechSynthesisTasksOutput]
  }
  
  @scala.inline
  implicit class ListSpeechSynthesisTasksOutputMutableBuilder[Self <: ListSpeechSynthesisTasksOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSynthesisTasks(value: SynthesisTasks): Self = StObject.set(x, "SynthesisTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynthesisTasksUndefined: Self = StObject.set(x, "SynthesisTasks", js.undefined)
    
    @scala.inline
    def setSynthesisTasksVarargs(value: SynthesisTask*): Self = StObject.set(x, "SynthesisTasks", js.Array(value :_*))
  }
}
