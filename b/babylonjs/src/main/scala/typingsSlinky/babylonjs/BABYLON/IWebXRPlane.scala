package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.XRPlane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRPlane extends js.Object {
  /**
    * a babylon-assigned ID for this polygon
    */
  var id: Double = js.native
  /**
    * an array of vector3 points in babylon space. right/left hand system is taken into account.
    */
  var polygonDefinition: js.Array[Vector3] = js.native
  /**
    * A transformation matrix to apply on the mesh that will be built using the polygonDefinition
    * Local vs. World are decided if worldParentNode was provided or not in the options when constructing the module
    */
  var transformationMatrix: Matrix = js.native
  /**
    * the native xr-plane object
    */
  var xrPlane: XRPlane = js.native
}

object IWebXRPlane {
  @scala.inline
  def apply(id: Double, polygonDefinition: js.Array[Vector3], transformationMatrix: Matrix, xrPlane: XRPlane): IWebXRPlane = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], polygonDefinition = polygonDefinition.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrPlane = xrPlane.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRPlane]
  }
  @scala.inline
  implicit class IWebXRPlaneOps[Self <: IWebXRPlane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonDefinition(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformationMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformationMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrPlane(value: XRPlane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrPlane")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

