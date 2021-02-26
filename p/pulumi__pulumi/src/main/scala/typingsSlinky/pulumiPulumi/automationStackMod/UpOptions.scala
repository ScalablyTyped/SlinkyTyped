package typingsSlinky.pulumiPulumi.automationStackMod

import typingsSlinky.pulumiPulumi.workspaceMod.PulumiFn
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpOptions extends StObject {
  
  var expectNoChanges: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var onOutput: js.UndefOr[js.Function1[/* out */ String, Unit]] = js.native
  
  var parallel: js.UndefOr[Double] = js.native
  
  var program: js.UndefOr[PulumiFn] = js.native
  
  var replace: js.UndefOr[js.Array[String]] = js.native
  
  var target: js.UndefOr[js.Array[String]] = js.native
  
  var targetDependents: js.UndefOr[Boolean] = js.native
}
object UpOptions {
  
  @scala.inline
  def apply(): UpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpOptions]
  }
  
  @scala.inline
  implicit class UpOptionsMutableBuilder[Self <: UpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectNoChanges(value: Boolean): Self = StObject.set(x, "expectNoChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectNoChangesUndefined: Self = StObject.set(x, "expectNoChanges", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnOutput(value: /* out */ String => Unit): Self = StObject.set(x, "onOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOutputUndefined: Self = StObject.set(x, "onOutput", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    @scala.inline
    def setProgram(value: () => js.Promise[(Record[String, js.Any]) | Unit]): Self = StObject.set(x, "program", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    @scala.inline
    def setReplace(value: js.Array[String]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setReplaceVarargs(value: String*): Self = StObject.set(x, "replace", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDependents(value: Boolean): Self = StObject.set(x, "targetDependents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDependentsUndefined: Self = StObject.set(x, "targetDependents", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
