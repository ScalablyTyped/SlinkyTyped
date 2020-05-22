package typingsSlinky.nodeForge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotAfter extends js.Object {
  var notAfter: js.Date
  var notBefore: js.Date
}

object NotAfter {
  @scala.inline
  def apply(notAfter: js.Date, notBefore: js.Date): NotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAfter]
  }
}

