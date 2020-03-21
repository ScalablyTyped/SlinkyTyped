package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawDataParams extends js.Object {
  var data: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
}

object RawDataParams {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer = null): RawDataParams = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDataParams]
  }
}

