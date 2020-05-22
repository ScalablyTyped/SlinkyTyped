package typingsSlinky.pkijs.singleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResponse extends js.Object {
  var certID: typingsSlinky.pkijs.certIDMod.default
  var certStatus: js.Any
  var nextUpdate: js.UndefOr[js.Date] = js.undefined
  var singleExtensions: js.Array[typingsSlinky.pkijs.extensionMod.default]
  var thisUpdate: js.Date
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
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
    toSchema: () => js.Any,
    nextUpdate: js.Date = null
  ): SingleResponse = {
    val __obj = js.Dynamic.literal(certID = certID.asInstanceOf[js.Any], certStatus = certStatus.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), singleExtensions = singleExtensions.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (nextUpdate != null) __obj.updateDynamic("nextUpdate")(nextUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResponse]
  }
}

