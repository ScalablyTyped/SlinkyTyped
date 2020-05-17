package typingsSlinky.flatpickr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Longhand extends js.Object {
  var longhand: js.Tuple7[String, String, String, String, String, String, String] = js.native
  var shorthand: js.Tuple7[String, String, String, String, String, String, String] = js.native
}

object Longhand {
  @scala.inline
  def apply(
    longhand: js.Tuple7[String, String, String, String, String, String, String],
    shorthand: js.Tuple7[String, String, String, String, String, String, String]
  ): Longhand = {
    val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longhand]
  }
  @scala.inline
  implicit class LonghandOps[Self <: Longhand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLonghand(value: js.Tuple7[String, String, String, String, String, String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longhand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShorthand(value: js.Tuple7[String, String, String, String, String, String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

