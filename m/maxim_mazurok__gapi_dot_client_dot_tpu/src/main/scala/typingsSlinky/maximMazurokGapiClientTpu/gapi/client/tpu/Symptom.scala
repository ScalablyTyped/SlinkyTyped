package typingsSlinky.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symptom extends StObject {
  
  /** Timestamp when the Symptom is created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Detailed information of the current Symptom. */
  var details: js.UndefOr[String] = js.native
  
  /** Type of the Symptom. */
  var symptomType: js.UndefOr[String] = js.native
  
  /** A string used to uniquely distinguish a worker within a TPU node. */
  var workerId: js.UndefOr[String] = js.native
}
object Symptom {
  
  @scala.inline
  def apply(): Symptom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Symptom]
  }
  
  @scala.inline
  implicit class SymptomMutableBuilder[Self <: Symptom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setSymptomType(value: String): Self = StObject.set(x, "symptomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymptomTypeUndefined: Self = StObject.set(x, "symptomType", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
