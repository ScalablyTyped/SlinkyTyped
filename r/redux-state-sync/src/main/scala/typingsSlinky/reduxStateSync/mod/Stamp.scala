package typingsSlinky.reduxStateSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stamp extends js.Object {
  @JSName("$isSync")
  var $isSync: Boolean = js.native
  @JSName("$uuid")
  var $uuid: String = js.native
  @JSName("$wuid")
  var $wuid: String = js.native
}

object Stamp {
  @scala.inline
  def apply($isSync: Boolean, $uuid: String, $wuid: String): Stamp = {
    val __obj = js.Dynamic.literal($isSync = $isSync.asInstanceOf[js.Any], $uuid = $uuid.asInstanceOf[js.Any], $wuid = $wuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stamp]
  }
  @scala.inline
  implicit class StampOps[Self <: Stamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$isSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$wuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$wuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

