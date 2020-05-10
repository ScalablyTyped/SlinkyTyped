package typingsSlinky.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMethodSpec[I] extends MethodSpec[I] {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  /**
    * Implementation.
    */
  var implementation: I = js.native
  /**
    * Return type.
    */
  var retType: String = js.native
}

object SimpleMethodSpec {
  @scala.inline
  def apply[I](argTypes: js.Array[String], implementation: I, retType: String): SimpleMethodSpec[I] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMethodSpec[I]]
  }
  @scala.inline
  implicit class SimpleMethodSpecOps[Self[i] <: SimpleMethodSpec[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withArgTypes(value: js.Array[String]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementation(value: I): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetType(value: String): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

