package typingsSlinky.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageAccessCondition extends StObject {
  
  var `If-Match`: String = js.native
  
  var `If-Modified-Since`: js.Date = js.native
  
  var `If-None-Match`: String = js.native
  
  var `If-Unmodified-Since`: js.Date = js.native
}
object StorageAccessCondition {
  
  @scala.inline
  def apply(
    `If-Match`: String,
    `If-Modified-Since`: js.Date,
    `If-None-Match`: String,
    `If-Unmodified-Since`: js.Date
  ): StorageAccessCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("If-Match")(`If-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Modified-Since")(`If-Modified-Since`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-None-Match")(`If-None-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Unmodified-Since")(`If-Unmodified-Since`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAccessCondition]
  }
  
  @scala.inline
  implicit class StorageAccessConditionMutableBuilder[Self <: StorageAccessCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setIf-Match`(value: String): Self = StObject.set(x, "If-Match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIf-Modified-Since`(value: js.Date): Self = StObject.set(x, "If-Modified-Since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIf-None-Match`(value: String): Self = StObject.set(x, "If-None-Match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIf-Unmodified-Since`(value: js.Date): Self = StObject.set(x, "If-Unmodified-Since", value.asInstanceOf[js.Any])
  }
}
