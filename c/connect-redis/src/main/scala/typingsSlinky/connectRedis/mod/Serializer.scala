package typingsSlinky.connectRedis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer extends js.Object {
  var parse: js.Function = js.native
  var stringify: js.Function = js.native
}

object Serializer {
  @scala.inline
  def apply(parse: js.Function, stringify: js.Function): Serializer = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serializer]
  }
  @scala.inline
  implicit class SerializerOps[Self <: Serializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringify(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

