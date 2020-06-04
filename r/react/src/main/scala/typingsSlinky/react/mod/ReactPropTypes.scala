package typingsSlinky.react.mod

import typingsSlinky.propTypes.mod.ReactElementLike
import typingsSlinky.propTypes.mod.ReactNodeLike
import typingsSlinky.react.anon.Fn0
import typingsSlinky.react.anon.Fn1
import typingsSlinky.react.anon.Fn2
import typingsSlinky.react.anon.Fn3
import typingsSlinky.react.anon.FnCall
import typingsSlinky.react.anon.FnCallType
import typingsSlinky.react.anon.FnCallTypes
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
  @scala.inline
  implicit class ReactPropTypesOps[Self <: ReactPropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAny(value: typingsSlinky.propTypes.mod.Requireable[_]): Self = this.set("any", value.asInstanceOf[js.Any])
    @scala.inline
    def setArray(value: typingsSlinky.propTypes.mod.Requireable[js.Array[_]]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrayOf(value: FnCallType): Self = this.set("arrayOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setBool(value: typingsSlinky.propTypes.mod.Requireable[Boolean]): Self = this.set("bool", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: typingsSlinky.propTypes.mod.Requireable[ReactElementLike]): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setExact(value: Fn3): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunc(value: typingsSlinky.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("func", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceOf(value: FnCall): Self = this.set("instanceOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: typingsSlinky.propTypes.mod.Requireable[ReactNodeLike]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: typingsSlinky.propTypes.mod.Requireable[Double]): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: typingsSlinky.propTypes.mod.Requireable[js.Object]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectOf(value: Fn1): Self = this.set("objectOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneOf(value: FnCallTypes): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneOfType(value: Fn0): Self = this.set("oneOfType", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Fn2): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: typingsSlinky.propTypes.mod.Requireable[String]): Self = this.set("string", value.asInstanceOf[js.Any])
  }
  
}

