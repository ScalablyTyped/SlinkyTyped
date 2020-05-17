package typingsSlinky.keycloakConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grant extends js.Object {
  var grant: js.UndefOr[typingsSlinky.keycloakConnect.mod.Grant] = js.native
}

object Grant {
  @scala.inline
  def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  @scala.inline
  implicit class GrantOps[Self <: Grant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrant(value: typingsSlinky.keycloakConnect.mod.Grant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant")(js.undefined)
        ret
    }
  }
  
}

