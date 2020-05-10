package typingsSlinky.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jasmine extends js.Object {
  var Spec: typingsSlinky.chunkedDc.jasmine.Spec = js.native
  var clock: Clock_ = js.native
  var util: Util = js.native
}

object Jasmine {
  @scala.inline
  def apply(Spec: Spec, clock: Clock_, util: Util): Jasmine = {
    val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jasmine]
  }
  @scala.inline
  implicit class JasmineOps[Self <: Jasmine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpec(value: Spec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClock(value: Clock_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtil(value: Util): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("util")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

