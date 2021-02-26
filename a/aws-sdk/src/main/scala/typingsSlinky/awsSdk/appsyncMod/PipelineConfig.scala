package typingsSlinky.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineConfig extends StObject {
  
  /**
    * A list of Function objects.
    */
  var functions: js.UndefOr[FunctionsIds] = js.native
}
object PipelineConfig {
  
  @scala.inline
  def apply(): PipelineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineConfig]
  }
  
  @scala.inline
  implicit class PipelineConfigMutableBuilder[Self <: PipelineConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctions(value: FunctionsIds): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setFunctionsVarargs(value: String*): Self = StObject.set(x, "functions", js.Array(value :_*))
  }
}
