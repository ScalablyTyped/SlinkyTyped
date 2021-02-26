package typingsSlinky.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQualificationTypeResponse extends StObject {
  
  /**
    *  The returned Qualification Type
    */
  var QualificationType: js.UndefOr[typingsSlinky.awsSdk.mturkMod.QualificationType] = js.native
}
object GetQualificationTypeResponse {
  
  @scala.inline
  def apply(): GetQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQualificationTypeResponse]
  }
  
  @scala.inline
  implicit class GetQualificationTypeResponseMutableBuilder[Self <: GetQualificationTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationType(value: QualificationType): Self = StObject.set(x, "QualificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeUndefined: Self = StObject.set(x, "QualificationType", js.undefined)
  }
}
