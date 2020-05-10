package typingsSlinky.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: Function = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): scala.Boolean = js.native
  /**
    * Determines whether an object exists in another object's prototype chain.
    * @param v Another object whose prototype chain is to be checked.
    */
  def isPrototypeOf(v: Object): scala.Boolean = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): scala.Boolean = js.native
}

object Object {
  @scala.inline
  def apply(
    constructor: Function,
    hasOwnProperty: PropertyKey => scala.Boolean,
    isPrototypeOf: Object => scala.Boolean,
    propertyIsEnumerable: PropertyKey => scala.Boolean
  ): Object = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isPrototypeOf = js.Any.fromFunction1(isPrototypeOf), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructor(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasOwnProperty(value: PropertyKey => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOwnProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPrototypeOf(value: Object => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrototypeOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPropertyIsEnumerable(value: PropertyKey => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

