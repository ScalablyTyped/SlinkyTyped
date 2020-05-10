package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event tag override information.
  */
@js.native
trait SchemaEventTagOverride extends js.Object {
  /**
    * Whether this override is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID of this event tag override. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaEventTagOverride {
  @scala.inline
  def apply(): SchemaEventTagOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagOverride]
  }
  @scala.inline
  implicit class SchemaEventTagOverrideOps[Self <: SchemaEventTagOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

