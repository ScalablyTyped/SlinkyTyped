package typingsSlinky.chaiLike.mod.ChaiLike

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  def assert(`object`: js.Any, expected: js.Any): Boolean = js.native
  def `match`(`object`: js.Any, expected: js.Any): Boolean = js.native
}

object Plugin {
  @scala.inline
  def apply(assert: (js.Any, js.Any) => Boolean, `match`: (js.Any, js.Any) => Boolean): Plugin = {
    val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2(assert))
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatch(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

