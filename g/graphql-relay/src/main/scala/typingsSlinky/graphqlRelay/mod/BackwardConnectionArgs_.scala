package typingsSlinky.graphqlRelay.mod

import typingsSlinky.graphqlRelay.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackwardConnectionArgs_ extends js.Object {
  var before: Type = js.native
  var last: Type = js.native
}

object BackwardConnectionArgs_ {
  @scala.inline
  def apply(before: Type, last: Type): BackwardConnectionArgs_ = {
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
    def withBefore(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

