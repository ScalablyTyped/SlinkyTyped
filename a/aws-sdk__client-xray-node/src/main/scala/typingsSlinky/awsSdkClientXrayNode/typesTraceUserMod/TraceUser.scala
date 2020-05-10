package typingsSlinky.awsSdkClientXrayNode.typesTraceUserMod

import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceUser extends js.Object {
  /**
    * <p>Services that the user's request hit.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | js.Iterable[ServiceId]] = js.native
  /**
    * <p>The user's name.</p>
    */
  var UserName: js.UndefOr[String] = js.native
}

object TraceUser {
  @scala.inline
  def apply(): TraceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceUser]
  }
  @scala.inline
  implicit class TraceUserOps[Self <: TraceUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceIdsIterable(value: js.Iterable[ServiceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceIds(value: js.Array[ServiceId] | js.Iterable[ServiceId]): Self = {
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
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

