package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudStorage extends js.Object {
  /**
    * The path to a directory in GCS that will
    * eventually contain the results for this test.
    * The requesting user must have write access on the bucket in the supplied
    * path.
    * Required
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object GoogleCloudStorage {
  @scala.inline
  def apply(): GoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudStorage]
  }
  @scala.inline
  implicit class GoogleCloudStorageOps[Self <: GoogleCloudStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(js.undefined)
        ret
    }
  }
  
}

