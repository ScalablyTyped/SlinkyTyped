package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query options for hangouts chat holds.
  */
@js.native
trait SchemaHeldHangoutsChatQuery extends js.Object {
  /**
    * If true, include rooms the user has participated in.
    */
  var includeRooms: js.UndefOr[Boolean] = js.native
}

object SchemaHeldHangoutsChatQuery {
  @scala.inline
  def apply(): SchemaHeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldHangoutsChatQuery]
  }
  @scala.inline
  implicit class SchemaHeldHangoutsChatQueryOps[Self <: SchemaHeldHangoutsChatQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeRooms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRooms")(js.undefined)
        ret
    }
  }
  
}

