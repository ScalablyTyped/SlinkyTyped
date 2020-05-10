package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatabaseResponse extends js.Object {
  /**
    * The definition of the specified database in the Data Catalog.
    */
  var Database: js.UndefOr[typingsSlinky.awsSdk.glueMod.Database] = js.native
}

object GetDatabaseResponse {
  @scala.inline
  def apply(): GetDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseResponse]
  }
  @scala.inline
  implicit class GetDatabaseResponseOps[Self <: GetDatabaseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: Database): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(js.undefined)
        ret
    }
  }
  
}

