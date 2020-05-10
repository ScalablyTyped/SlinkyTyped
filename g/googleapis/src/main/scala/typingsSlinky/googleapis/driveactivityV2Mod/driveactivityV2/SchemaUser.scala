package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an end user.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A user whose account has since been deleted.
    */
  var deletedUser: js.UndefOr[SchemaDeletedUser] = js.native
  /**
    * A known user.
    */
  var knownUser: js.UndefOr[SchemaKnownUser] = js.native
  /**
    * A user about whom nothing is currently known.
    */
  var unknownUser: js.UndefOr[SchemaUnknownUser] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedUser(value: SchemaDeletedUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedUser")(js.undefined)
        ret
    }
    @scala.inline
    def withKnownUser(value: SchemaKnownUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnownUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownUser")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownUser(value: SchemaUnknownUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownUser")(js.undefined)
        ret
    }
  }
  
}

