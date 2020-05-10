package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRControllerOptions extends js.Object {
  /**
    * Should the controller mesh be animated when a user interacts with it
    * The pressed buttons / thumbstick and touchpad animations will be disabled
    */
  var disableMotionControllerAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Do not load the controller mesh, in case a different mesh needs to be loaded.
    */
  var doNotLoadControllerMesh: js.UndefOr[Boolean] = js.native
  /**
    * Force a specific controller type for this controller.
    * This can be used when creating your own profile or when testing different controllers
    */
  var forceControllerProfile: js.UndefOr[String] = js.native
}

object IWebXRControllerOptions {
  @scala.inline
  def apply(): IWebXRControllerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRControllerOptions]
  }
  @scala.inline
  implicit class IWebXRControllerOptionsOps[Self <: IWebXRControllerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableMotionControllerAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMotionControllerAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMotionControllerAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMotionControllerAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotLoadControllerMesh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLoadControllerMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotLoadControllerMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLoadControllerMesh")(js.undefined)
        ret
    }
    @scala.inline
    def withForceControllerProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceControllerProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceControllerProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceControllerProfile")(js.undefined)
        ret
    }
  }
  
}

