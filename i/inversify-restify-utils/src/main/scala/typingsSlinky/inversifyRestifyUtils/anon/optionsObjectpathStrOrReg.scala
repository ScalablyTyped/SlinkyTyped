package typingsSlinky.inversifyRestifyUtils.anon

import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.RouteOptions
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  options  :std.Object,   path  :inversify-restify-utils.inversify-restify-utils/dts/interfaces.interfaces.StrOrRegex} & std.Object */
@js.native
trait optionsObjectpathStrOrReg extends RouteOptions {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: js.Function = js.native
  var options: js.Object = js.native
  var path: StrOrRegex = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): Boolean = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
}

object optionsObjectpathStrOrReg {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    options: js.Object,
    path: StrOrRegex,
    propertyIsEnumerable: PropertyKey => Boolean
  ): optionsObjectpathStrOrReg = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[optionsObjectpathStrOrReg]
  }
  @scala.inline
  implicit class optionsObjectpathStrOrRegOps[Self <: optionsObjectpathStrOrReg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructor(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasOwnProperty(value: PropertyKey => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOwnProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: StrOrRegex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyIsEnumerable(value: PropertyKey => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

