package typingsSlinky.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQualificationTypeResponse extends StObject {
  
  /**
    *  Contains a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typingsSlinky.awsSdk.mturkMod.QualificationType] = js.native
}
object UpdateQualificationTypeResponse {
  
  @scala.inline
  def apply(): UpdateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQualificationTypeResponse]
  }
  
  @scala.inline
  implicit class UpdateQualificationTypeResponseMutableBuilder[Self <: UpdateQualificationTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationType(value: QualificationType): Self = StObject.set(x, "QualificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeUndefined: Self = StObject.set(x, "QualificationType", js.undefined)
  }
}
