package typingsSlinky.androiduix.java_.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringBuilder extends js.Object {
  var array: js.Array[String] = js.native
  def append(a: js.Any): StringBuilder = js.native
  def deleteCharAt(index: Double): StringBuilder = js.native
  def length(): Double = js.native
  def replace(start: Double, end: Double, str: String): StringBuilder = js.native
  def setLength(length: Double): Unit = js.native
}

object StringBuilder {
  @scala.inline
  def apply(
    append: js.Any => StringBuilder,
    array: js.Array[String],
    deleteCharAt: Double => StringBuilder,
    length: () => Double,
    replace: (Double, Double, String) => StringBuilder,
    setLength: Double => Unit
  ): StringBuilder = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), array = array.asInstanceOf[js.Any], deleteCharAt = js.Any.fromFunction1(deleteCharAt), length = js.Any.fromFunction0(length), replace = js.Any.fromFunction3(replace), setLength = js.Any.fromFunction1(setLength))
    __obj.asInstanceOf[StringBuilder]
  }
  @scala.inline
  implicit class StringBuilderOps[Self <: StringBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: js.Any => StringBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArray(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteCharAt(value: Double => StringBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCharAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplace(value: (Double, Double, String) => StringBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetLength(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLength")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

