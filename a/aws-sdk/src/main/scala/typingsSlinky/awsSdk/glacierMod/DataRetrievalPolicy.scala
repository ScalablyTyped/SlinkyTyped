package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRetrievalPolicy extends js.Object {
  /**
    * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.
    */
  var Rules: js.UndefOr[DataRetrievalRulesList] = js.native
}

object DataRetrievalPolicy {
  @scala.inline
  def apply(): DataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalPolicy]
  }
  @scala.inline
  implicit class DataRetrievalPolicyOps[Self <: DataRetrievalPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: DataRetrievalRulesList): Self = {
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

