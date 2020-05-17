package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CriticalBoolean extends js.Object {
  var critical: Boolean = js.native
}

object CriticalBoolean {
  @scala.inline
  def apply(critical: Boolean): CriticalBoolean = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriticalBoolean]
  }
  @scala.inline
  implicit class CriticalBooleanOps[Self <: CriticalBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

