package typingsSlinky.keycloakConnect

import typingsSlinky.keycloakConnect.mod.Grant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGrant extends js.Object {
  var grant: js.UndefOr[Grant] = js.native
}

object AnonGrant {
  @scala.inline
  def apply(): AnonGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGrant]
  }
  @scala.inline
  implicit class AnonGrantOps[Self <: AnonGrant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrant(value: Grant): Self = {
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

