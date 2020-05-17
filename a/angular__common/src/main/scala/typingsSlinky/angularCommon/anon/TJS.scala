package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TJS extends js.Object {
  var JPY: js.Array[String] = js.native
  var TJS: js.Array[String] = js.native
}

object TJS {
  @scala.inline
  def apply(JPY: js.Array[String], TJS: js.Array[String]): TJS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TJS = TJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TJS]
  }
  @scala.inline
  implicit class TJSOps[Self <: TJS] (val x: Self) extends AnyVal {
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

