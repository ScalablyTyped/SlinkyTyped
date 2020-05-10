package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about settings changes.
  */
@js.native
trait SchemaSettingsChange extends js.Object {
  /**
    * The set of changes made to restrictions.
    */
  var restrictionChanges: js.UndefOr[js.Array[SchemaRestrictionChange]] = js.native
}

object SchemaSettingsChange {
  @scala.inline
  def apply(): SchemaSettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettingsChange]
  }
  @scala.inline
  implicit class SchemaSettingsChangeOps[Self <: SchemaSettingsChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestrictionChanges(value: js.Array[SchemaRestrictionChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictionChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionChanges")(js.undefined)
        ret
    }
  }
  
}

