package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.XRAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRAnchor extends js.Object {
  /**
    * A babylon-assigned ID for this anchor
    */
  var id: Double = js.native
  /**
    * Transformation matrix to apply to an object attached to this anchor
    */
  var transformationMatrix: Matrix = js.native
  /**
    * The native anchor object
    */
  var xrAnchor: XRAnchor = js.native
}

object IWebXRAnchor {
  @scala.inline
  def apply(id: Double, transformationMatrix: Matrix, xrAnchor: XRAnchor): IWebXRAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrAnchor = xrAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRAnchor]
  }
  @scala.inline
  implicit class IWebXRAnchorOps[Self <: IWebXRAnchor] (val x: Self) extends AnyVal {
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
    def withTransformationMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformationMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrAnchor(value: XRAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrAnchor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

