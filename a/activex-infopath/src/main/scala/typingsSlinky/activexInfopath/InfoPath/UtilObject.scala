package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilObject extends js.Object {
  val Date: VarDate = js.native
  @JSName("InfoPath.UtilObject_typekey")
  var InfoPathDotUtilObject_typekey: UtilObject = js.native
  val Math: MathObject = js.native
  def Match(bstrValue: String, bstrPattern: String): Boolean = js.native
}

object UtilObject {
  @scala.inline
  def apply(
    Date: VarDate,
    InfoPathDotUtilObject_typekey: UtilObject,
    Match: (String, String) => Boolean,
    Math: MathObject
  ): UtilObject = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Match = js.Any.fromFunction2(Match), Math = Math.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.UtilObject_typekey")(InfoPathDotUtilObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilObject]
  }
  @scala.inline
  implicit class UtilObjectOps[Self <: UtilObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotUtilObject_typekey(value: UtilObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.UtilObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Match")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMath(value: MathObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Math")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

