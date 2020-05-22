package typingsSlinky.babelPluginReactHtmlAttrs.mod

import typingsSlinky.babelPluginReactHtmlAttrs.anon.Fn0
import typingsSlinky.babelPluginReactHtmlAttrs.anon.Fn1
import typingsSlinky.babelPluginReactHtmlAttrs.anon.Fn2
import typingsSlinky.babelPluginReactHtmlAttrs.anon.Fn3
import typingsSlinky.babelPluginReactHtmlAttrs.anon.FnCall
import typingsSlinky.babelPluginReactHtmlAttrs.anon.FnCallType
import typingsSlinky.babelPluginReactHtmlAttrs.anon.FnCallTypes
import typingsSlinky.propTypes.mod.ReactElementLike
import typingsSlinky.propTypes.mod.ReactNodeLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPropTypes extends js.Object {
  var any: typingsSlinky.propTypes.mod.Requireable[_]
  var array: typingsSlinky.propTypes.mod.Requireable[js.Array[_]]
  var arrayOf: FnCallType
  var bool: typingsSlinky.propTypes.mod.Requireable[Boolean]
  var element: typingsSlinky.propTypes.mod.Requireable[ReactElementLike]
  var exact: Fn3
  var func: typingsSlinky.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]]
  var instanceOf: FnCall
  var node: typingsSlinky.propTypes.mod.Requireable[ReactNodeLike]
  var number: typingsSlinky.propTypes.mod.Requireable[Double]
  var `object`: typingsSlinky.propTypes.mod.Requireable[js.Object]
  var objectOf: Fn1
  var oneOf: FnCallTypes
  var oneOfType: Fn0
  var shape: Fn2
  var string: typingsSlinky.propTypes.mod.Requireable[String]
}

object ReactPropTypes {
  @scala.inline
  def apply(
    any: typingsSlinky.propTypes.mod.Requireable[_],
    array: typingsSlinky.propTypes.mod.Requireable[js.Array[_]],
    arrayOf: FnCallType,
    bool: typingsSlinky.propTypes.mod.Requireable[Boolean],
    element: typingsSlinky.propTypes.mod.Requireable[ReactElementLike],
    exact: Fn3,
    func: typingsSlinky.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: FnCall,
    node: typingsSlinky.propTypes.mod.Requireable[ReactNodeLike],
    number: typingsSlinky.propTypes.mod.Requireable[Double],
    `object`: typingsSlinky.propTypes.mod.Requireable[js.Object],
    objectOf: Fn1,
    oneOf: FnCallTypes,
    oneOfType: Fn0,
    shape: Fn2,
    string: typingsSlinky.propTypes.mod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
}

