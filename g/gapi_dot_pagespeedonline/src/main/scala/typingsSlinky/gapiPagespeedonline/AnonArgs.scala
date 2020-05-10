package typingsSlinky.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgs extends js.Object {
  /**
    * List of arguments for the format string.
    */
  var args: js.Array[AnonType] = js.native
  /**
    * A localized format string with $N placeholders, where N is the 1-indexed argument number.
    */
  var format: String = js.native
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[AnonType], format: String): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
  @scala.inline
  implicit class AnonArgsOps[Self <: AnonArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[AnonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

