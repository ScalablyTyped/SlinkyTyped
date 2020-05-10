package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Additional information returned to client, such as debugging
  * information.
  */
@js.native
trait SchemaResponseMetadata extends js.Object {
  /**
    * Identifiers for the versions of the search algorithm used during this API
    * invocation if multiple algorithms are used. The default value is empty.
    * For search response only.
    */
  var experimentIdList: js.UndefOr[js.Array[Double]] = js.native
  /**
    * For search response only. Indicates the mode of a performed search.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * A unique id associated with this call. This id is logged for tracking
    * purposes.
    */
  var requestId: js.UndefOr[String] = js.native
}

object SchemaResponseMetadata {
  @scala.inline
  def apply(): SchemaResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseMetadata]
  }
  @scala.inline
  implicit class SchemaResponseMetadataOps[Self <: SchemaResponseMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentIdList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentIdList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentIdList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentIdList")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
  }
  
}

