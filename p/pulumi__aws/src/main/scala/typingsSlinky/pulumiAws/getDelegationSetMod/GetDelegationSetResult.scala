package typingsSlinky.pulumiAws.getDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDelegationSetResult extends js.Object {
  val callerReference: String = js.native
  val id: String = js.native
  val nameServers: js.Array[String] = js.native
}

object GetDelegationSetResult {
  @scala.inline
  def apply(callerReference: String, id: String, nameServers: js.Array[String]): GetDelegationSetResult = {
    val __obj = js.Dynamic.literal(callerReference = callerReference.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nameServers = nameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDelegationSetResult]
  }
  @scala.inline
  implicit class GetDelegationSetResultOps[Self <: GetDelegationSetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

