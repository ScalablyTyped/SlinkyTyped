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
  def apply(): ClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientData]
  }
  @scala.inline
  implicit class ClientDataOps[Self <: ClientData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadStart")(js.undefined)
        ret
    }
  }
  
}

