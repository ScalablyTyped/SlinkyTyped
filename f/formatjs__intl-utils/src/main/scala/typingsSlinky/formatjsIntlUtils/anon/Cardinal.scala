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
    def withCardinal(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrdinal(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

