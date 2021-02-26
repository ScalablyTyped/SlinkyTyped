package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialMatch extends StObject {
  
  /**
    * The reference rule from the master security group of the AWS Firewall Manager policy.
    */
  var Reference: js.UndefOr[ReferenceRule] = js.native
  
  /**
    * The violation reason.
    */
  var TargetViolationReasons: js.UndefOr[typingsSlinky.awsSdk.fmsMod.TargetViolationReasons] = js.native
}
object PartialMatch {
  
  @scala.inline
  def apply(): PartialMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatch]
  }
  
  @scala.inline
  implicit class PartialMatchMutableBuilder[Self <: PartialMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReference(value: ReferenceRule): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "Reference", js.undefined)
    
    @scala.inline
    def setTargetViolationReasons(value: TargetViolationReasons): Self = StObject.set(x, "TargetViolationReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetViolationReasonsUndefined: Self = StObject.set(x, "TargetViolationReasons", js.undefined)
    
    @scala.inline
    def setTargetViolationReasonsVarargs(value: TargetViolationReason*): Self = StObject.set(x, "TargetViolationReasons", js.Array(value :_*))
  }
}
