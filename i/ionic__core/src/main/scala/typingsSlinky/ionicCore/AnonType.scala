package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.ionicCoreStrings.error
import typingsSlinky.ionicCore.ionicCoreStrings.success
import typingsSlinky.ionicCore.ionicCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: error | success | warning
}

object AnonType {
  @scala.inline
  def apply(`type`: error | success | warning): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

