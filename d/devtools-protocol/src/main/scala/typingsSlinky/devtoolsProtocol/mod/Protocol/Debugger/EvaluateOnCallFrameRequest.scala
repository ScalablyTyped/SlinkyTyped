package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.TimeDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluateOnCallFrameRequest extends StObject {
  
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId = js.native
  
  /**
    * Expression to evaluate.
    */
  var expression: String = js.native
  
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether command line API should be available to the evaluated expression, defaults
    * to false.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.native
  
  /**
    * String object group name to put result into (allows rapid releasing resulting object handles
    * using `releaseObjectGroup`).
    */
  var objectGroup: js.UndefOr[String] = js.native
  
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
  
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause
    * execution. Overrides `setPauseOnException` state.
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.native
  
  /**
    * Terminate execution after timing out (number of milliseconds).
    */
  var timeout: js.UndefOr[TimeDelta] = js.native
}
object EvaluateOnCallFrameRequest {
  
  @scala.inline
  def apply(callFrameId: CallFrameId, expression: String): EvaluateOnCallFrameRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameRequest]
  }
  
  @scala.inline
  implicit class EvaluateOnCallFrameRequestMutableBuilder[Self <: EvaluateOnCallFrameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    @scala.inline
    def setIncludeCommandLineAPI(value: Boolean): Self = StObject.set(x, "includeCommandLineAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCommandLineAPIUndefined: Self = StObject.set(x, "includeCommandLineAPI", js.undefined)
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    @scala.inline
    def setReturnByValue(value: Boolean): Self = StObject.set(x, "returnByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnByValueUndefined: Self = StObject.set(x, "returnByValue", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setThrowOnSideEffect(value: Boolean): Self = StObject.set(x, "throwOnSideEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOnSideEffectUndefined: Self = StObject.set(x, "throwOnSideEffect", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeDelta): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
