package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to lease WorkItems.
  */
@js.native
trait SchemaLeaseWorkItemResponse extends js.Object {
  /**
    * Untranslated bag-of-bytes WorkResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * A list of the leased WorkItems.
    */
  var workItems: js.UndefOr[js.Array[SchemaWorkItem]] = js.native
}

object SchemaLeaseWorkItemResponse {
  @scala.inline
  def apply(): SchemaLeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseWorkItemResponse]
  }
  @scala.inline
  implicit class SchemaLeaseWorkItemResponseOps[Self <: SchemaLeaseWorkItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnifiedWorkerResponse(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unifiedWorkerResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnifiedWorkerResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unifiedWorkerResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkItems(value: js.Array[SchemaWorkItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(js.undefined)
        ret
    }
  }
  
}

