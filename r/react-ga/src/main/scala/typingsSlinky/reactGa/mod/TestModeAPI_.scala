package typingsSlinky.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestModeAPI_ extends js.Object {
  var calls: js.Array[js.Array[_]] = js.native
  var resetCalls: js.Function = js.native
  def ga(args: js.Any*): js.Any = js.native
}

object TestModeAPI_ {
  @scala.inline
  def apply(calls: js.Array[js.Array[_]], ga: /* repeated */ js.Any => js.Any, resetCalls: js.Function): TestModeAPI_ = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], ga = js.Any.fromFunction1(ga), resetCalls = resetCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestModeAPI_]
  }
  @scala.inline
  implicit class TestModeAPI_Ops[Self <: TestModeAPI_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalls(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGa(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ga")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetCalls(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCalls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

