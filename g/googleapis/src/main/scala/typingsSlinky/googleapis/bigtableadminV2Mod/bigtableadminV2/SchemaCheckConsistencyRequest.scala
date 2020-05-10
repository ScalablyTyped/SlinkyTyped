package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.CheckConsistency
  */
@js.native
trait SchemaCheckConsistencyRequest extends js.Object {
  /**
    * The token created using GenerateConsistencyToken for the Table.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}

object SchemaCheckConsistencyRequest {
  @scala.inline
  def apply(): SchemaCheckConsistencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckConsistencyRequest]
  }
  @scala.inline
  implicit class SchemaCheckConsistencyRequestOps[Self <: SchemaCheckConsistencyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsistencyToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyToken")(js.undefined)
        ret
    }
  }
  
}

