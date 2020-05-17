package typingsSlinky.nodeVagrant.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentVersion extends js.Object {
  var currentVersion: String = js.native
  var latestVersion: String = js.native
  var name: String = js.native
  var status: String = js.native
}

object CurrentVersion {
  @scala.inline
  def apply(currentVersion: String, latestVersion: String, name: String, status: String): CurrentVersion = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentVersion]
  }
  @scala.inline
  implicit class CurrentVersionOps[Self <: CurrentVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

