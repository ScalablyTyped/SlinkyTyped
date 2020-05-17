package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthSortedParticle extends js.Object {
  /**
    * Index of the particle in the "indices" array
    */
  var ind: Double = js.native
  /**
    * Length of the particle shape in the "indices" array
    */
  var indicesLength: Double = js.native
  /**
    * Material index when used with MultiMaterials
    */
  var materialIndex: Double = js.native
  /**
    * Squared distance from the particle to the camera
    */
  var sqDistance: Double = js.native
}

object DepthSortedParticle {
  @scala.inline
  def apply(ind: Double, indicesLength: Double, materialIndex: Double, sqDistance: Double): DepthSortedParticle = {
    val __obj = js.Dynamic.literal(ind = ind.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], materialIndex = materialIndex.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthSortedParticle]
  }
  @scala.inline
  implicit class DepthSortedParticleOps[Self <: DepthSortedParticle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicesLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterialIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqDistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

