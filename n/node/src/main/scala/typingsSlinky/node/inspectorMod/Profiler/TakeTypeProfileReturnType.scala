package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakeTypeProfileReturnType extends js.Object {
  /**
    * Type profile for all scripts since startTypeProfile() was turned on.
    */
  var result: js.Array[ScriptTypeProfile] = js.native
}

object TakeTypeProfileReturnType {
  @scala.inline
  def apply(result: js.Array[ScriptTypeProfile]): TakeTypeProfileReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeTypeProfileReturnType]
  }
  @scala.inline
  implicit class TakeTypeProfileReturnTypeOps[Self <: TakeTypeProfileReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: js.Array[ScriptTypeProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

