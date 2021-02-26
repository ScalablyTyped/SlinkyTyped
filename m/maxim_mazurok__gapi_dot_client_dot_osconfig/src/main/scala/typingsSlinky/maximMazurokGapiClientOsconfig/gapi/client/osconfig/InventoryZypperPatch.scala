package typingsSlinky.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryZypperPatch extends StObject {
  
  /** The category of the patch. */
  var category: js.UndefOr[String] = js.native
  
  /** The name of the patch. */
  var patchName: js.UndefOr[String] = js.native
  
  /** The severity specified for this patch */
  var severity: js.UndefOr[String] = js.native
  
  /** Any summary information provided about this patch. */
  var summary: js.UndefOr[String] = js.native
}
object InventoryZypperPatch {
  
  @scala.inline
  def apply(): InventoryZypperPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryZypperPatch]
  }
  
  @scala.inline
  implicit class InventoryZypperPatchMutableBuilder[Self <: InventoryZypperPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setPatchName(value: String): Self = StObject.set(x, "patchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchNameUndefined: Self = StObject.set(x, "patchName", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
