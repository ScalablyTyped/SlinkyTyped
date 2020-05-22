package typingsSlinky.ionicCore.anon

import typingsSlinky.ionicCore.ionicCoreStrings.error
import typingsSlinky.ionicCore.ionicCoreStrings.success
import typingsSlinky.ionicCore.ionicCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: error | success | warning
}

object Type {
  @scala.inline
  def apply(`type`: error | success | warning): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

