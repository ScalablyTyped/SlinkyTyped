package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: String = js.native
  var away: String = js.native
  var background: String = js.native
  var busy: String = js.native
  var dnd: String = js.native
  var offline: String = js.native
  var oof: String = js.native
}

object Available {
  @scala.inline
  def apply(
    available: String,
    away: String,
    background: String,
    busy: String,
    dnd: String,
    offline: String,
    oof: String
  ): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], away = away.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], busy = busy.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], oof = oof.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("away")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oof")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

