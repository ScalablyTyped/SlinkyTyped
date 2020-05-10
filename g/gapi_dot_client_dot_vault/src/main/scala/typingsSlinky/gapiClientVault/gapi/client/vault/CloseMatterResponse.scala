package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseMatterResponse extends js.Object {
  /** The updated matter, with state CLOSED. */
  var matter: js.UndefOr[Matter] = js.native
}

object CloseMatterResponse {
  @scala.inline
  def apply(): CloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseMatterResponse]
  }
  @scala.inline
  implicit class CloseMatterResponseOps[Self <: CloseMatterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatter(value: Matter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matter")(js.undefined)
        ret
    }
  }
  
}

