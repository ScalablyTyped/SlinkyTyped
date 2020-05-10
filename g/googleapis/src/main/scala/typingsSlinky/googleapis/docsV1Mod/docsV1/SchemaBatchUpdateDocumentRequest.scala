package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BatchUpdateDocument.
  */
@js.native
trait SchemaBatchUpdateDocumentRequest extends js.Object {
  /**
    * A list of updates to apply to the document.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.native
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}

object SchemaBatchUpdateDocumentRequest {
  @scala.inline
  def apply(): SchemaBatchUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateDocumentRequest]
  }
  @scala.inline
  implicit class SchemaBatchUpdateDocumentRequestOps[Self <: SchemaBatchUpdateDocumentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequests(value: js.Array[SchemaRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteControl(value: SchemaWriteControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeControl")(js.undefined)
        ret
    }
  }
  
}

