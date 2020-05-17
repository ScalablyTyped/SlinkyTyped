package typingsSlinky.rbx.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As[TAsComponent /* <: ReactComponentClass[_] */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.native
}

object As {
  @scala.inline
  def apply[TAsComponent](): As[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[TAsComponent]]
  }
  @scala.inline
  implicit class AsOps[Self[tascomponent] <: As[tascomponent], TAsComponent] (val x: Self[TAsComponent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TAsComponent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TAsComponent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TAsComponent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TAsComponent] with Other]
    @scala.inline
    def withAs(value: TAsComponent): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
  }
  
}

