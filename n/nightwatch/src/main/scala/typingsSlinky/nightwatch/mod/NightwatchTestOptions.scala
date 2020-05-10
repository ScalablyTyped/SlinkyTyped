package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchTestOptions extends NightwatchTestSettingGeneric {
  var screenshots: Boolean = js.native
  var screenshotsPath: String = js.native
}

object NightwatchTestOptions {
  @scala.inline
  def apply(screenshots: Boolean, screenshotsPath: String): NightwatchTestOptions = {
    val __obj = js.Dynamic.literal(screenshots = screenshots.asInstanceOf[js.Any], screenshotsPath = screenshotsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestOptions]
  }
  @scala.inline
  implicit class NightwatchTestOptionsOps[Self <: NightwatchTestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreenshots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenshotsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotsPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

