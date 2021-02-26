package typingsSlinky.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpResult extends StObject {
  
  var outputs: OutputMap = js.native
  
  var stderr: String = js.native
  
  var stdout: String = js.native
  
  var summary: UpdateSummary = js.native
}
object UpResult {
  
  @scala.inline
  def apply(outputs: OutputMap, stderr: String, stdout: String, summary: UpdateSummary): UpResult = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpResult]
  }
  
  @scala.inline
  implicit class UpResultMutableBuilder[Self <: UpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputs(value: OutputMap): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: UpdateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
