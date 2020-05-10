package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogImportStatus extends js.Object {
  /**
    *  True if the migration has completed, or False otherwise.
    */
  var ImportCompleted: js.UndefOr[Boolean] = js.native
  /**
    * The time that the migration was started.
    */
  var ImportTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the person who initiated the migration.
    */
  var ImportedBy: js.UndefOr[NameString] = js.native
}

object CatalogImportStatus {
  @scala.inline
  def apply(): CatalogImportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogImportStatus]
  }
  @scala.inline
  implicit class CatalogImportStatusOps[Self <: CatalogImportStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTime")(js.undefined)
        ret
    }
    @scala.inline
    def withImportedBy(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedBy")(js.undefined)
        ret
    }
  }
  
}

