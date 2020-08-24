package typingsSlinky.pkijs.singleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleResponse extends js.Object {
  var certID: typingsSlinky.pkijs.certIDMod.default = js.native
  var certStatus: js.Any = js.native
  var nextUpdate: js.UndefOr[js.Date] = js.native
  var singleExtensions: js.Array[typingsSlinky.pkijs.extensionMod.default] = js.native
  var thisUpdate: js.Date = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object SingleResponse {
  @scala.inline
  def apply(
    certID: typingsSlinky.pkijs.certIDMod.default,
    certStatus: js.Any,
    fromSchema: js.Any => Unit,
    singleExtensions: js.Array[typingsSlinky.pkijs.extensionMod.default],
    thisUpdate: js.Date,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): SingleResponse = {
    val __obj = js.Dynamic.literal(certID = certID.asInstanceOf[js.Any], certStatus = certStatus.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), singleExtensions = singleExtensions.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[SingleResponse]
  }
  @scala.inline
  implicit class SingleResponseOps[Self <: SingleResponse] (val x: Self) extends AnyVal {
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
    def setCertID(value: typingsSlinky.pkijs.certIDMod.default): Self = this.set("certID", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertStatus(value: js.Any): Self = this.set("certStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setSingleExtensionsVarargs(value: typingsSlinky.pkijs.extensionMod.default*): Self = this.set("singleExtensions", js.Array(value :_*))
    @scala.inline
    def setSingleExtensions(value: js.Array[typingsSlinky.pkijs.extensionMod.default]): Self = this.set("singleExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setThisUpdate(value: js.Date): Self = this.set("thisUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setNextUpdate(value: js.Date): Self = this.set("nextUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextUpdate: Self = this.set("nextUpdate", js.undefined)
  }
  
}

