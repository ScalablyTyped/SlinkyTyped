package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineConnection extends js.Object {
  var connectedObjectId: js.UndefOr[String] = js.native
  var connectionSiteIndex: js.UndefOr[Double] = js.native
}

object LineConnection {
  @scala.inline
  def apply(): LineConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineConnection]
  }
  @scala.inline
  implicit class LineConnectionOps[Self <: LineConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectedObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionSiteIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSiteIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionSiteIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSiteIndex")(js.undefined)
        ret
    }
  }
  
}

