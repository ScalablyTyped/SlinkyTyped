package typingsSlinky.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyObjectResult extends js.Object {
  /**
    * Returns the ETag of the new object. The ETag reflects only changes to the contents of an object, not its metadata. The source and destination ETag is identical for a successfully copied object.
    */
  var ETag: js.UndefOr[typingsSlinky.awsDashSdk.clientsS3Mod.ETag] = js.native
  /**
    * Returns the date that the object was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
}

object CopyObjectResult {
  @scala.inline
  def apply(ETag: ETag = null, LastModified: js.Date = null): CopyObjectResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectResult]
  }
}

