package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.Friction
import typingsSlinky.babylonjs.anon.ImpostorSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRControllerPhysicsOptions extends js.Object {
  /**
    * Should the headset get its own impostor
    */
  var enableHeadsetImpostor: js.UndefOr[Boolean] = js.native
  /**
    * Optional parameters for the headset impostor
    */
  var headsetImpostorParams: js.UndefOr[Friction] = js.native
  /**
    * The physics properties of the future impostors
    */
  var physicsProperties: js.UndefOr[ImpostorSize] = js.native
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput = js.native
}

object IWebXRControllerPhysicsOptions {
  @scala.inline
  def apply(xrInput: WebXRInput): IWebXRControllerPhysicsOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPhysicsOptions]
  }
  @scala.inline
  implicit class IWebXRControllerPhysicsOptionsOps[Self <: IWebXRControllerPhysicsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXrInput(value: WebXRInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableHeadsetImpostor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHeadsetImpostor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHeadsetImpostor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHeadsetImpostor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadsetImpostorParams(value: Friction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headsetImpostorParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadsetImpostorParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headsetImpostorParams")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicsProperties(value: ImpostorSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicsProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicsProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicsProperties")(js.undefined)
        ret
    }
  }
  
}

