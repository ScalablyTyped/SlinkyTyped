package typingsSlinky.reactNativeEasyUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasNewVersion extends js.Object {
  var hasNewVersion: Boolean = js.native
  var latestVersion: String = js.native
  var localVersion: String = js.native
  var lookupInfo: AnonDictkey = js.native
  var trackViewUrl: String = js.native
}

object AnonHasNewVersion {
  @scala.inline
  def apply(
    hasNewVersion: Boolean,
    latestVersion: String,
    localVersion: String,
    lookupInfo: AnonDictkey,
    trackViewUrl: String
  ): AnonHasNewVersion = {
    val __obj = js.Dynamic.literal(hasNewVersion = hasNewVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], localVersion = localVersion.asInstanceOf[js.Any], lookupInfo = lookupInfo.asInstanceOf[js.Any], trackViewUrl = trackViewUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasNewVersion]
  }
  @scala.inline
  implicit class AnonHasNewVersionOps[Self <: AnonHasNewVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNewVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookupInfo(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackViewUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackViewUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

