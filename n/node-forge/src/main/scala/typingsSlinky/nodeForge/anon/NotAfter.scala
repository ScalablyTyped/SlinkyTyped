package typingsSlinky.nodeForge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotAfter extends js.Object {
  var notAfter: js.Date = js.native
  var notBefore: js.Date = js.native
}

object NotAfter {
  @scala.inline
  def apply(notAfter: js.Date, notBefore: js.Date): NotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAfter]
  }
  @scala.inline
  implicit class NotAfterOps[Self <: NotAfter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotAfter(value: js.Date): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotBefore(value: js.Date): Self = this.set("notBefore", value.asInstanceOf[js.Any])
  }
  
}

