package typingsSlinky.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRawString extends js.Object {
  var raw: String = js.native
  var rawValue: String = js.native
}

object AnonRawString {
  @scala.inline
  def apply(raw: String, rawValue: String): AnonRawString = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRawString]
  }
  @scala.inline
  implicit class AnonRawStringOps[Self <: AnonRawString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

