package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCatalogImportStatusResponse extends js.Object {
  /**
    * The status of the specified catalog migration.
    */
  var ImportStatus: js.UndefOr[CatalogImportStatus] = js.native
}

object GetCatalogImportStatusResponse {
  @scala.inline
  def apply(): GetCatalogImportStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogImportStatusResponse]
  }
  @scala.inline
  implicit class GetCatalogImportStatusResponseOps[Self <: GetCatalogImportStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportStatus(value: CatalogImportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportStatus")(js.undefined)
        ret
    }
  }
  
}

