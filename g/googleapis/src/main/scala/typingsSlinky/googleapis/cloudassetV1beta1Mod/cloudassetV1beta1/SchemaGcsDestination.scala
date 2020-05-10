package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Storage location.
  */
@js.native
trait SchemaGcsDestination extends js.Object {
  /**
    * The uri of the Cloud Storage object. It&#39;s the same uri that is used
    * by gsutil. For example: &quot;gs://bucket_name/object_name&quot;. See
    * [Viewing and Editing Object
    * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
    * for more information.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGcsDestination {
  @scala.inline
  def apply(): SchemaGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsDestination]
  }
  @scala.inline
  implicit class SchemaGcsDestinationOps[Self <: SchemaGcsDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

