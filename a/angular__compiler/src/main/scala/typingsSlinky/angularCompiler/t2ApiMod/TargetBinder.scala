package typingsSlinky.angularCompiler.t2ApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetBinder[D /* <: DirectiveMeta */] extends js.Object {
  def bind(target: Target): BoundTarget[D] = js.native
}

object TargetBinder {
  @scala.inline
  def apply[D](bind: Target => BoundTarget[D]): TargetBinder[D] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind))
    __obj.asInstanceOf[TargetBinder[D]]
  }
  @scala.inline
  implicit class TargetBinderOps[Self[d] <: TargetBinder[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withBind(value: Target => BoundTarget[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

