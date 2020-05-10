package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3OutputUrl extends js.Object {
  /**
    * A URL for an Amazon S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[Url] = js.native
}

object S3OutputUrl {
  @scala.inline
  def apply(): S3OutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputUrl]
  }
  @scala.inline
  implicit class S3OutputUrlOps[Self <: S3OutputUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUrl")(js.undefined)
        ret
    }
  }
  
}

