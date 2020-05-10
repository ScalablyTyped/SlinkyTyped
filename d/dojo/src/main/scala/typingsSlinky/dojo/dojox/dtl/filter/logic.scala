package typingsSlinky.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/logic.html
  *
  *
  */
@js.native
trait logic extends js.Object {
  /**
    * If value is unavailable, use given default
    *
    * @param value
    * @param arg
    */
  def default_(value: js.Any, arg: js.Any): String = js.native
  /**
    * If value is null, use given default
    *
    * @param value
    * @param arg
    */
  def default_if_none(value: js.Any, arg: js.Any): String = js.native
  /**
    * Returns true if the value is divisible by the argument"
    *
    * @param value
    * @param arg
    */
  def divisibleby(value: js.Any, arg: js.Any): Boolean = js.native
  /**
    * arg being a comma-delimited string, value of true/false/none
    * chooses the appropriate item from the string
    *
    * @param value
    * @param arg
    */
  def yesno(value: js.Any, arg: js.Any): js.Any = js.native
}

object logic {
  @scala.inline
  def apply(
    default_ : (js.Any, js.Any) => String,
    default_if_none: (js.Any, js.Any) => String,
    divisibleby: (js.Any, js.Any) => Boolean,
    yesno: (js.Any, js.Any) => js.Any
  ): logic = {
    val __obj = js.Dynamic.literal(default_ = js.Any.fromFunction2(default_), default_if_none = js.Any.fromFunction2(default_if_none), divisibleby = js.Any.fromFunction2(divisibleby), yesno = js.Any.fromFunction2(yesno))
    __obj.asInstanceOf[logic]
  }
  @scala.inline
  implicit class logicOps[Self <: logic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDefault_if_none(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_if_none")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDivisibleby(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisibleby")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withYesno(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yesno")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

