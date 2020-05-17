package typingsSlinky.cassandraDriver.mod.token

import typingsSlinky.cassandraDriver.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  def compare(other: Token): Double = js.native
  def equals(other: Token): Boolean = js.native
  def getType(): Code = js.native
  def getValue(): js.Any = js.native
}

object Token {
  @scala.inline
  def apply(compare: Token => Double, equals: Token => Boolean, getType: () => Code, getValue: () => js.Any): Token = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), equals = js.Any.fromFunction1(equals), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompare(value: Token => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: Token => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

