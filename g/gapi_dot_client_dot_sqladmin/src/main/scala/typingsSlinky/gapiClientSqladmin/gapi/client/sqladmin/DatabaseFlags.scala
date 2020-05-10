package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseFlags extends js.Object {
  /**
    * The name of the flag. These flags are passed at instance startup, so include both MySQL server options and MySQL system variables. Flags should be
    * specified with underscores, not hyphens. For more information, see Configuring MySQL Flags in the Google Cloud SQL documentation, as well as the
    * official MySQL documentation for server options and system variables.
    */
  var name: js.UndefOr[String] = js.native
  /** The value of the flag. Booleans should be set to on for true and off for false. This field must be omitted if the flag doesn't take a value. */
  var value: js.UndefOr[String] = js.native
}

object DatabaseFlags {
  @scala.inline
  def apply(): DatabaseFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseFlags]
  }
  @scala.inline
  implicit class DatabaseFlagsOps[Self <: DatabaseFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

