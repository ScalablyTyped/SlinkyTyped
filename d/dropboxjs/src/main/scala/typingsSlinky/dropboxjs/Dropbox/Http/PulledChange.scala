package typingsSlinky.dropboxjs.Dropbox.Http

import typingsSlinky.dropboxjs.Dropbox.File.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PulledChange extends js.Object {
  var path: String = js.native
  var stat: Stat = js.native
  var wasRemoved: Boolean = js.native
}

object PulledChange {
  @scala.inline
  def apply(path: String, stat: Stat, wasRemoved: Boolean): PulledChange = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], wasRemoved = wasRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulledChange]
  }
  @scala.inline
  implicit class PulledChangeOps[Self <: PulledChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStat(value: Stat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasRemoved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

