package typingsSlinky.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jasmine extends js.Object {
  var _DEFAULT_TIMEOUT_INTERVAL: js.UndefOr[Double] = js.native
  var addMatchers: js.Function = js.native
}

object Jasmine {
  @scala.inline
  def apply(addMatchers: js.Function): Jasmine = {
    val __obj = js.Dynamic.literal(addMatchers = addMatchers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jasmine]
  }
  @scala.inline
  implicit class JasmineOps[Self <: Jasmine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMatchers(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMatchers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_DEFAULT_TIMEOUT_INTERVAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_TIMEOUT_INTERVAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_DEFAULT_TIMEOUT_INTERVAL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_TIMEOUT_INTERVAL")(js.undefined)
        ret
    }
  }
  
}

