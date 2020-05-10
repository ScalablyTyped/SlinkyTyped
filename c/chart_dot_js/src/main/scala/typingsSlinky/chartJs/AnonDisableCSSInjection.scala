package typingsSlinky.chartJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisableCSSInjection extends js.Object {
  var disableCSSInjection: Boolean = js.native
}

object AnonDisableCSSInjection {
  @scala.inline
  def apply(disableCSSInjection: Boolean): AnonDisableCSSInjection = {
    val __obj = js.Dynamic.literal(disableCSSInjection = disableCSSInjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisableCSSInjection]
  }
  @scala.inline
  implicit class AnonDisableCSSInjectionOps[Self <: AnonDisableCSSInjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCSSInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCSSInjection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

