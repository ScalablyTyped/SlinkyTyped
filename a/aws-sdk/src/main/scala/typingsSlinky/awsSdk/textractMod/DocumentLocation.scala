package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentLocation extends js.Object {
  /**
    * The Amazon S3 bucket that contains the input document.
    */
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.textractMod.S3Object] = js.native
}

object DocumentLocation {
  @scala.inline
  def apply(): DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLocation]
  }
  @scala.inline
  implicit class DocumentLocationOps[Self <: DocumentLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Object(value: S3Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Object: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Object")(js.undefined)
        ret
    }
  }
  
}

