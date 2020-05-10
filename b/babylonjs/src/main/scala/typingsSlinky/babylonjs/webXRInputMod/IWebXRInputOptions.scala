package typingsSlinky.babylonjs.webXRInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRInputOptions extends js.Object {
  /**
    * A custom URL for the controllers repository
    */
  var customControllersRepositoryURL: js.UndefOr[String] = js.native
  /**
    * Should the controller model's components not move according to the user input
    */
  var disableControllerAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Do not send a request to the controller repository to load the profile.
    *
    * Instead, use the controllers available in babylon itself.
    */
  var disableOnlineControllerRepository: js.UndefOr[Boolean] = js.native
  /**
    * If set to true no model will be automatically loaded
    */
  var doNotLoadControllerMeshes: js.UndefOr[Boolean] = js.native
  /**
    * If set, this profile will be used for all controllers loaded (for example "microsoft-mixed-reality")
    * If not found, the xr input profile data will be used.
    * Profiles are defined here - https://github.com/immersive-web/webxr-input-profiles/
    */
  var forceInputProfile: js.UndefOr[String] = js.native
}

object IWebXRInputOptions {
  @scala.inline
  def apply(): IWebXRInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRInputOptions]
  }
  @scala.inline
  implicit class IWebXRInputOptionsOps[Self <: IWebXRInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomControllersRepositoryURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customControllersRepositoryURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomControllersRepositoryURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customControllersRepositoryURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableControllerAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableControllerAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableControllerAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableControllerAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableOnlineControllerRepository(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOnlineControllerRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOnlineControllerRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOnlineControllerRepository")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotLoadControllerMeshes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLoadControllerMeshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotLoadControllerMeshes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLoadControllerMeshes")(js.undefined)
        ret
    }
    @scala.inline
    def withForceInputProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceInputProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceInputProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceInputProfile")(js.undefined)
        ret
    }
  }
  
}

