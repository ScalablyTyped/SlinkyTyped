package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database flags for Cloud SQL instances.
  */
@js.native
trait SchemaDatabaseFlags extends js.Object {
  /**
    * The name of the flag. These flags are passed at instance startup, so
    * include both server options and system variables for MySQL. Flags should
    * be specified with underscores, not hyphens. For more information, see
    * Configuring Database Flags in the Cloud SQL documentation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the flag. Booleans should be set to on for true and off for
    * false. This field must be omitted if the flag doesn&#39;t take a value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaDatabaseFlags {
  @scala.inline
  def apply(): SchemaDatabaseFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseFlags]
  }
  @scala.inline
  implicit class SchemaDatabaseFlagsOps[Self <: SchemaDatabaseFlags] (val x: Self) extends AnyVal {
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

