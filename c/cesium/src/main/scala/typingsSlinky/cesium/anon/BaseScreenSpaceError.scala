package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.Cesium3DTileset
import typingsSlinky.cesium.mod.ClippingPlaneCollection
import typingsSlinky.cesium.mod.Matrix4
import typingsSlinky.cesium.mod.Resource
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseScreenSpaceError extends js.Object {
  var baseScreenSpaceError: js.UndefOr[Double] = js.native
  var classificationType: js.UndefOr[typingsSlinky.cesium.mod.ClassificationType] = js.native
  var clippingPlane: js.UndefOr[ClippingPlaneCollection] = js.native
  var cullRequestsWhileMoving: js.UndefOr[Boolean] = js.native
  var cullRequestsWhileMovingMultiplier: js.UndefOr[Double] = js.native
  var cullWithChildrenBounds: js.UndefOr[Boolean] = js.native
  var debugColorizeTiles: js.UndefOr[Boolean] = js.native
  var debugFreezeFrame: js.UndefOr[Boolean] = js.native
  var debugHeatmapTilePropertyName: js.UndefOr[String] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var debugShowContentBoundingVolume: js.UndefOr[Boolean] = js.native
  var debugShowGeometricError: js.UndefOr[Boolean] = js.native
  var debugShowMemoryUsage: js.UndefOr[Boolean] = js.native
  var debugShowRenderingStatistics: js.UndefOr[Boolean] = js.native
  var debugShowUrl: js.UndefOr[Boolean] = js.native
  var debugShowViewerRequestVolume: js.UndefOr[Boolean] = js.native
  var debugWireframe: js.UndefOr[Boolean] = js.native
  var dynamicScreenSpaceError: js.UndefOr[Boolean] = js.native
  var dynamicScreenSpaceErrorDensity: js.UndefOr[Double] = js.native
  var dynamicScreenSpaceErrorFactor: js.UndefOr[Double] = js.native
  var dynamicScreenSpaceErrorHeightFalloff: js.UndefOr[Double] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var foveatedConeSize: js.UndefOr[Double] = js.native
  var foveatedInterpolationCallback: js.UndefOr[Cesium3DTileset] = js.native
  var foveatedMinimumScreenSpaceErrorRelaxation: js.UndefOr[Double] = js.native
  var foveatedScreenSpaceError: js.UndefOr[Boolean] = js.native
  var foveatedTimeDelay: js.UndefOr[Double] = js.native
  var imageBasedLightingFactor: js.UndefOr[Cartesian2] = js.native
  var immediatelyLoadDesiredLevelOfDetail: js.UndefOr[Boolean] = js.native
  var lightColor: js.UndefOr[Cartesian3] = js.native
  var loadSiblings: js.UndefOr[Boolean] = js.native
  var luminanceAtZenith: js.UndefOr[Double] = js.native
  var maximumMemoryUsage: js.UndefOr[Double] = js.native
  var maximumNumberOfLoadedTiles: js.UndefOr[Double] = js.native
  var maximumScreenSpaceError: js.UndefOr[Double] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  var pointCloudShading: js.UndefOr[js.Any] = js.native
  var preferLeaves: js.UndefOr[Boolean] = js.native
  var preloadFlightDestinations: js.UndefOr[Boolean] = js.native
  var preloadWhenHidden: js.UndefOr[Boolean] = js.native
  var progressiveResolutionHeightFraction: js.UndefOr[Double] = js.native
  var shadows: js.UndefOr[ShadowMode] = js.native
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Optimization option.
    * Determines if level of detail skipping should be applied during the traversal.
    * @default false
    */
  var skipLevelOfDetail: js.UndefOr[Boolean] = js.native
  var skipLevels: js.UndefOr[Double] = js.native
  var skipScreenSpaceErrorFactor: js.UndefOr[Double] = js.native
  var specularEnvironmentMaps: js.UndefOr[String] = js.native
  var sphericalHarmonicCoefficients: js.UndefOr[js.Array[Cartesian3]] = js.native
  var url: Resource | String | (js.Promise[Resource | String]) = js.native
}

object BaseScreenSpaceError {
  @scala.inline
  def apply(url: Resource | String | (js.Promise[Resource | String])): BaseScreenSpaceError = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScreenSpaceError]
  }
  @scala.inline
  implicit class BaseScreenSpaceErrorOps[Self <: BaseScreenSpaceError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: Resource | String | (js.Promise[Resource | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseScreenSpaceError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseScreenSpaceError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseScreenSpaceError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseScreenSpaceError")(js.undefined)
        ret
    }
    @scala.inline
    def withClassificationType(value: typingsSlinky.cesium.mod.ClassificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(js.undefined)
        ret
    }
    @scala.inline
    def withClippingPlane(value: ClippingPlaneCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPlane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClippingPlane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPlane")(js.undefined)
        ret
    }
    @scala.inline
    def withCullRequestsWhileMoving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullRequestsWhileMoving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCullRequestsWhileMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullRequestsWhileMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withCullRequestsWhileMovingMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullRequestsWhileMovingMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCullRequestsWhileMovingMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullRequestsWhileMovingMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withCullWithChildrenBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullWithChildrenBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCullWithChildrenBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullWithChildrenBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugColorizeTiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugColorizeTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugColorizeTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugColorizeTiles")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugFreezeFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugFreezeFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugFreezeFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugFreezeFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugHeatmapTilePropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugHeatmapTilePropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugHeatmapTilePropertyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugHeatmapTilePropertyName")(js.undefined)
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
    def withDebugShowContentBoundingVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowContentBoundingVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowContentBoundingVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowContentBoundingVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowGeometricError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowGeometricError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowGeometricError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowGeometricError")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowMemoryUsage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowMemoryUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowMemoryUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowMemoryUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowRenderingStatistics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowRenderingStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowRenderingStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowRenderingStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugShowViewerRequestVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowViewerRequestVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugShowViewerRequestVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowViewerRequestVolume")(js.undefined)
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
    def withDynamicScreenSpaceError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicScreenSpaceError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceError")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicScreenSpaceErrorDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceErrorDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicScreenSpaceErrorDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceErrorDensity")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicScreenSpaceErrorFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceErrorFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicScreenSpaceErrorFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceErrorFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicScreenSpaceErrorHeightFalloff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceErrorHeightFalloff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicScreenSpaceErrorHeightFalloff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicScreenSpaceErrorHeightFalloff")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withFoveatedConeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedConeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoveatedConeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedConeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFoveatedInterpolationCallback(value: Cesium3DTileset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedInterpolationCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoveatedInterpolationCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedInterpolationCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFoveatedMinimumScreenSpaceErrorRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedMinimumScreenSpaceErrorRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoveatedMinimumScreenSpaceErrorRelaxation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedMinimumScreenSpaceErrorRelaxation")(js.undefined)
        ret
    }
    @scala.inline
    def withFoveatedScreenSpaceError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedScreenSpaceError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoveatedScreenSpaceError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedScreenSpaceError")(js.undefined)
        ret
    }
    @scala.inline
    def withFoveatedTimeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedTimeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoveatedTimeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foveatedTimeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBasedLightingFactor(value: Cartesian2): Self = {
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
    def withImmediatelyLoadDesiredLevelOfDetail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediatelyLoadDesiredLevelOfDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediatelyLoadDesiredLevelOfDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediatelyLoadDesiredLevelOfDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withLightColor(value: Cartesian3): Self = {
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
    def withLoadSiblings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSiblings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadSiblings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSiblings")(js.undefined)
        ret
    }
    @scala.inline
    def withLuminanceAtZenith(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luminanceAtZenith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLuminanceAtZenith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luminanceAtZenith")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumMemoryUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumMemoryUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumMemoryUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumMemoryUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumNumberOfLoadedTiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumNumberOfLoadedTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumNumberOfLoadedTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumNumberOfLoadedTiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumScreenSpaceError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScreenSpaceError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumScreenSpaceError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScreenSpaceError")(js.undefined)
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
    def withPointCloudShading(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointCloudShading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointCloudShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointCloudShading")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferLeaves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferLeaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferLeaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferLeaves")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadFlightDestinations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadFlightDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadFlightDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadFlightDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadWhenHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadWhenHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadWhenHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadWhenHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveResolutionHeightFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveResolutionHeightFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveResolutionHeightFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveResolutionHeightFraction")(js.undefined)
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
    def withSkipLevelOfDetail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLevelOfDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLevelOfDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLevelOfDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLevels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipScreenSpaceErrorFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipScreenSpaceErrorFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipScreenSpaceErrorFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipScreenSpaceErrorFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecularEnvironmentMaps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularEnvironmentMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecularEnvironmentMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularEnvironmentMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withSphericalHarmonicCoefficients(value: js.Array[Cartesian3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphericalHarmonicCoefficients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSphericalHarmonicCoefficients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphericalHarmonicCoefficients")(js.undefined)
        ret
    }
  }
  
}

