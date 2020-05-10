package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hangouts chat search advanced options
  */
@js.native
trait SchemaHangoutsChatOptions extends js.Object {
  /**
    * Set to true to include rooms.
    */
  var includeRooms: js.UndefOr[Boolean] = js.native
}

object SchemaHangoutsChatOptions {
  @scala.inline
  def apply(): SchemaHangoutsChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatOptions]
  }
  @scala.inline
  implicit class SchemaHangoutsChatOptionsOps[Self <: SchemaHangoutsChatOptions] (val x: Self) extends AnyVal {
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

