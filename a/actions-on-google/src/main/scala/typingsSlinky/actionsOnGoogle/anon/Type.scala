package typingsSlinky.actionsOnGoogle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[TType] extends js.Object {
  var `@type`: TType = js.native
}

object Type {
  @scala.inline
  def apply[TType](`@type`: TType): Type[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[TType]]
  }
  @scala.inline
  implicit class TypeOps[Self[ttype] <: Type[ttype], TType] (val x: Self[TType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TType] with Other]
    @scala.inline
    def `with@type`(value: TType): Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

