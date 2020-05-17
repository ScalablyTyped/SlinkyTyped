package typingsSlinky.jestJasmine2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetColumnNumber extends js.Object {
  def getColumnNumber(): Double = js.native
  def getLineNumber(): Double = js.native
}

object GetColumnNumber {
  @scala.inline
  def apply(getColumnNumber: () => Double, getLineNumber: () => Double): GetColumnNumber = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getLineNumber = js.Any.fromFunction0(getLineNumber))
    __obj.asInstanceOf[GetColumnNumber]
  }
  @scala.inline
  implicit class GetColumnNumberOps[Self <: GetColumnNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColumnNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineNumber")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

