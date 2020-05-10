package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Summary extends js.Object {
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.S3Object] = js.native
}

object Summary {
  @scala.inline
  def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  @scala.inline
  implicit class SummaryOps[Self <: Summary] (val x: Self) extends AnyVal {
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

