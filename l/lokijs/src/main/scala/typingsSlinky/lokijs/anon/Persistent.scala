package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Persistent extends js.Object {
  var persistent: js.UndefOr[Boolean] = js.native
  var suppressRebuildEvent: js.UndefOr[Boolean] = js.native
}

object Persistent {
  @scala.inline
  def apply(): Persistent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Persistent]
  }
  @scala.inline
  implicit class PersistentOps[Self <: Persistent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressRebuildEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRebuildEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressRebuildEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRebuildEvent")(js.undefined)
        ret
    }
  }
  
}

