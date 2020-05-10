package typingsSlinky.graphqlRelay.mod

import typingsSlinky.graphqlRelay.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardConnectionArgs_ extends js.Object {
  var after: AnonType = js.native
  var first: AnonType = js.native
}

object ForwardConnectionArgs_ {
  @scala.inline
  def apply(after: AnonType, first: AnonType): ForwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardConnectionArgs_]
  }
  @scala.inline
  implicit class ForwardConnectionArgs_Ops[Self <: ForwardConnectionArgs_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

