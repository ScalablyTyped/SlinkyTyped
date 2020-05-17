package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeographicTransformation extends js.Object {
  /**
    * Geographic transformation steps. Each step represents a geographic transformation that will be used in the process of transforming coordinates from one geographic coordinate system to another.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps)
    */
  var steps: js.Array[GeographicTransformationStep] = js.native
  /**
    * Returns the inverse of the geographic transformation calling this method or `null` if the transformation is not invertible. The inverse of a transformation converts coordinates using the same method and parameters, but in the opposite direction of the original object. For example if the original object represents the `NAD_1983_HARN_To_NAD_1983_NSRS2007_1` transformation, then the inverse will transform from `NAD 83 (NSRS 2007)` to `NAD 83 (HARN)`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#getInverse)
    *
    *
    */
  def getInverse(): GeographicTransformation = js.native
}

object GeographicTransformation {
  @scala.inline
  def apply(getInverse: () => GeographicTransformation, steps: js.Array[GeographicTransformationStep]): GeographicTransformation = {
    val __obj = js.Dynamic.literal(getInverse = js.Any.fromFunction0(getInverse), steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicTransformation]
  }
  @scala.inline
  implicit class GeographicTransformationOps[Self <: GeographicTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInverse(value: () => GeographicTransformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[GeographicTransformationStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

