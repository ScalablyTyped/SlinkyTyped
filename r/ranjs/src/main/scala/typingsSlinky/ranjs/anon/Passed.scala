package typingsSlinky.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Passed extends js.Object {
  var U: Double = js.native
  var passed: Boolean = js.native
}

object Passed {
  @scala.inline
  def apply(U: Double, passed: Boolean): Passed = {
    val __obj = js.Dynamic.literal(U = U.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passed]
  }
  @scala.inline
  implicit class PassedOps[Self <: Passed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withU(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

