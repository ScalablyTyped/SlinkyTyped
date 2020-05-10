package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.CheckConsistency
  */
@js.native
trait SchemaCheckConsistencyResponse extends js.Object {
  /**
    * True only if the token is consistent. A token is consistent if
    * replication has caught up with the restrictions specified in the request.
    */
  var consistent: js.UndefOr[Boolean] = js.native
}

object SchemaCheckConsistencyResponse {
  @scala.inline
  def apply(): SchemaCheckConsistencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckConsistencyResponse]
  }
  @scala.inline
  implicit class SchemaCheckConsistencyResponseOps[Self <: SchemaCheckConsistencyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistent")(js.undefined)
        ret
    }
  }
  
}

