package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingComputationConfig extends StObject {
  
  /** Unique identifier for this computation. */
  var computationId: js.UndefOr[String] = js.native
  
  /** Instructions that comprise the computation. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.native
  
  /** Stage name of this computation. */
  var stageName: js.UndefOr[String] = js.native
  
  /** System defined name for this computation. */
  var systemName: js.UndefOr[String] = js.native
  
  /** Map from user name of stateful transforms in this stage to their state family. */
  var transformUserNameToStateFamily: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StreamingComputationConfig with TopLevel[js.Any]
  ] = js.native
}
object StreamingComputationConfig {
  
  @scala.inline
  def apply(): StreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationConfig]
  }
  
  @scala.inline
  implicit class StreamingComputationConfigMutableBuilder[Self <: StreamingComputationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    @scala.inline
    def setInstructions(value: js.Array[ParallelInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: ParallelInstruction*): Self = StObject.set(x, "instructions", js.Array(value :_*))
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    @scala.inline
    def setTransformUserNameToStateFamily(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StreamingComputationConfig with TopLevel[js.Any]
    ): Self = StObject.set(x, "transformUserNameToStateFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUserNameToStateFamilyUndefined: Self = StObject.set(x, "transformUserNameToStateFamily", js.undefined)
  }
}
