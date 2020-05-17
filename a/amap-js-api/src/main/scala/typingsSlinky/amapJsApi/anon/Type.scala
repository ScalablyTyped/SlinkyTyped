package typingsSlinky.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[N /* <: String */] extends js.Object {
  var `type`: N = js.native
}

object Type {
  @scala.inline
  def apply[N](`type`: N): Type[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[N]]
  }
  @scala.inline
  implicit class TypeOps[Self[n] <: Type[n], N] (val x: Self[N]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[N] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[N] with Other]
    @scala.inline
    def withType(value: N): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

