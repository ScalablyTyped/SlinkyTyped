package typingsSlinky.prosemirrorCollab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientID extends js.Object {
  var clientID: js.UndefOr[Double | String | Null] = js.native
  var version: js.UndefOr[Double | Null] = js.native
}

object ClientID {
  @scala.inline
  def apply(): ClientID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientID]
  }
  @scala.inline
  implicit class ClientIDOps[Self <: ClientID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientID(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(js.undefined)
        ret
    }
    @scala.inline
    def withClientIDNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(null)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(null)
        ret
    }
  }
  
}

