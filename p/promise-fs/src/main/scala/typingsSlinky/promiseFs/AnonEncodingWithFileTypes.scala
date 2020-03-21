package typingsSlinky.promiseFs

import typingsSlinky.promiseFs.promiseFsBooleans.`false`
import typingsSlinky.promiseFs.promiseFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingWithFileTypes extends js.Object {
  var encoding: buffer
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object AnonEncodingWithFileTypes {
  @scala.inline
  def apply(encoding: buffer, withFileTypes: `false` = null): AnonEncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingWithFileTypes]
  }
}

