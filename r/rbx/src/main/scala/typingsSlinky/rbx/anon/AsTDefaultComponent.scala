package typingsSlinky.rbx.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsTDefaultComponent[TDefaultComponent /* <: ReactComponentClass[_] */] extends js.Object {
  var as: TDefaultComponent = js.native
}

object AsTDefaultComponent {
  @scala.inline
  def apply[TDefaultComponent](as: TDefaultComponent): AsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsTDefaultComponent[TDefaultComponent]]
  }
  @scala.inline
  implicit class AsTDefaultComponentOps[Self[tdefaultcomponent] <: AsTDefaultComponent[tdefaultcomponent], TDefaultComponent] (val x: Self[TDefaultComponent]) extends AnyVal {
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

