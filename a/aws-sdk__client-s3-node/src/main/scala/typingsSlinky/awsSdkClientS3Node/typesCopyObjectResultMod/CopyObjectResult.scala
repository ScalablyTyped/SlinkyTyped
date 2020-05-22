package typingsSlinky.awsSdkClientS3Node.typesCopyObjectResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyObjectResult extends js.Object {
  /**
    * _ETag shape
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * _LastModified shape
    */
  var LastModified: js.UndefOr[js.Date | String | Double] = js.undefined
}

object CopyObjectResult {
  @scala.inline
  def apply(ETag: String = null, LastModified: js.Date | String | Double = null): CopyObjectResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectResult]
  }
}

