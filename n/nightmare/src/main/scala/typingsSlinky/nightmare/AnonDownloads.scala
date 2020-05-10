package typingsSlinky.nightmare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDownloads extends js.Object {
  var downloads: js.UndefOr[String] = js.native
}

object AnonDownloads {
  @scala.inline
  def apply(): AnonDownloads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDownloads]
  }
  @scala.inline
  implicit class AnonDownloadsOps[Self <: AnonDownloads] (val x: Self) extends AnyVal {
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

