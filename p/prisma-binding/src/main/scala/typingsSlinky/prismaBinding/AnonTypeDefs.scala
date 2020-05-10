package typingsSlinky.prismaBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeDefs extends js.Object {
  var typeDefs: String = js.native
}

object AnonTypeDefs {
  @scala.inline
  def apply(typeDefs: String): AnonTypeDefs = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeDefs]
  }
  @scala.inline
  implicit class AnonTypeDefsOps[Self <: AnonTypeDefs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeDefs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

