package typingsSlinky.rbx

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0[TDefaultComponent /* <: ReactComponentClass[_] */] extends js.Object {
  var as: TDefaultComponent = js.native
}

object Anon0 {
  @scala.inline
  def apply[TDefaultComponent](as: TDefaultComponent): Anon0[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[TDefaultComponent]]
  }
  @scala.inline
  implicit class Anon0Ops[Self[tdefaultcomponent] <: Anon0[tdefaultcomponent], TDefaultComponent] (val x: Self[TDefaultComponent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDefaultComponent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDefaultComponent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDefaultComponent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDefaultComponent] with Other]
    @scala.inline
    def withAs(value: TDefaultComponent): Self[TDefaultComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

