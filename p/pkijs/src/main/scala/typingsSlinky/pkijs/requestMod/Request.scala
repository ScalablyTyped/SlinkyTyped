package typingsSlinky.pkijs.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var reqCert: typingsSlinky.pkijs.certIDMod.default = js.native
  var singleRequestExtensions: js.UndefOr[js.Array[typingsSlinky.pkijs.extensionMod.default]] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object Request {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    reqCert: typingsSlinky.pkijs.certIDMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): Request = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), reqCert = reqCert.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setReqCert(value: typingsSlinky.pkijs.certIDMod.default): Self = this.set("reqCert", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setSingleRequestExtensionsVarargs(value: typingsSlinky.pkijs.extensionMod.default*): Self = this.set("singleRequestExtensions", js.Array(value :_*))
    @scala.inline
    def setSingleRequestExtensions(value: js.Array[typingsSlinky.pkijs.extensionMod.default]): Self = this.set("singleRequestExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleRequestExtensions: Self = this.set("singleRequestExtensions", js.undefined)
  }
  
}

