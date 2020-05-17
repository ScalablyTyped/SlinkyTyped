package typingsSlinky.openapiFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enum extends js.Object {
  var enum: js.Array[java.lang.String] = js.native
}

object Enum {
  @scala.inline
  def apply(enum: js.Array[java.lang.String]): Enum = {
    val __obj = js.Dynamic.literal(enum = enum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enum]
  }
  @scala.inline
  implicit class EnumOps[Self <: Enum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnum(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

