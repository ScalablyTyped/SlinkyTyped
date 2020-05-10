package typingsSlinky.dojo.dojox.mvc.StatefulModel

import typingsSlinky.dojo.dojox.mvc.StatefulArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulModel.getPlainValueOptions.html
  *
  * An object that defines how plain value should be created from model object.
  *
  */
@js.native
trait getPlainValueOptions extends js.Object {
  /**
    *
    * @param a
    */
  def getPlainArray(a: StatefulArray): js.Any = js.native
  /**
    *
    * @param o
    */
  def getPlainObject(o: typingsSlinky.dojo.dojox.mvc.StatefulModel): js.Object = js.native
  /**
    *
    * @param v
    */
  def getPlainValue(v: js.Any): js.Any = js.native
  /**
    * Returns the type of the given value.
    *
    * @param v The value.
    */
  def getType(v: js.Any): String = js.native
}

object getPlainValueOptions {
  @scala.inline
  def apply(
    getPlainArray: StatefulArray => js.Any,
    getPlainObject: typingsSlinky.dojo.dojox.mvc.StatefulModel => js.Object,
    getPlainValue: js.Any => js.Any,
    getType: js.Any => String
  ): getPlainValueOptions = {
    val __obj = js.Dynamic.literal(getPlainArray = js.Any.fromFunction1(getPlainArray), getPlainObject = js.Any.fromFunction1(getPlainObject), getPlainValue = js.Any.fromFunction1(getPlainValue), getType = js.Any.fromFunction1(getType))
    __obj.asInstanceOf[getPlainValueOptions]
  }
  @scala.inline
  implicit class getPlainValueOptionsOps[Self <: getPlainValueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPlainArray(value: StatefulArray => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlainArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPlainObject(value: typingsSlinky.dojo.dojox.mvc.StatefulModel => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlainObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPlainValue(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlainValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetType(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

