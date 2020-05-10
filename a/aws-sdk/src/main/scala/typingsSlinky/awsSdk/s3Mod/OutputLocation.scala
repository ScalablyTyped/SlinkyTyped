package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLocation extends js.Object {
  /**
    * Describes an S3 location that will receive the results of the restore request.
    */
  var S3: js.UndefOr[S3Location] = js.native
}

object OutputLocation {
  @scala.inline
  def apply(): OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocation]
  }
  @scala.inline
  implicit class OutputLocationOps[Self <: OutputLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3")(js.undefined)
        ret
    }
  }
  
}

