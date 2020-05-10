package typingsSlinky.dojo.dojox.mvc.StatefulModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulModel.getStatefulOptions.html
  *
  * An object that defines how model object should be created from plain object hierarchy.
  *
  */
@js.native
trait getStatefulOptions extends js.Object {
  /**
    * Create a stateful array from a plain array.
    *
    * @param a The plain array.
    */
  def getStatefulArray(a: js.Array[_]): js.Any = js.native
  /**
    * Create a stateful object from a plain object.
    *
    * @param o The plain object.
    */
  def getStatefulObject(o: js.Object): js.Any = js.native
  /**
    * Create a stateful value from a plain value.
    *
    * @param v The plain value.
    */
  def getStatefulValue(v: js.Any): js.Any = js.native
  /**
    * Returns the type of the given value.
    *
    * @param v The value.
    */
  def getType(v: js.Any): String = js.native
}

object getStatefulOptions {
  @scala.inline
  def apply(
    getStatefulArray: js.Array[_] => js.Any,
    getStatefulObject: js.Object => js.Any,
    getStatefulValue: js.Any => js.Any,
    getType: js.Any => String
  ): getStatefulOptions = {
    val __obj = js.Dynamic.literal(getStatefulArray = js.Any.fromFunction1(getStatefulArray), getStatefulObject = js.Any.fromFunction1(getStatefulObject), getStatefulValue = js.Any.fromFunction1(getStatefulValue), getType = js.Any.fromFunction1(getType))
    __obj.asInstanceOf[getStatefulOptions]
  }
  @scala.inline
  implicit class getStatefulOptionsOps[Self <: getStatefulOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStatefulArray(value: js.Array[_] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatefulArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStatefulObject(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatefulObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStatefulValue(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatefulValue")(js.Any.fromFunction1(value))
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

