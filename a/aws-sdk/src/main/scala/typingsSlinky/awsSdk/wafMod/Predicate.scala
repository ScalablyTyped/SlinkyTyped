package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Predicate extends js.Object {
  /**
    * A unique identifier for a predicate in a Rule, such as ByteMatchSetId or IPSetId. The ID is returned by the corresponding Create or List command.
    */
  var DataId: ResourceId = js.native
  /**
    * Set Negated to False if you want AWS WAF to allow, block, or count requests based on the settings in the specified ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, or SizeConstraintSet. For example, if an IPSet includes the IP address 192.0.2.44, AWS WAF will allow or block requests based on that IP address. Set Negated to True if you want AWS WAF to allow or block a request based on the negation of the settings in the ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, or SizeConstraintSet. For example, if an IPSet includes the IP address 192.0.2.44, AWS WAF will allow, block, or count requests based on all IP addresses except 192.0.2.44.
    */
  var Negated: typingsSlinky.awsSdk.wafMod.Negated = js.native
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
  implicit class PredicateOps[Self <: Predicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegated(value: Negated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Negated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PredicateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

