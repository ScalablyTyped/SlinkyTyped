package typingsSlinky.mirrorx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions_
  extends /* propName */ StringDictionary[js.Any] {
  var routing: routeActions = js.native
}

object Actions_ {
  @scala.inline
  def apply(routing: routeActions): Actions_ = {
    val __obj = js.Dynamic.literal(routing = routing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions_]
  }
  @scala.inline
  implicit class Actions_Ops[Self <: Actions_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouting(value: routeActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

