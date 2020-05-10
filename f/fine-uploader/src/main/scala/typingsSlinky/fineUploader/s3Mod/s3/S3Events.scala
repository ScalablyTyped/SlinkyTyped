package typingsSlinky.fineUploader.s3Mod.s3

import typingsSlinky.fineUploader.coreMod.CoreEvents
import typingsSlinky.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Events extends CoreEvents {
  /**
    * Called before a request is sent to S3 if the temporary credentials have expired.
    *
    * You must return a promise. If your attempt to refresh the temporary credentials is successful, you must fulfill the promise via the success method, passing the new credentials object.
    * Otherwise, call failure with a descriptive reason.
    */
  var onCredentialsExpired: js.UndefOr[OnCredentialsExpired] = js.native
}

object S3Events {
  @scala.inline
  def apply(): S3Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Events]
  }
  @scala.inline
  implicit class S3EventsOps[Self <: S3Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCredentialsExpired(value: () => PromiseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCredentialsExpired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCredentialsExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCredentialsExpired")(js.undefined)
        ret
    }
  }
  
}

