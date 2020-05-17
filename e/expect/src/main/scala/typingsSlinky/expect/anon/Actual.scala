package typingsSlinky.expect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actual extends js.Object {
  var actual: js.Any = js.native
  var error: js.Any = js.native
  var expected: Double = js.native
}

object Actual {
  @scala.inline
  def apply(actual: js.Any, error: js.Any, expected: Double): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
  @scala.inline
  implicit class ActualOps[Self <: Actual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActual(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

