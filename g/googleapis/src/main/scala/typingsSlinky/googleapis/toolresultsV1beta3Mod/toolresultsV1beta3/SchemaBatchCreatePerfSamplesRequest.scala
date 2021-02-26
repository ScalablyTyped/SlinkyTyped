package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request must provide up to a maximum of 5000 samples to be created; a
  * larger sample size will cause an INVALID_ARGUMENT error
  */
@js.native
trait SchemaBatchCreatePerfSamplesRequest extends StObject {
  
  /**
    * The set of PerfSamples to create should not include existing timestamps
    */
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}
object SchemaBatchCreatePerfSamplesRequest {
  
  @scala.inline
  def apply(): SchemaBatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePerfSamplesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchCreatePerfSamplesRequestMutableBuilder[Self <: SchemaBatchCreatePerfSamplesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerfSamples(value: js.Array[SchemaPerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    @scala.inline
    def setPerfSamplesVarargs(value: SchemaPerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
