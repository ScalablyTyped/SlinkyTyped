package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientData extends js.Object {
  /**
    * A user-defined comment about the disk upload.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * The time that the disk upload ends.
    */
  var UploadEnd: js.UndefOr[js.Date] = js.native
  /**
    * The size of the uploaded disk image, in GiB.
    */
  var UploadSize: js.UndefOr[Double] = js.native
  /**
    * The time that the disk upload starts.
    */
  var UploadStart: js.UndefOr[js.Date] = js.native
}

object ClientData {
  @scala.inline
  def apply(
    Comment: String = null,
    UploadEnd: js.Date = null,
    UploadSize: Int | scala.Double = null,
    UploadStart: js.Date = null
  ): ClientData = {
    val __obj = js.Dynamic.literal()
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (UploadEnd != null) __obj.updateDynamic("UploadEnd")(UploadEnd.asInstanceOf[js.Any])
    if (UploadSize != null) __obj.updateDynamic("UploadSize")(UploadSize.asInstanceOf[js.Any])
    if (UploadStart != null) __obj.updateDynamic("UploadStart")(UploadStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientData]
  }
}

