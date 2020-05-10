package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of targeted and excluded mobile application IDs that
  * publishers own. Mobile application IDs are from App Store and Google Play
  * Store. Android App ID, for example, com.google.android.apps.maps, can be
  * found in Google Play Store URL. iOS App ID (which is a number) can be found
  * at the end of iTunes store URL. First party mobile applications is either
  * included or excluded.
  */
@js.native
trait SchemaFirstPartyMobileApplicationTargeting extends js.Object {
  /**
    * A list of application IDs to be excluded.
    */
  var excludedAppIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of application IDs to be included.
    */
  var targetedAppIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFirstPartyMobileApplicationTargeting {
  @scala.inline
  def apply(): SchemaFirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstPartyMobileApplicationTargeting]
  }
  @scala.inline
  implicit class SchemaFirstPartyMobileApplicationTargetingOps[Self <: SchemaFirstPartyMobileApplicationTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedAppIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedAppIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedAppIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedAppIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetedAppIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedAppIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetedAppIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedAppIds")(js.undefined)
        ret
    }
  }
  
}

