package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a detailed summary of the Deidentify operation.
  */
@js.native
trait SchemaDeidentifySummary extends StObject {
  
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}
object SchemaDeidentifySummary {
  
  @scala.inline
  def apply(): SchemaDeidentifySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifySummary]
  }
  
  @scala.inline
  implicit class SchemaDeidentifySummaryMutableBuilder[Self <: SchemaDeidentifySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessResourceCount(value: String): Self = StObject.set(x, "successResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessResourceCountUndefined: Self = StObject.set(x, "successResourceCount", js.undefined)
    
    @scala.inline
    def setSuccessStoreCount(value: String): Self = StObject.set(x, "successStoreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessStoreCountUndefined: Self = StObject.set(x, "successStoreCount", js.undefined)
  }
}
