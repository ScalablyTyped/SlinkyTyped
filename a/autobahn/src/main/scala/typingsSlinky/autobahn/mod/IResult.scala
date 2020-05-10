package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResult extends js.Object {
  var args: js.Array[_] = js.native
  var kwargs: js.Any = js.native
}

object IResult {
  @scala.inline
  def apply(args: js.Array[_], kwargs: js.Any): IResult = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kwargs = kwargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  @scala.inline
  implicit class IResultOps[Self <: IResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKwargs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kwargs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

