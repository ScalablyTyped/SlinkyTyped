package typingsSlinky.lambdaPhi.httpVerbModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpVerbModel extends js.Object {
  var _methodName: js.Any = js.native
  var _name: js.Any = js.native
  var methodName: String = js.native
  var name: String = js.native
}

object HttpVerbModel {
  @scala.inline
  def apply(_methodName: js.Any, _name: js.Any, methodName: String, name: String): HttpVerbModel = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpVerbModel]
  }
  @scala.inline
  implicit class HttpVerbModelOps[Self <: HttpVerbModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

