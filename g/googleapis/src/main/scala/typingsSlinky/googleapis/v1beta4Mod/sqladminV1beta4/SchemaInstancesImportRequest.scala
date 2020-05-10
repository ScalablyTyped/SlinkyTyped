package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance import request.
  */
@js.native
trait SchemaInstancesImportRequest extends js.Object {
  /**
    * Contains details about the import operation.
    */
  var importContext: js.UndefOr[SchemaImportContext] = js.native
}

object SchemaInstancesImportRequest {
  @scala.inline
  def apply(): SchemaInstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesImportRequest]
  }
  @scala.inline
  implicit class SchemaInstancesImportRequestOps[Self <: SchemaInstancesImportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportContext(value: SchemaImportContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importContext")(js.undefined)
        ret
    }
  }
  
}

