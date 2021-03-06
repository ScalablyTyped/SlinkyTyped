package typingsSlinky.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cardinal extends js.Object {
  var cardinal: js.Array[String] = js.native
  var ordinal: js.Array[String] = js.native
}

object Cardinal {
  @scala.inline
  def apply(cardinal: js.Array[String], ordinal: js.Array[String]): Cardinal = {
    val __obj = js.Dynamic.literal(cardinal = cardinal.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardinal]
  }
  @scala.inline
  implicit class CardinalOps[Self <: Cardinal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCardinalVarargs(value: String*): Self = this.set("cardinal", js.Array(value :_*))
    @scala.inline
    def setCardinal(value: js.Array[String]): Self = this.set("cardinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrdinalVarargs(value: String*): Self = this.set("ordinal", js.Array(value :_*))
    @scala.inline
    def setOrdinal(value: js.Array[String]): Self = this.set("ordinal", value.asInstanceOf[js.Any])
  }
  
}

