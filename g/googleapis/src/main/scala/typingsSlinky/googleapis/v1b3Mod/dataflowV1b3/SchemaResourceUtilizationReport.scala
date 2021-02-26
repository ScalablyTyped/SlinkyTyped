package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Worker metrics exported from workers. This contains resource utilization
  * metrics accumulated from a variety of sources. For more information, see
  * go/df-resource-signals.
  */
@js.native
trait SchemaResourceUtilizationReport extends StObject {
  
  /**
    * CPU utilization samples.
    */
  var cpuTime: js.UndefOr[js.Array[SchemaCPUTime]] = js.native
}
object SchemaResourceUtilizationReport {
  
  @scala.inline
  def apply(): SchemaResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUtilizationReport]
  }
  
  @scala.inline
  implicit class SchemaResourceUtilizationReportMutableBuilder[Self <: SchemaResourceUtilizationReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuTime(value: js.Array[SchemaCPUTime]): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuTimeUndefined: Self = StObject.set(x, "cpuTime", js.undefined)
    
    @scala.inline
    def setCpuTimeVarargs(value: SchemaCPUTime*): Self = StObject.set(x, "cpuTime", js.Array(value :_*))
  }
}
