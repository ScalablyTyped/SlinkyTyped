package typingsSlinky.cypress

import typingsSlinky.cypress.JQuery_.HandleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleObj[TTarget, TData] extends js.Object {
  var handleObj: HandleObject[TTarget, TData] = js.native
}

object AnonHandleObj {
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): AnonHandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandleObj[TTarget, TData]]
  }
  @scala.inline
  implicit class AnonHandleObjOps[Self[ttarget, tdata] <: AnonHandleObj[ttarget, tdata], TTarget, TData] (val x: Self[TTarget, TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget, TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget, TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTarget, TData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTarget, TData]) with Other]
    @scala.inline
    def withHandleObj(value: HandleObject[TTarget, TData]): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleObj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

