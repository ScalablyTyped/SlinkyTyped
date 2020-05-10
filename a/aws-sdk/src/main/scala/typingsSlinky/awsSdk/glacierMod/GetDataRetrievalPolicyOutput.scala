package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataRetrievalPolicyOutput extends js.Object {
  /**
    * Contains the returned data retrieval policy in JSON format.
    */
  var Policy: js.UndefOr[DataRetrievalPolicy] = js.native
}

object GetDataRetrievalPolicyOutput {
  @scala.inline
  def apply(): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
  @scala.inline
  implicit class GetDataRetrievalPolicyOutputOps[Self <: GetDataRetrievalPolicyOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: DataRetrievalPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
  }
  
}

