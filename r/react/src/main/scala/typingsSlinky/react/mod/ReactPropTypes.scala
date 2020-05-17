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

@js.native
trait ReactPropTypes extends js.Object {
  var any: typingsSlinky.propTypes.mod.Requireable[_] = js.native
  var array: typingsSlinky.propTypes.mod.Requireable[js.Array[_]] = js.native
  var arrayOf: FnCallType = js.native
  var bool: typingsSlinky.propTypes.mod.Requireable[Boolean] = js.native
  var element: typingsSlinky.propTypes.mod.Requireable[ReactElementLike] = js.native
  var exact: Fn3 = js.native
  var func: typingsSlinky.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var instanceOf: FnCall = js.native
  var node: typingsSlinky.propTypes.mod.Requireable[ReactNodeLike] = js.native
  var number: typingsSlinky.propTypes.mod.Requireable[Double] = js.native
  var `object`: typingsSlinky.propTypes.mod.Requireable[js.Object] = js.native
  var objectOf: Fn1 = js.native
  var oneOf: FnCallTypes = js.native
  var oneOfType: Fn0 = js.native
  var shape: Fn2 = js.native
  var string: typingsSlinky.propTypes.mod.Requireable[String] = js.native
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
    def withAny(value: typingsSlinky.propTypes.mod.Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArray(value: typingsSlinky.propTypes.mod.Requireable[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayOf(value: FnCallType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBool(value: typingsSlinky.propTypes.mod.Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: typingsSlinky.propTypes.mod.Requireable[ReactElementLike]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExact(value: Fn3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunc(value: typingsSlinky.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceOf(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: typingsSlinky.propTypes.mod.Requireable[ReactNodeLike]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: typingsSlinky.propTypes.mod.Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: typingsSlinky.propTypes.mod.Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectOf(value: Fn1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneOf(value: FnCallTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneOfType(value: Fn0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOfType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: Fn2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: typingsSlinky.propTypes.mod.Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

