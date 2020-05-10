package typingsSlinky.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedMethodSpec[I] extends MethodSpec[I] {
  /**
    * Implementation.
    */
  var implementation: I = js.native
  /**
    * Signature.
    */
  var types: String = js.native
}

object DetailedMethodSpec {
  @scala.inline
  def apply[I](implementation: I, types: String): DetailedMethodSpec[I] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedMethodSpec[I]]
  }
  @scala.inline
  implicit class DetailedMethodSpecOps[Self[i] <: DetailedMethodSpec[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withImplementation(value: I): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: String): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

