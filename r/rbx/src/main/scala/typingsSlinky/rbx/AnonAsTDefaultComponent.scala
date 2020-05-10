package typingsSlinky.rbx

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsTDefaultComponent[TDefaultComponent /* <: ReactComponentClass[_] */] extends js.Object {
  var as: TDefaultComponent = js.native
}

object AnonAsTDefaultComponent {
  @scala.inline
  def apply[TDefaultComponent](as: TDefaultComponent): AnonAsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsTDefaultComponent[TDefaultComponent]]
  }
  @scala.inline
  implicit class AnonAsTDefaultComponentOps[Self[tdefaultcomponent] <: AnonAsTDefaultComponent[tdefaultcomponent], TDefaultComponent] (val x: Self[TDefaultComponent]) extends AnyVal {
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

