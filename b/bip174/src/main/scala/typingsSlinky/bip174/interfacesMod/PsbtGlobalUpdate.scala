package typingsSlinky.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtGlobalUpdate extends js.Object {
  var globalXpub: js.UndefOr[js.Array[GlobalXpub]] = js.native
}

object PsbtGlobalUpdate {
  @scala.inline
  def apply(): PsbtGlobalUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtGlobalUpdate]
  }
  @scala.inline
  implicit class PsbtGlobalUpdateOps[Self <: PsbtGlobalUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalXpub(value: js.Array[GlobalXpub]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalXpub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalXpub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalXpub")(js.undefined)
        ret
    }
  }
  
}

