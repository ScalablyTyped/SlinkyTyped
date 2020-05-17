package typingsSlinky.cesium.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.cesiumBooleans.`false`
import typingsSlinky.cesium.mod.ImageryProvider
import typingsSlinky.cesium.mod.MapMode2D
import typingsSlinky.cesium.mod.MapProjection
import typingsSlinky.cesium.mod.SceneMode
import typingsSlinky.cesium.mod.ShadowMode
import typingsSlinky.cesium.mod.SkyAtmosphere
import typingsSlinky.cesium.mod.SkyBox
import typingsSlinky.cesium.mod.TerrainProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditContainer extends js.Object {
  var clock: js.UndefOr[typingsSlinky.cesium.mod.Clock] = js.native
  var contextOptions: js.UndefOr[js.Any] = js.native
  var creditContainer: js.UndefOr[Element | String] = js.native
  var creditViewport: js.UndefOr[Element | String] = js.native
  var globe: js.UndefOr[typingsSlinky.cesium.mod.Globe | `false`] = js.native
  var imageryProvider: js.UndefOr[ImageryProvider | `false`] = js.native
  var mapMode2D: js.UndefOr[MapMode2D] = js.native
  var mapProjection: js.UndefOr[MapProjection] = js.native
  var maximumRenderTimeChange: js.UndefOr[Double] = js.native
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.native
  var requestRenderMode: js.UndefOr[Boolean] = js.native
  var scene3DOnly: js.UndefOr[Boolean] = js.native
  var sceneMode: js.UndefOr[SceneMode] = js.native
  var shadows: js.UndefOr[Boolean] = js.native
  var showRenderLoopErrors: js.UndefOr[Boolean] = js.native
  var skyAtmosphere: js.UndefOr[SkyAtmosphere | `false`] = js.native
  var skyBox: js.UndefOr[SkyBox | `false`] = js.native
  var targetFrameRate: js.UndefOr[Double] = js.native
  var terrainExaggeration: js.UndefOr[Double] = js.native
  var terrainProvider: js.UndefOr[TerrainProvider] = js.native
  var terrainShadows: js.UndefOr[ShadowMode] = js.native
  var useDefaultRenderLoop: js.UndefOr[Boolean] = js.native
}

object CreditContainer {
  @scala.inline
  def apply(): CreditContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditContainer]
  }
  @scala.inline
  implicit class CreditContainerOps[Self <: CreditContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClock(value: typingsSlinky.cesium.mod.Clock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(js.undefined)
        ret
    }
    @scala.inline
    def withContextOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditContainer(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditViewportElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditViewport(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobe(value: typingsSlinky.cesium.mod.Globe | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globe")(js.undefined)
        ret
    }
    @scala.inline
    def withImageryProvider(value: ImageryProvider | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageryProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withMapMode2D(value: MapMode2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapMode2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapMode2D: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapMode2D")(js.undefined)
        ret
    }
    @scala.inline
    def withMapProjection(value: MapProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapProjection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRenderTimeChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRenderTimeChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRenderTimeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRenderTimeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderIndependentTranslucency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderIndependentTranslucency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderIndependentTranslucency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderIndependentTranslucency")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestRenderMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestRenderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestRenderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScene3DOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene3DOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene3DOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene3DOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneMode(value: SceneMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: Boolean): Self = {
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
    def withShowRenderLoopErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRenderLoopErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRenderLoopErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRenderLoopErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyAtmosphere(value: SkyAtmosphere | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyAtmosphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkyAtmosphere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyAtmosphere")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyBox(value: SkyBox | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkyBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyBox")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetFrameRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFrameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withTerrainExaggeration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainExaggeration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrainExaggeration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainExaggeration")(js.undefined)
        ret
    }
    @scala.inline
    def withTerrainProvider(value: TerrainProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrainProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withTerrainShadows(value: ShadowMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrainShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainShadows")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDefaultRenderLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultRenderLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefaultRenderLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultRenderLoop")(js.undefined)
        ret
    }
  }
  
}

