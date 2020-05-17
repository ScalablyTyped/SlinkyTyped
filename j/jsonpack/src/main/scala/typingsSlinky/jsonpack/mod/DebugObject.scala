package typingsSlinky.jsonpack.mod

import typingsSlinky.jsonpack.anon.Floats
import typingsSlinky.jsonpack.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugObject extends js.Object {
  var ast: js.Array[Index] = js.native
  var dictionary: Floats = js.native
  var packed: String = js.native
}

object DebugObject {
  @scala.inline
  def apply(ast: js.Array[Index], dictionary: Floats, packed: String): DebugObject = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugObject]
  }
  @scala.inline
  implicit class DebugObjectOps[Self <: DebugObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: js.Array[Index]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionary(value: Floats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

