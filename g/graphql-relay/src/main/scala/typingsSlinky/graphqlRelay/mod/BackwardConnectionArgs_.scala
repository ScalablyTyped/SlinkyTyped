package typingsSlinky.graphqlRelay.mod

import typingsSlinky.graphqlRelay.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackwardConnectionArgs_ extends js.Object {
  var before: AnonType = js.native
  var last: AnonType = js.native
}

object BackwardConnectionArgs_ {
  @scala.inline
  def apply(before: AnonType, last: AnonType): BackwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackwardConnectionArgs_]
  }
  @scala.inline
  implicit class BackwardConnectionArgs_Ops[Self <: BackwardConnectionArgs_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

