package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait To extends js.Object {
  var _from: String = js.native
  var _to: String = js.native
}

object To {
  @scala.inline
  def apply(_from: String, _to: String): To = {
    val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _to = _to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  @scala.inline
  implicit class ToOps[Self <: To] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_from(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

