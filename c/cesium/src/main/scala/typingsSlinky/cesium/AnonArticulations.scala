package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.ClippingPlaneCollection
import typingsSlinky.cesium.mod.Color
import typingsSlinky.cesium.mod.ColorBlendMode
import typingsSlinky.cesium.mod.DistanceDisplayCondition
import typingsSlinky.cesium.mod.HeightReference
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.PropertyBag
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArticulations extends js.Object {
  var articulations: js.UndefOr[PropertyBag] = js.native
  var clampAnimations: js.UndefOr[Property | Boolean] = js.native
  var clippingPlanes: js.UndefOr[Property | ClippingPlaneCollection] = js.native
  var color: js.UndefOr[Property | Color] = js.native
  var colorBlendAmount: js.UndefOr[Property | Double] = js.native
  var colorBlendMode: js.UndefOr[Property | ColorBlendMode] = js.native
  var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.native
  var heightReference: js.UndefOr[Property | HeightReference] = js.native
  var imageBasedLightingFactor: js.UndefOr[Property | Cartesian2] = js.native
  var incrementallyLoadTextures: js.UndefOr[Property | Boolean] = js.native
  var lightColor: js.UndefOr[Property | Cartesian3] = js.native
  var maximumScale: js.UndefOr[Property | Double] = js.native
  var minimumPixelSize: js.UndefOr[Property | Double] = js.native
  var nodeTransformations: js.UndefOr[PropertyBag] = js.native
  var runAnimations: js.UndefOr[Property | Boolean] = js.native
  var scale: js.UndefOr[Property | Double] = js.native
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  var show: js.UndefOr[Property | Boolean] = js.native
  var silhouetteColor: js.UndefOr[Property | Color] = js.native
  var silhouetteSize: js.UndefOr[Property | Double] = js.native
  var uri: js.UndefOr[Property | String] = js.native
}

object AnonArticulations {
  @scala.inline
  def apply(): AnonArticulations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArticulations]
  }
  @scala.inline
  implicit class AnonArticulationsOps[Self <: AnonArticulations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArticulations(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("articulations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticulations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("articulations")(js.undefined)
        ret
    }
    @scala.inline
    def withClampAnimations(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClampAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withClippingPlanes(value: Property | ClippingPlaneCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPlanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClippingPlanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPlanes")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Property | Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBlendAmount(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBlendAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBlendAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBlendAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBlendMode(value: Property | ColorBlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBlendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBlendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDisplayCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceDisplayCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDisplayCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightReference(value: Property | HeightReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightReference")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBasedLightingFactor(value: Property | Cartesian2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBasedLightingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBasedLightingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBasedLightingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementallyLoadTextures(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementallyLoadTextures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementallyLoadTextures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementallyLoadTextures")(js.undefined)
        ret
    }
    @scala.inline
    def withLightColor(value: Property | Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumScale(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumPixelSize(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPixelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumPixelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPixelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTransformations(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTransformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTransformations")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAnimations(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: Property | ShadowMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSilhouetteColor(value: Property | Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silhouetteColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilhouetteColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silhouetteColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSilhouetteSize(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silhouetteSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilhouetteSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silhouetteSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: Property | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

