package typingsSlinky.awsSdkClientXrayNode.typesTraceUserMod

import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledTraceUser extends TraceUser {
  /**
    * <p>Services that the user's request hit.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledTraceUser: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
}

object UnmarshalledTraceUser {
  @scala.inline
  def apply(): UnmarshalledTraceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTraceUser]
  }
  @scala.inline
  implicit class UnmarshalledTraceUserOps[Self <: UnmarshalledTraceUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceIds(value: js.Array[UnmarshalledServiceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(js.undefined)
        ret
    }
  }
  
}

