package typingsSlinky.react.reactMod

import typingsSlinky.propDashTypes.propDashTypesMod.ReactElementLike
import typingsSlinky.propDashTypes.propDashTypesMod.ReactNodeLike
import typingsSlinky.react.Fn_Args
import typingsSlinky.react.Fn_Type
import typingsSlinky.react.Fn_TypeAny
import typingsSlinky.react.Fn_TypeAnyInferProps
import typingsSlinky.react.Fn_TypeAnyInferPropsP
import typingsSlinky.react.Fn_Types
import typingsSlinky.react.Fn_TypesAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[_]
  var array: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[js.Array[_]]
  var arrayOf: Fn_Type
  var bool: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[Boolean]
  var element: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[ReactElementLike]
  var exact: Fn_TypeAnyInferPropsP
  var func: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: Fn_Args
  var node: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[ReactNodeLike]
  var number: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[Double]
  var `object`: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[js.Object]
  var objectOf: Fn_TypeAny
  var oneOf: Fn_Types
  var oneOfType: Fn_TypesAny
  var shape: Fn_TypeAnyInferProps
  var string: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[_],
    array: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[js.Array[_]],
    arrayOf: Fn_Type,
    bool: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[Boolean],
    element: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[ReactElementLike],
    exact: Fn_TypeAnyInferPropsP,
    func: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: Fn_Args,
    node: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[ReactNodeLike],
    number: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[Double],
    `object`: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[js.Object],
    objectOf: Fn_TypeAny,
    oneOf: Fn_Types,
    oneOfType: Fn_TypesAny,
    shape: Fn_TypeAnyInferProps,
    string: typingsSlinky.propDashTypes.propDashTypesMod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
}

