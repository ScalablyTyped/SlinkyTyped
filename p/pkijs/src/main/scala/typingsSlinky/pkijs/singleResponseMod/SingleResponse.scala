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
    def withCertID(value: typingsSlinky.pkijs.certIDMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSingleExtensions(value: js.Array[typingsSlinky.pkijs.extensionMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisUpdate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextUpdate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextUpdate")(js.undefined)
        ret
    }
  }
  
}

