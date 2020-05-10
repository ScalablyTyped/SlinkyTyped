package typingsSlinky.imagemagick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeArgs_ extends js.Object {
  var args: js.Array[String] = js.native
  var opt: Options = js.native
}

object ResizeArgs_ {
  @scala.inline
  def apply(args: js.Array[String], opt: Options): ResizeArgs_ = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], opt = opt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeArgs_]
  }
  @scala.inline
  implicit class ResizeArgs_Ops[Self <: ResizeArgs_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpt(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

