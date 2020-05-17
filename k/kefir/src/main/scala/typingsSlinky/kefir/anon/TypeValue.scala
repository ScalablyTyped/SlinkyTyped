package typingsSlinky.kefir.anon

import typingsSlinky.kefir.kefirStrings.error
import typingsSlinky.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeValue[E]
  extends Event[js.Any, E] {
  var `type`: error = js.native
  var value: E = js.native
}

object TypeValue {
  @scala.inline
  def apply[E](`type`: error, value: E): TypeValue[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValue[E]]
  }
  @scala.inline
  implicit class TypeValueOps[Self[e] <: TypeValue[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withType(value: error): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: E): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

