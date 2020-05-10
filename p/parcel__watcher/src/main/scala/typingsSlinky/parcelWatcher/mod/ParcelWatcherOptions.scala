package typingsSlinky.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelWatcherOptions extends js.Object {
  var backend: js.UndefOr[ParcelWatcherBackend] = js.native
  var ignore: js.UndefOr[js.Array[String]] = js.native
}

object ParcelWatcherOptions {
  @scala.inline
  def apply(): ParcelWatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParcelWatcherOptions]
  }
  @scala.inline
  implicit class ParcelWatcherOptionsOps[Self <: ParcelWatcherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackend(value: ParcelWatcherBackend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
  }
  
}

