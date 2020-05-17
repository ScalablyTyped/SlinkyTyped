package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisMeshNames extends js.Object {
  var axisMeshNames: js.Array[String] = js.native
  var buttonMeshNames: Grip = js.native
  var buttonObservableNames: Grip = js.native
  var buttons: js.Array[String] = js.native
  var pointingPoseMeshName: String = js.native
}

object AxisMeshNames {
  @scala.inline
  def apply(
    axisMeshNames: js.Array[String],
    buttonMeshNames: Grip,
    buttonObservableNames: Grip,
    buttons: js.Array[String],
    pointingPoseMeshName: String
  ): AxisMeshNames = {
    val __obj = js.Dynamic.literal(axisMeshNames = axisMeshNames.asInstanceOf[js.Any], buttonMeshNames = buttonMeshNames.asInstanceOf[js.Any], buttonObservableNames = buttonObservableNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], pointingPoseMeshName = pointingPoseMeshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisMeshNames]
  }
  @scala.inline
  implicit class AxisMeshNamesOps[Self <: AxisMeshNames] (val x: Self) extends AnyVal {
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
    def withButtonMeshNames(value: Grip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMeshNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonObservableNames(value: Grip): Self = {
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

