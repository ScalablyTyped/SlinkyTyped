package typingsSlinky.lambdaPhi.pathModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathModel extends js.Object {
  var _httpMethods: js.Any = js.native
  var _methodName: js.Any = js.native
  var _pattern: js.Any = js.native
  var httpMethods: js.Array[String] = js.native
  var methodName: String = js.native
  var pattern: String = js.native
}

object PathModel {
  @scala.inline
  def apply(
    _httpMethods: js.Any,
    _methodName: js.Any,
    _pattern: js.Any,
    httpMethods: js.Array[String],
    methodName: String,
    pattern: String
  ): PathModel = {
    val __obj = js.Dynamic.literal(_httpMethods = _httpMethods.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _pattern = _pattern.asInstanceOf[js.Any], httpMethods = httpMethods.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathModel]
  }
  @scala.inline
  implicit class PathModelOps[Self <: PathModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_httpMethods(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_httpMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_methodName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

