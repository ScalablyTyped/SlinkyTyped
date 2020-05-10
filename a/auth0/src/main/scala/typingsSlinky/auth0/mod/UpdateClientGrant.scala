package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Partial<auth0.auth0.CreateClientGrant>, 'scope'> */
@js.native
trait UpdateClientGrant extends js.Object {
  var scope: js.UndefOr[js.Array[String]] = js.native
}

object UpdateClientGrant {
  @scala.inline
  def apply(): UpdateClientGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClientGrant]
  }
  @scala.inline
  implicit class UpdateClientGrantOps[Self <: UpdateClientGrant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

