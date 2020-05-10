package typingsSlinky.lambdaPhi.pathParamModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathParamModel extends js.Object {
  var _defaultValue: js.Any = js.native
  var _index: js.Any = js.native
  var _methodName: js.Any = js.native
  var _name: js.Any = js.native
  var defaultValue: js.Any = js.native
  var index: Double = js.native
  var methodName: String = js.native
  var name: String = js.native
}

object PathParamModel {
  @scala.inline
  def apply(
    _defaultValue: js.Any,
    _index: js.Any,
    _methodName: js.Any,
    _name: js.Any,
    defaultValue: js.Any,
    index: Double,
    methodName: String,
    name: String
  ): PathParamModel = {
    val __obj = js.Dynamic.literal(_defaultValue = _defaultValue.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathParamModel]
  }
  @scala.inline
  implicit class PathParamModelOps[Self <: PathParamModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_defaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_index(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_methodName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_name(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

