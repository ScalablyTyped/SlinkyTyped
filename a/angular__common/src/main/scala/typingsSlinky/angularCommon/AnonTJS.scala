package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTJS extends js.Object {
  var JPY: js.Array[String] = js.native
  var TJS: js.Array[String] = js.native
}

object AnonTJS {
  @scala.inline
  def apply(JPY: js.Array[String], TJS: js.Array[String]): AnonTJS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TJS = TJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTJS]
  }
  @scala.inline
  implicit class AnonTJSOps[Self <: AnonTJS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTJS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TJS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

