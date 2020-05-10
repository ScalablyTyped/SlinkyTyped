package typingsSlinky.cesium

import typingsSlinky.cesium.mod.ClippingPlaneCollection
import typingsSlinky.cesium.mod.Color
import typingsSlinky.cesium.mod.ColorBlendMode
import typingsSlinky.cesium.mod.Credit
import typingsSlinky.cesium.mod.DistanceDisplayCondition
import typingsSlinky.cesium.mod.HeightReference
import typingsSlinky.cesium.mod.Matrix4
import typingsSlinky.cesium.mod.Scene
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsynchronous extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.native
  var asynchronous: js.UndefOr[Boolean] = js.native
  var basePath: js.UndefOr[String] = js.native
  var clampAnimations: js.UndefOr[Boolean] = js.native
  var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.native
  var color: js.UndefOr[Color] = js.native
  var colorBlendAmount: js.UndefOr[Double] = js.native
  var colorBlendMode: js.UndefOr[ColorBlendMode] = js.native
  var credit: js.UndefOr[Credit] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var debugWireframe: js.UndefOr[Boolean] = js.native
  var dequantizeInShader: js.UndefOr[Boolean] = js.native
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.native
  var heightReference: js.UndefOr[HeightReference] = js.native
  var id: js.UndefOr[js.Any] = js.native
  var incrementallyLoadTextures: js.UndefOr[Boolean] = js.native
  var maximumScale: js.UndefOr[Double] = js.native
  var minimumPixelSize: js.UndefOr[Double] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  var scale: js.UndefOr[Double] = js.native
  var scene: js.UndefOr[Scene] = js.native
  var shadows: js.UndefOr[ShadowMode] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var silhouetteColor: js.UndefOr[Color] = js.native
  var silhouetteSize: js.UndefOr[Double] = js.native
  var url: String = js.native
}

object AnonAsynchronous {
  @scala.inline
  def apply(url: String): AnonAsynchronous = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsynchronous]
  }
  @scala.inline
  implicit class AnonAsynchronousOps[Self <: AnonAsynchronous] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowPicking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPicking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPicking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPicking")(js.undefined)
        ret
    }
    @scala.inline
    def withAsynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asynchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asynchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withClampAnimations(value: Boolean): Self = {
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
    def withClippingPlanes(value: ClippingPlaneCollection): Self = {
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
    def withColor(value: Color): Self = {
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
    def withColorBlendAmount(value: Double): Self = {
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
    def withColorBlendMode(value: ColorBlendMode): Self = {
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
    def withCredit(value: Credit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowBoundingVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBoundingVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowBoundingVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBoundingVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugWireframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugWireframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugWireframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugWireframe")(js.undefined)
        ret
    }
    @scala.inline
    def withDequantizeInShader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dequantizeInShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDequantizeInShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dequantizeInShader")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceDisplayCondition(value: DistanceDisplayCondition): Self = {
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
    def withHeightReference(value: HeightReference): Self = {
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
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementallyLoadTextures(value: Boolean): Self = {
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
    def withMaximumScale(value: Double): Self = {
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
    def withMinimumPixelSize(value: Double): Self = {
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
    def withModelMatrix(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
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
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: ShadowMode): Self = {
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
    def withShow(value: Boolean): Self = {
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
    def withSilhouetteColor(value: Color): Self = {
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
    def withSilhouetteSize(value: Double): Self = {
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
  }
  
}

