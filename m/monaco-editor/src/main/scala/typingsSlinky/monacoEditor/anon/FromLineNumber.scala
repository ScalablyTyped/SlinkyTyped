package typingsSlinky.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromLineNumber extends js.Object {
  /**
    * The start of the range (inclusive)
    */
  val fromLineNumber: Double = js.native
  /**
    * The end of the range (inclusive)
    */
  val toLineNumber: Double = js.native
}

object FromLineNumber {
  @scala.inline
  def apply(fromLineNumber: Double, toLineNumber: Double): FromLineNumber = {
    val __obj = js.Dynamic.literal(fromLineNumber = fromLineNumber.asInstanceOf[js.Any], toLineNumber = toLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromLineNumber]
  }
  @scala.inline
  implicit class FromLineNumberOps[Self <: FromLineNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

