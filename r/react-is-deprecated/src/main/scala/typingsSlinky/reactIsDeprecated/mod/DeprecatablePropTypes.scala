package typingsSlinky.reactIsDeprecated.mod

import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately this copy-paste must happen -- I can't just take PropTypes and programmatically
// define a version that intersects in the Deprecatable interface into the keys.
@js.native
trait DeprecatablePropTypes extends js.Object {
  var any: Requireable[_] with Deprecatable[_] = js.native
  var array: Requireable[_] with Deprecatable[_] = js.native
  var bool: Requireable[_] with Deprecatable[_] = js.native
  var element: Requireable[_] with Deprecatable[_] = js.native
  var func: Requireable[_] with Deprecatable[_] = js.native
  var node: Requireable[_] with Deprecatable[_] = js.native
  var number: Requireable[_] with Deprecatable[_] = js.native
  var `object`: Requireable[_] with Deprecatable[_] = js.native
  var string: Requireable[_] with Deprecatable[_] = js.native
  def arrayOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_] = js.native
  def instanceOf(expectedClass: js.Object): Requireable[_] with Deprecatable[_] = js.native
  def objectOf(`type`: Validator[_]): Requireable[_] with Deprecatable[_] = js.native
  def oneOf(types: js.Array[_]): Requireable[_] with Deprecatable[_] = js.native
  def oneOfType(types: js.Array[Validator[_]]): Requireable[_] with Deprecatable[_] = js.native
  def shape(`type`: ValidationMap[_]): Requireable[_] with Deprecatable[_] = js.native
}

object DeprecatablePropTypes {
  @scala.inline
  def apply(
    any: Requireable[_] with Deprecatable[_],
    array: Requireable[_] with Deprecatable[_],
    arrayOf: Validator[_] => Requireable[_] with Deprecatable[_],
    bool: Requireable[_] with Deprecatable[_],
    element: Requireable[_] with Deprecatable[_],
    func: Requireable[_] with Deprecatable[_],
    instanceOf: js.Object => Requireable[_] with Deprecatable[_],
    node: Requireable[_] with Deprecatable[_],
    number: Requireable[_] with Deprecatable[_],
    `object`: Requireable[_] with Deprecatable[_],
    objectOf: Validator[_] => Requireable[_] with Deprecatable[_],
    oneOf: js.Array[_] => Requireable[_] with Deprecatable[_],
    oneOfType: js.Array[Validator[_]] => Requireable[_] with Deprecatable[_],
    shape: ValidationMap[_] => Requireable[_] with Deprecatable[_],
    string: Requireable[_] with Deprecatable[_]
  ): DeprecatablePropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = js.Any.fromFunction1(arrayOf), bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = js.Any.fromFunction1(instanceOf), node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = js.Any.fromFunction1(objectOf), oneOf = js.Any.fromFunction1(oneOf), oneOfType = js.Any.fromFunction1(oneOfType), shape = js.Any.fromFunction1(shape), string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatablePropTypes]
  }
  @scala.inline
  implicit class DeprecatablePropTypesOps[Self <: DeprecatablePropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAny(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArray(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayOf(value: Validator[_] => Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBool(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunc(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceOf(value: js.Object => Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNode(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectOf(value: Validator[_] => Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOneOf(value: js.Array[_] => Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOneOfType(value: js.Array[Validator[_]] => Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOfType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShape(value: ValidationMap[_] => Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withString(value: Requireable[_] with Deprecatable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

