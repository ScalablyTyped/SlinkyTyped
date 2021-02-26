package typingsSlinky.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobPayloadItem extends StObject {
  
  var advanced: js.UndefOr[JobObjOutputPayloadAdvanced] = js.native
  
  var `type`: String = js.native
  
  var views: js.UndefOr[js.Array[String]] = js.native
}
object JobPayloadItem {
  
  @scala.inline
  def apply(`type`: String): JobPayloadItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadItem]
  }
  
  @scala.inline
  implicit class JobPayloadItemMutableBuilder[Self <: JobPayloadItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanced(value: JobObjOutputPayloadAdvanced): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: js.Array[String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: String*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
