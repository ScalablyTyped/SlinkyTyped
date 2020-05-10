package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTarget extends js.Object {
  /**
    * The name of the database to be synchronized.
    */
  var DatabaseName: NameString = js.native
  /**
    * A list of the tables to be synchronized.
    */
  var Tables: CatalogTablesList = js.native
}

object CatalogTarget {
  @scala.inline
  def apply(DatabaseName: NameString, Tables: CatalogTablesList): CatalogTarget = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTarget]
  }
  @scala.inline
  implicit class CatalogTargetOps[Self <: CatalogTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTables(value: CatalogTablesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

