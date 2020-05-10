package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMetadata extends js.Object {
  /**
    * An estimate of the total size (in bytes) of the data that would be
    * read from this source.  This estimate is in terms of external storage
    * size, before any decompression or other processing done by the reader.
    */
  var estimatedSizeBytes: js.UndefOr[String] = js.native
  /**
    * Specifies that the size of this source is known to be infinite
    * (this is a streaming source).
    */
  var infinite: js.UndefOr[Boolean] = js.native
  /**
    * Whether this source is known to produce key/value pairs with
    * the (encoded) keys in lexicographically sorted order.
    */
  var producesSortedKeys: js.UndefOr[Boolean] = js.native
}

object SourceMetadata {
  @scala.inline
  def apply(): SourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMetadata]
  }
  @scala.inline
  implicit class SourceMetadataOps[Self <: SourceMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(js.undefined)
        ret
    }
    @scala.inline
    def withProducesSortedKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producesSortedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducesSortedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producesSortedKeys")(js.undefined)
        ret
    }
  }
  
}

