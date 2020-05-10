package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deserializer extends js.Object {
  var name: String = js.native
  def deserialize(state: js.Object): js.Object = js.native
}

object Deserializer {
  @scala.inline
  def apply(deserialize: js.Object => js.Object, name: String): Deserializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deserializer]
  }
  @scala.inline
  implicit class DeserializerOps[Self <: Deserializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeserialize(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

