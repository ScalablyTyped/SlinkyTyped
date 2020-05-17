package typingsSlinky.astTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawRawValue extends js.Object {
  var raw: String = js.native
  var rawValue: Double = js.native
}

object RawRawValue {
  @scala.inline
  def apply(raw: String, rawValue: Double): RawRawValue = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawRawValue]
  }
  @scala.inline
  implicit class RawRawValueOps[Self <: RawRawValue] (val x: Self) extends AnyVal {
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
    def withRawValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

