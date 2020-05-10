package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMotionControllerProfile extends js.Object {
  /**
    * fallback profiles for this profileId
    */
  var fallbackProfileIds: js.Array[String] = js.native
  /**
    * The layout map, with handness as key
    */
  var layouts: IMotionControllerLayoutMap = js.native
  /**
    * The id of this profile
    * correlates to the profile(s) in the xrInput.profiles array
    */
  var profileId: String = js.native
}

object IMotionControllerProfile {
  @scala.inline
  def apply(fallbackProfileIds: js.Array[String], layouts: IMotionControllerLayoutMap, profileId: String): IMotionControllerProfile = {
    val __obj = js.Dynamic.literal(fallbackProfileIds = fallbackProfileIds.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerProfile]
  }
  @scala.inline
  implicit class IMotionControllerProfileOps[Self <: IMotionControllerProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallbackProfileIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackProfileIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayouts(value: IMotionControllerLayoutMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

