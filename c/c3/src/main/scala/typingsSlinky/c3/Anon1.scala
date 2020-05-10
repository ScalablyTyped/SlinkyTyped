package typingsSlinky.c3

import typingsSlinky.c3.c3Strings.`step-after`
import typingsSlinky.c3.c3Strings.`step-before`
import typingsSlinky.c3.c3Strings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1 extends js.Object {
  /**
    * Change step type for step chart.
    * Defaults to `"step"`.
    */
  var `type`: step | `step-before` | `step-after` = js.native
}

object Anon1 {
  @scala.inline
  def apply(`type`: step | `step-before` | `step-after`): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
  @scala.inline
  implicit class Anon1Ops[Self <: Anon1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: step | `step-before` | `step-after`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

