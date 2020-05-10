package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance export request.
  */
@js.native
trait SchemaInstancesExportRequest extends js.Object {
  /**
    * Contains details about the export operation.
    */
  var exportContext: js.UndefOr[SchemaExportContext] = js.native
}

object SchemaInstancesExportRequest {
  @scala.inline
  def apply(): SchemaInstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesExportRequest]
  }
  @scala.inline
  implicit class SchemaInstancesExportRequestOps[Self <: SchemaInstancesExportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportContext(value: SchemaExportContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportContext")(js.undefined)
        ret
    }
  }
  
}

