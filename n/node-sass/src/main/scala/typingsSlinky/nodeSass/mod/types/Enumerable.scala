package typingsSlinky.nodeSass.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enumerable extends js.Object {
  def getLength(): Double = js.native
  def getValue(index: Double): Value = js.native
  def setValue(index: Double, value: Value): Unit = js.native
}

object Enumerable {
  @scala.inline
  def apply(getLength: () => Double, getValue: Double => Value, setValue: (Double, Value) => Unit): Enumerable = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getValue = js.Any.fromFunction1(getValue), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[Enumerable]
  }
  @scala.inline
  implicit class EnumerableOps[Self <: Enumerable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: Double => Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (Double, Value) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

