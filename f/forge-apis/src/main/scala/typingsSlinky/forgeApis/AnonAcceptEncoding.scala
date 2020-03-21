package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptEncoding extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
  var ifModifiedSince: js.UndefOr[js.Date] = js.undefined
}

object AnonAcceptEncoding {
  @scala.inline
  def apply(acceptEncoding: String = null, ifModifiedSince: js.Date = null): AnonAcceptEncoding = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding.asInstanceOf[js.Any])
    if (ifModifiedSince != null) __obj.updateDynamic("ifModifiedSince")(ifModifiedSince.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptEncoding]
  }
}

