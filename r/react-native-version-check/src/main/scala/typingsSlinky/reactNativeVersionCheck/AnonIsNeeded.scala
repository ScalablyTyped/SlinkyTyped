package typingsSlinky.reactNativeVersionCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsNeeded extends js.Object {
  var currentVersion: String = js.native
  var isNeeded: Boolean = js.native
  var latestVersion: String = js.native
  var storeUrl: String = js.native
}

object AnonIsNeeded {
  @scala.inline
  def apply(currentVersion: String, isNeeded: Boolean, latestVersion: String, storeUrl: String): AnonIsNeeded = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], isNeeded = isNeeded.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], storeUrl = storeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsNeeded]
  }
  @scala.inline
  implicit class AnonIsNeededOps[Self <: AnonIsNeeded] (val x: Self) extends AnyVal {
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
    def withIsNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

