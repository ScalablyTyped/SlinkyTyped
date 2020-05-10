package typingsSlinky.donna.mod.DonnaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  var bindingType: String = js.native
  var classProperties: js.UndefOr[js.Array[_]] = js.native
  var doc: js.UndefOr[String] = js.native
  var name: String = js.native
  var paramNames: js.UndefOr[js.Array[String]] = js.native
  var prototypeProperties: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var range: js.Array[js.Array[Double]] = js.native
  var `type`: String = js.native
}

object Object {
  @scala.inline
  def apply(bindingType: String, name: String, range: js.Array[js.Array[Double]], `type`: String): Object = {
    val __obj = js.Dynamic.literal(bindingType = bindingType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassProperties(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
    @scala.inline
    def withParamNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPrototypeProperties(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prototypeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrototypeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prototypeProperties")(js.undefined)
        ret
    }
  }
  
}

