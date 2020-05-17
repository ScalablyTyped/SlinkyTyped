package typingsSlinky.reactNativeAppsflyer.mod

import typingsSlinky.reactNativeAppsflyer.anon.Dictkey
import typingsSlinky.reactNativeAppsflyer.reactNativeAppsflyerStrings.failure
import typingsSlinky.reactNativeAppsflyer.reactNativeAppsflyerStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionData extends js.Object {
  var data: Dictkey = js.native
  var status: success | failure = js.native
  var `type`: String = js.native
}

object ConversionData {
  @scala.inline
  def apply(data: Dictkey, status: success | failure, `type`: String): ConversionData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionData]
  }
  @scala.inline
  implicit class ConversionDataOps[Self <: ConversionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: success | failure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

