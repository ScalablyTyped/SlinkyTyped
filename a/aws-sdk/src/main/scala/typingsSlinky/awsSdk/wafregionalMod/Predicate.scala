package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends StObject {
  
  /**
    * A unique identifier for a predicate in a Rule, such as ByteMatchSetId or IPSetId. The ID is returned by the corresponding Create or List command.
    */
  var DataId: ResourceId = js.native
  
  /**
    * Set Negated to False if you want AWS WAF to allow, block, or count requests based on the settings in the specified ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, or SizeConstraintSet. For example, if an IPSet includes the IP address 192.0.2.44, AWS WAF will allow or block requests based on that IP address. Set Negated to True if you want AWS WAF to allow or block a request based on the negation of the settings in the ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, or SizeConstraintSet. For example, if an IPSet includes the IP address 192.0.2.44, AWS WAF will allow, block, or count requests based on all IP addresses except 192.0.2.44.
    */
  var Negated: typingsSlinky.awsSdk.wafregionalMod.Negated = js.native
  
  /**
    * The type of predicate in a Rule, such as ByteMatch or IPSet.
    */
  var Type: PredicateType = js.native
}
object Predicate {
  
  @scala.inline
  def apply(DataId: ResourceId, Negated: Negated, Type: PredicateType): Predicate = {
    val __obj = js.Dynamic.literal(DataId = DataId.asInstanceOf[js.Any], Negated = Negated.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Predicate]
  }
  
  @scala.inline
  implicit class PredicateMutableBuilder[Self <: Predicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataId(value: ResourceId): Self = StObject.set(x, "DataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegated(value: Negated): Self = StObject.set(x, "Negated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PredicateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
