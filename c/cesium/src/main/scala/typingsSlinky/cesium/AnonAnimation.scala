package typingsSlinky.cesium

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.cesiumBooleans.`false`
import typingsSlinky.cesium.mod.ClockViewModel
import typingsSlinky.cesium.mod.DataSourceCollection
import typingsSlinky.cesium.mod.Globe
import typingsSlinky.cesium.mod.ImageryProvider
import typingsSlinky.cesium.mod.MapMode2D
import typingsSlinky.cesium.mod.MapProjection
import typingsSlinky.cesium.mod.ProviderViewModel
import typingsSlinky.cesium.mod.SceneMode
import typingsSlinky.cesium.mod.ShadowMode
import typingsSlinky.cesium.mod.SkyAtmosphere
import typingsSlinky.cesium.mod.SkyBox
import typingsSlinky.cesium.mod.TerrainProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimation extends js.Object {
  var animation: js.UndefOr[Boolean] = js.native
  var automaticallyTrackDataSourceClocks: js.UndefOr[Boolean] = js.native
  var baseLayerPicker: js.UndefOr[Boolean] = js.native
  var clockViewModel: js.UndefOr[ClockViewModel] = js.native
  var contextOptions: js.UndefOr[js.Any] = js.native
  var creditContainer: js.UndefOr[Element | String] = js.native
  var creditViewport: js.UndefOr[Element | String] = js.native
  var dataSources: js.UndefOr[DataSourceCollection] = js.native
  var fullscreenButton: js.UndefOr[Boolean] = js.native
  var fullscreenElement: js.UndefOr[Element | String] = js.native
  var geocoder: js.UndefOr[Boolean] = js.native
  var globe: js.UndefOr[Globe | `false`] = js.native
  var homeButton: js.UndefOr[Boolean] = js.native
  var imageryProvider: js.UndefOr[ImageryProvider | `false`] = js.native
  var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
  var infoBox: js.UndefOr[Boolean] = js.native
  var mapMode2D: js.UndefOr[MapMode2D] = js.native
  var mapProjection: js.UndefOr[MapProjection] = js.native
  var maximumRenderTimeChange: js.UndefOr[Double] = js.native
  var navigationHelpButton: js.UndefOr[Boolean] = js.native
  var navigationInstructionsInitiallyVisible: js.UndefOr[Boolean] = js.native
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.native
  var projectionPicker: js.UndefOr[Boolean] = js.native
  var requestRenderMode: js.UndefOr[Boolean] = js.native
  var scene3DOnly: js.UndefOr[Boolean] = js.native
  var sceneMode: js.UndefOr[SceneMode] = js.native
  var sceneModePicker: js.UndefOr[Boolean] = js.native
  var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  var selectionIndicator: js.UndefOr[Boolean] = js.native
  var shadows: js.UndefOr[Boolean] = js.native
  var shouldAnimate: js.UndefOr[Boolean] = js.native
  var showRenderLoopErrors: js.UndefOr[Boolean] = js.native
  var skyAtmosphere: js.UndefOr[SkyAtmosphere | `false`] = js.native
  var skyBox: js.UndefOr[SkyBox | `false`] = js.native
  var targetFrameRate: js.UndefOr[Double] = js.native
  var terrainExaggeration: js.UndefOr[Double] = js.native
  var terrainProvider: js.UndefOr[TerrainProvider] = js.native
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
  var terrainShadows: js.UndefOr[ShadowMode] = js.native
  var timeline: js.UndefOr[Boolean] = js.native
  var useDefaultRenderLoop: js.UndefOr[Boolean] = js.native
  var vrButton: js.UndefOr[Boolean] = js.native
}

object AnonAnimation {
  @scala.inline
  def apply(): AnonAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnimation]
  }
  @scala.inline
  implicit class AnonAnimationOps[Self <: AnonAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticallyTrackDataSourceClocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyTrackDataSourceClocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticallyTrackDataSourceClocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyTrackDataSourceClocks")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseLayerPicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayerPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLayerPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayerPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withClockViewModel(value: ClockViewModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockViewModel")(js.undefined)
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
    def withDataSources(value: DataSourceCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenButton")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenElement(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGeocoder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeocoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoder")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobe(value: Globe | `false`): Self = {
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
    def withHomeButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeButton")(js.undefined)
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
    def withImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProviderViewModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageryProviderViewModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProviderViewModels")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoBox")(js.undefined)
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
    def withNavigationHelpButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationHelpButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationHelpButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationHelpButton")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationInstructionsInitiallyVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationInstructionsInitiallyVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationInstructionsInitiallyVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationInstructionsInitiallyVisible")(js.undefined)
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
    def withProjectionPicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionPicker")(js.undefined)
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
    def withSceneModePicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneModePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneModePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneModePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedImageryProviderViewModel(value: ProviderViewModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageryProviderViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedImageryProviderViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageryProviderViewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTerrainProviderViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTerrainProviderViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTerrainProviderViewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionIndicator")(js.undefined)
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
    def withShouldAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAnimate")(js.undefined)
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
    def withTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainProviderViewModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrainProviderViewModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainProviderViewModels")(js.undefined)
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
    def withTimeline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.undefined)
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
    @scala.inline
    def withVrButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVrButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrButton")(js.undefined)
        ret
    }
  }
  
}

