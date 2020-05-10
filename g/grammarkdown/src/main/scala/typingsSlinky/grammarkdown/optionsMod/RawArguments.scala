package typingsSlinky.grammarkdown.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawArguments extends js.Object {
  var args: js.Array[RawArgument] = js.native
  var rest: js.Array[String] = js.native
}

object RawArguments {
  @scala.inline
  def apply(args: js.Array[RawArgument], rest: js.Array[String]): RawArguments = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawArguments]
  }
  @scala.inline
  implicit class RawArgumentsOps[Self <: RawArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[RawArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRest(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

