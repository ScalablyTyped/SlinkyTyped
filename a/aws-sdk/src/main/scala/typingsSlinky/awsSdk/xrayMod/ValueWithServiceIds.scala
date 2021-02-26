package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueWithServiceIds extends StObject {
  
  /**
    * Values of the annotation.
    */
  var AnnotationValue: js.UndefOr[typingsSlinky.awsSdk.xrayMod.AnnotationValue] = js.native
  
  /**
    * Services to which the annotation applies.
    */
  var ServiceIds: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ServiceIds] = js.native
}
object ValueWithServiceIds {
  
  @scala.inline
  def apply(): ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueWithServiceIds]
  }
  
  @scala.inline
  implicit class ValueWithServiceIdsMutableBuilder[Self <: ValueWithServiceIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationValue(value: AnnotationValue): Self = StObject.set(x, "AnnotationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationValueUndefined: Self = StObject.set(x, "AnnotationValue", js.undefined)
    
    @scala.inline
    def setServiceIds(value: ServiceIds): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
    
    @scala.inline
    def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
  }
}
