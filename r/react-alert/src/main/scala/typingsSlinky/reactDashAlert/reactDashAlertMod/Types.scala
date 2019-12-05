package typingsSlinky.reactDashAlert.reactDashAlertMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reactDashAlert.reactDashAlertStrings.error
import typingsSlinky.reactDashAlert.reactDashAlertStrings.info
import typingsSlinky.reactDashAlert.reactDashAlertStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var ERROR: error
  var INFO: info
  var SUCCESS: success
}

object Types {
  @scala.inline
  def apply(ERROR: error, INFO: info, SUCCESS: success): Types = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types]
  }
}

@JSImport("react-alert", "types")
@js.native
object types extends TopLevel[Types]

