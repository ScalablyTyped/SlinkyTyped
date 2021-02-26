package typingsSlinky.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSpeechSynthesisTaskOutput extends StObject {
  
  /**
    * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
    */
  var SynthesisTask: js.UndefOr[typingsSlinky.awsSdk.pollyMod.SynthesisTask] = js.native
}
object StartSpeechSynthesisTaskOutput {
  
  @scala.inline
  def apply(): StartSpeechSynthesisTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSpeechSynthesisTaskOutput]
  }
  
  @scala.inline
  implicit class StartSpeechSynthesisTaskOutputMutableBuilder[Self <: StartSpeechSynthesisTaskOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSynthesisTask(value: SynthesisTask): Self = StObject.set(x, "SynthesisTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynthesisTaskUndefined: Self = StObject.set(x, "SynthesisTask", js.undefined)
  }
}
