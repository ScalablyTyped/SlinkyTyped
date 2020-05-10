package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a dynamic targeting key. Dynamic targeting keys are
  * unique, user-friendly labels, created at the advertiser level in DCM, that
  * can be assigned to ads, creatives, and placements and used for targeting
  * with Studio dynamic creatives. Use these labels instead of numeric Campaign
  * Manager IDs (such as placement IDs) to save time and avoid errors in your
  * dynamic feeds.
  */
@js.native
trait SchemaDynamicTargetingKey extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this dynamic targeting key. This is a required field. Must be
    * less than 256 characters long and cannot contain commas. All characters
    * are converted to lowercase.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the object of this dynamic targeting key. This is a required field.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * Type of the object of this dynamic targeting key. This is a required
    * field.
    */
  var objectType: js.UndefOr[String] = js.native
}

object SchemaDynamicTargetingKey {
  @scala.inline
  def apply(): SchemaDynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKey]
  }
  @scala.inline
  implicit class SchemaDynamicTargetingKeyOps[Self <: SchemaDynamicTargetingKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
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
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
  }
  
}

