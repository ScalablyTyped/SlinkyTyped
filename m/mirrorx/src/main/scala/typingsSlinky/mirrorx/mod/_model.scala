package typingsSlinky.mirrorx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _model extends js.Object {
  var name: String = js.native
  var reducers: js.Any = js.native
}

object _model {
  @scala.inline
  def apply(name: String, reducers: js.Any): _model = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_model]
  }
  @scala.inline
  implicit class _modelOps[Self <: _model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReducers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

