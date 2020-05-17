package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiIron.mod.SealOptionsSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Integrity extends js.Object {
  var integrity: js.UndefOr[SealOptionsSub] = js.native
  var password: String = js.native
}

object Integrity {
  @scala.inline
  def apply(password: String): Integrity = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrity]
  }
  @scala.inline
  implicit class IntegrityOps[Self <: Integrity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrity(value: SealOptionsSub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
  }
  
}

