package typingsSlinky.awsSdkTypes.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataBearer extends js.Object {
  /**
    * Metadata pertaining to this request.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
}

object MetadataBearer {
  @scala.inline
  def apply($metadata: ResponseMetadata): MetadataBearer = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataBearer]
  }
  @scala.inline
  implicit class MetadataBearerOps[Self <: MetadataBearer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

