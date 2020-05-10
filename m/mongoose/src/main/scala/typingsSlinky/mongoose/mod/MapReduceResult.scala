package typingsSlinky.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapReduceResult[Key, Val] extends js.Object {
  var _id: Key = js.native
  var value: Val = js.native
}

object MapReduceResult {
  @scala.inline
  def apply[Key, Val](_id: Key, value: Val): MapReduceResult[Key, Val] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapReduceResult[Key, Val]]
  }
  @scala.inline
  implicit class MapReduceResultOps[Self[key, `val`] <: MapReduceResult[key, `val`], Key, Val] (val x: Self[Key, Val]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Key, Val] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Key, Val]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Key, Val]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Key, Val]) with Other]
    @scala.inline
    def with_id(value: Key): Self[Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Val): Self[Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

