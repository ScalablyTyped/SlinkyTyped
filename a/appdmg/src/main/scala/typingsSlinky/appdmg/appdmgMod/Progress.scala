package typingsSlinky.appdmg.appdmgMod

import typingsSlinky.appdmg.appdmgStrings.`step-begin`
import typingsSlinky.appdmg.appdmgStrings.`step-end`
import typingsSlinky.appdmg.appdmgStrings.fail
import typingsSlinky.appdmg.appdmgStrings.ok
import typingsSlinky.appdmg.appdmgStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var current: Double
  var status: ok | skip | fail
  var title: String
  var total: Double
  var `type`: `step-begin` | `step-end`
}

object Progress {
  @scala.inline
  def apply(
    current: Double,
    status: ok | skip | fail,
    title: String,
    total: Double,
    `type`: `step-begin` | `step-end`
  ): Progress = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

