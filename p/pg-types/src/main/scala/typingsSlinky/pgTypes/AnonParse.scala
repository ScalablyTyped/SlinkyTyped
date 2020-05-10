package typingsSlinky.pgTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParse extends js.Object {
  def parse(): js.Array[_] = js.native
}

object AnonParse {
  @scala.inline
  def apply(parse: () => js.Array[_]): AnonParse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
    __obj.asInstanceOf[AnonParse]
  }
  @scala.inline
  implicit class AnonParseOps[Self <: AnonParse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

