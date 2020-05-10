package typingsSlinky.ol.viewMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions extends js.Object {
  var center: js.UndefOr[Coordinate] = js.native
  var constrainOnlyCenter: js.UndefOr[Boolean] = js.native
  var constrainResolution: js.UndefOr[Boolean] = js.native
  var constrainRotation: js.UndefOr[Boolean | Double] = js.native
  var enableRotation: js.UndefOr[Boolean] = js.native
  var extent: js.UndefOr[Extent] = js.native
  var maxResolution: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var multiWorld: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var resolution: js.UndefOr[Double] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var showFullExtent: js.UndefOr[Boolean] = js.native
  var smoothExtentConstraint: js.UndefOr[Boolean] = js.native
  var smoothResolutionConstraint: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomFactor: js.UndefOr[Double] = js.native
}

object ViewOptions {
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainOnlyCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainOnlyCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainOnlyCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainOnlyCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainRotation(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: Extent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiWorld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiWorld")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFullExtent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFullExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothExtentConstraint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothExtentConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothExtentConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothExtentConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothResolutionConstraint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothResolutionConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothResolutionConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothResolutionConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
  }
  
}

