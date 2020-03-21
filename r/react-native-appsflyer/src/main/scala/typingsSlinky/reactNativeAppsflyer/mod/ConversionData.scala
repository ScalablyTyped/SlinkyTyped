package typingsSlinky.reactNativeAppsflyer.mod

import typingsSlinky.reactNativeAppsflyer.AnonDictkey
import typingsSlinky.reactNativeAppsflyer.reactNativeAppsflyerStrings.failure
import typingsSlinky.reactNativeAppsflyer.reactNativeAppsflyerStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionData extends js.Object {
  var data: AnonDictkey
  var status: success | failure
  var `type`: String
}

object ConversionData {
  @scala.inline
  def apply(data: AnonDictkey, status: success | failure, `type`: String): ConversionData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionData]
  }
}

