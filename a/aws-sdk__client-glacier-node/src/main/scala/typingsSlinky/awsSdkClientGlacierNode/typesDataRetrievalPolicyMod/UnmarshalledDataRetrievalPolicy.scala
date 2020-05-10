package typingsSlinky.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod

import typingsSlinky.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.UnmarshalledDataRetrievalRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledDataRetrievalPolicy extends DataRetrievalPolicy {
  /**
    * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledDataRetrievalPolicy: js.UndefOr[js.Array[UnmarshalledDataRetrievalRule]] = js.native
}

object UnmarshalledDataRetrievalPolicy {
  @scala.inline
  def apply(): UnmarshalledDataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledDataRetrievalPolicy]
  }
  @scala.inline
  implicit class UnmarshalledDataRetrievalPolicyOps[Self <: UnmarshalledDataRetrievalPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[UnmarshalledDataRetrievalRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
  }
  
}

