package typingsSlinky.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultState extends js.Object {
  var fields: js.Object = js.native
  var unset: js.Array[String] = js.native
}

object DefaultState {
  @scala.inline
  def apply(fields: js.Object, unset: js.Array[String]): DefaultState = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], unset = unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultState]
  }
  @scala.inline
  implicit class DefaultStateOps[Self <: DefaultState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnset(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

