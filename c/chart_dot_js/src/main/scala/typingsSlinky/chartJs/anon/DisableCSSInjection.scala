package typingsSlinky.chartJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableCSSInjection extends js.Object {
  var disableCSSInjection: Boolean = js.native
}

object DisableCSSInjection {
  @scala.inline
  def apply(disableCSSInjection: Boolean): DisableCSSInjection = {
    val __obj = js.Dynamic.literal(disableCSSInjection = disableCSSInjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableCSSInjection]
  }
  @scala.inline
  implicit class DisableCSSInjectionOps[Self <: DisableCSSInjection] (val x: Self) extends AnyVal {
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

