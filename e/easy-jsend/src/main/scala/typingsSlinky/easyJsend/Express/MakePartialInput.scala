package typingsSlinky.easyJsend.Express

import typingsSlinky.easyJsend.AnonLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakePartialInput extends js.Object {
  var model: js.Any = js.native
  var opts: AnonLimit = js.native
  var result: js.Any = js.native
  var search: js.Object = js.native
}

object MakePartialInput {
  @scala.inline
  def apply(model: js.Any, opts: AnonLimit, result: js.Any, search: js.Object): MakePartialInput = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakePartialInput]
  }
  @scala.inline
  implicit class MakePartialInputOps[Self <: MakePartialInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: AnonLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

