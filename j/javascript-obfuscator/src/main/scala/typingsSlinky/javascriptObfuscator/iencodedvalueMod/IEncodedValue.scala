package typingsSlinky.javascriptObfuscator.iencodedvalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEncodedValue extends js.Object {
  var encodedValue: String = js.native
  var key: String | Null = js.native
}

object IEncodedValue {
  @scala.inline
  def apply(encodedValue: String): IEncodedValue = {
    val __obj = js.Dynamic.literal(encodedValue = encodedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncodedValue]
  }
  @scala.inline
  implicit class IEncodedValueOps[Self <: IEncodedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
  }
  
}

