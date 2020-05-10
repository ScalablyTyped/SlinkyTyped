package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A storage location within Google cloud storage (GCS).
  */
@js.native
trait SchemaGoogleCloudStorage extends js.Object {
  /**
    * Required. The path to a directory in GCS that will eventually contain the
    * results for this test. The requesting user must have write access on the
    * bucket in the supplied path.
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudStorage {
  @scala.inline
  def apply(): SchemaGoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudStorage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudStorageOps[Self <: SchemaGoogleCloudStorage] (val x: Self) extends AnyVal {
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

