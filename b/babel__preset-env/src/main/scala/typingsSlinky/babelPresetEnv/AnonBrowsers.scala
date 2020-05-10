package typingsSlinky.babelPresetEnv

import typingsSlinky.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrowsers extends _TargetsOptions {
  var browsers: String | js.Array[String] = js.native
}

object AnonBrowsers {
  @scala.inline
  def apply(browsers: String | js.Array[String]): AnonBrowsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowsers]
  }
  @scala.inline
  implicit class AnonBrowsersOps[Self <: AnonBrowsers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowsers(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

