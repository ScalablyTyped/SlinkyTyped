package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about restriction policy changes to a feature.
  */
@js.native
trait SchemaRestrictionChange extends js.Object {
  /**
    * The feature which had a change in restriction policy.
    */
  var feature: js.UndefOr[String] = js.native
  /**
    * The restriction in place after the change.
    */
  var newRestriction: js.UndefOr[String] = js.native
}

object SchemaRestrictionChange {
  @scala.inline
  def apply(): SchemaRestrictionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictionChange]
  }
  @scala.inline
  implicit class SchemaRestrictionChangeOps[Self <: SchemaRestrictionChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(js.undefined)
        ret
    }
    @scala.inline
    def withNewRestriction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRestriction")(js.undefined)
        ret
    }
  }
  
}

