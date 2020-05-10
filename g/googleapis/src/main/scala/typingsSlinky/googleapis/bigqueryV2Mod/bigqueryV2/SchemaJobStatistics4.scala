package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobStatistics4 extends js.Object {
  /**
    * [Output-only] Number of files per destination URI or URI pattern
    * specified in the extract configuration. These values will be in the same
    * order as the URIs specified in the &#39;destinationUris&#39; field.
    */
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output-only] Number of user bytes extracted into the result. This is the
    * byte count as computed by BigQuery for billing purposes.
    */
  var inputBytes: js.UndefOr[String] = js.native
}

object SchemaJobStatistics4 {
  @scala.inline
  def apply(): SchemaJobStatistics4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics4]
  }
  @scala.inline
  implicit class SchemaJobStatistics4Ops[Self <: SchemaJobStatistics4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationUriFileCounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUriFileCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationUriFileCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUriFileCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBytes")(js.undefined)
        ret
    }
  }
  
}

