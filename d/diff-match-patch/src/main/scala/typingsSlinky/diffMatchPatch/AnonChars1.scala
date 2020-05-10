package typingsSlinky.diffMatchPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChars1 extends js.Object {
  var chars1: String = js.native
  var chars2: String = js.native
  var lineArray: js.Array[String] = js.native
}

object AnonChars1 {
  @scala.inline
  def apply(chars1: String, chars2: String, lineArray: js.Array[String]): AnonChars1 = {
    val __obj = js.Dynamic.literal(chars1 = chars1.asInstanceOf[js.Any], chars2 = chars2.asInstanceOf[js.Any], lineArray = lineArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChars1]
  }
  @scala.inline
  implicit class AnonChars1Ops[Self <: AnonChars1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChars1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chars1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChars2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chars2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineArray(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

