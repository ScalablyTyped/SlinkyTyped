package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.lokijsStrings.normal
import typingsSlinky.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializationMethod extends js.Object {
  var serializationMethod: js.UndefOr[normal | pretty] = js.native
}

object SerializationMethod {
  @scala.inline
  def apply(): SerializationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializationMethod]
  }
  @scala.inline
  implicit class SerializationMethodOps[Self <: SerializationMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerializationMethod(value: normal | pretty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMethod")(js.undefined)
        ret
    }
  }
  
}

