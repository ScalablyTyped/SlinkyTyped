package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAxisMeshNames extends js.Object {
  var axisMeshNames: js.Array[String] = js.native
  var buttonMeshNames: AnonGrip = js.native
  var buttonObservableNames: AnonGrip = js.native
  var buttons: js.Array[String] = js.native
  var pointingPoseMeshName: String = js.native
}

object AnonAxisMeshNames {
  @scala.inline
  def apply(
    axisMeshNames: js.Array[String],
    buttonMeshNames: AnonGrip,
    buttonObservableNames: AnonGrip,
    buttons: js.Array[String],
    pointingPoseMeshName: String
  ): AnonAxisMeshNames = {
    val __obj = js.Dynamic.literal(axisMeshNames = axisMeshNames.asInstanceOf[js.Any], buttonMeshNames = buttonMeshNames.asInstanceOf[js.Any], buttonObservableNames = buttonObservableNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], pointingPoseMeshName = pointingPoseMeshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxisMeshNames]
  }
  @scala.inline
  implicit class AnonAxisMeshNamesOps[Self <: AnonAxisMeshNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisMeshNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisMeshNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonMeshNames(value: AnonGrip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMeshNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonObservableNames(value: AnonGrip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonObservableNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointingPoseMeshName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointingPoseMeshName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

