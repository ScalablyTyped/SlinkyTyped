package typingsSlinky.mobileDetect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullPattern extends js.Object {
  var fullPattern: js.RegExp
  var shortPattern: js.RegExp
  var tabletPattern: js.RegExp
}

object AnonFullPattern {
  @scala.inline
  def apply(fullPattern: js.RegExp, shortPattern: js.RegExp, tabletPattern: js.RegExp): AnonFullPattern = {
    val __obj = js.Dynamic.literal(fullPattern = fullPattern.asInstanceOf[js.Any], shortPattern = shortPattern.asInstanceOf[js.Any], tabletPattern = tabletPattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFullPattern]
  }
}

