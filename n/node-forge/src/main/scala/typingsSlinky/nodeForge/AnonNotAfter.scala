package typingsSlinky.nodeForge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotAfter extends js.Object {
  var notAfter: js.Date
  var notBefore: js.Date
}

object AnonNotAfter {
  @scala.inline
  def apply(notAfter: js.Date, notBefore: js.Date): AnonNotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNotAfter]
  }
}

