package typingsSlinky.pg

import typingsSlinky.pgTypes.AnonParse
import typingsSlinky.pgTypes.mod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofarrayParser extends js.Object {
  def create(source: js.Any, transform: TypeParser): AnonParse = js.native
}

object TypeofarrayParser {
  @scala.inline
  def apply(create: (js.Any, TypeParser) => AnonParse): TypeofarrayParser = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[TypeofarrayParser]
  }
  @scala.inline
  implicit class TypeofarrayParserOps[Self <: TypeofarrayParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (js.Any, TypeParser) => AnonParse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

