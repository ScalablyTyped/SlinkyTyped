package typingsSlinky.nightmare.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Downloads extends js.Object {
  var downloads: js.UndefOr[String] = js.native
}

object Downloads {
  @scala.inline
  def apply(): Downloads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Downloads]
  }
  @scala.inline
  implicit class DownloadsOps[Self <: Downloads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloads")(js.undefined)
        ret
    }
  }
  
}

