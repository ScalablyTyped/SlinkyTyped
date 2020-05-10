package typingsSlinky.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/integers.html
  *
  *
  */
@js.native
trait integers extends js.Object {
  /**
    *
    * @param value
    * @param arg
    */
  def add(value: js.Any, arg: js.Any): Double = js.native
  /**
    * Given a whole number, returns the 1-based requested digit of it
    *
    * @param value
    * @param arg
    */
  def get_digit(value: js.Any, arg: js.Any): Double = js.native
}

object integers {
  @scala.inline
  def apply(add: (js.Any, js.Any) => Double, get_digit: (js.Any, js.Any) => Double): integers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get_digit = js.Any.fromFunction2(get_digit))
    __obj.asInstanceOf[integers]
  }
  @scala.inline
  implicit class integersOps[Self <: integers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet_digit(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_digit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

