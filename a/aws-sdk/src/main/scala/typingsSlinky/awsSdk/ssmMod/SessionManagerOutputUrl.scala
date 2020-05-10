package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionManagerOutputUrl extends js.Object {
  /**
    * Reserved for future use.
    */
  var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.native
  /**
    * Reserved for future use.
    */
  var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.native
}

object SessionManagerOutputUrl {
  @scala.inline
  def apply(): SessionManagerOutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionManagerOutputUrl]
  }
  @scala.inline
  implicit class SessionManagerOutputUrlOps[Self <: SessionManagerOutputUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchOutputUrl(value: SessionManagerCloudWatchOutputUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchOutputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchOutputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchOutputUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withS3OutputUrl(value: SessionManagerS3OutputUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3OutputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputUrl")(js.undefined)
        ret
    }
  }
  
}

