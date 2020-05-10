package typingsSlinky.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArray extends js.Object {
  def array(value: js.Any): Boolean = js.native
  def boolean(value: js.Any): Boolean = js.native
  def integer(value: js.Any): Boolean = js.native
  def `null`(value: js.Any): Boolean = js.native
  def number(value: js.Any): Boolean = js.native
  def `object`(value: js.Any): Boolean = js.native
  def string(value: js.Any): Boolean = js.native
}

object AnonArray {
  @scala.inline
  def apply(
    array: js.Any => Boolean,
    boolean: js.Any => Boolean,
    integer: js.Any => Boolean,
    `null`: js.Any => Boolean,
    number: js.Any => Boolean,
    `object`: js.Any => Boolean,
    string: js.Any => Boolean
  ): AnonArray = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), boolean = js.Any.fromFunction1(boolean), integer = js.Any.fromFunction1(integer), number = js.Any.fromFunction1(number), string = js.Any.fromFunction1(string))
    __obj.updateDynamic("null")(js.Any.fromFunction1(`null`))
    __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
    __obj.asInstanceOf[AnonArray]
  }
  @scala.inline
  implicit class AnonArrayOps[Self <: AnonArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBoolean(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInteger(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNull(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNumber(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObject(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withString(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

