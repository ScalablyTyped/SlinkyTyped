package typingsSlinky.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pos extends js.Object {
  def After(p: Pos): Boolean = js.native
  def Col(): Double = js.native
  def IsValid(): Boolean = js.native
  def Line(): Double = js.native
  def Offset(): Double = js.native
  def String(): java.lang.String = js.native
}

object Pos {
  @scala.inline
  def apply(
    After: Pos => Boolean,
    Col: () => Double,
    IsValid: () => Boolean,
    Line: () => Double,
    Offset: () => Double,
    String: () => String
  ): Pos = {
    val __obj = js.Dynamic.literal(After = js.Any.fromFunction1(After), Col = js.Any.fromFunction0(Col), IsValid = js.Any.fromFunction0(IsValid), Line = js.Any.fromFunction0(Line), Offset = js.Any.fromFunction0(Offset), String = js.Any.fromFunction0(String))
    __obj.asInstanceOf[Pos]
  }
  @scala.inline
  implicit class PosOps[Self <: Pos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: Pos => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("After")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCol(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Col")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLine(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

