package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.cesium.anon.ContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Scene")
@js.native
class Scene () extends js.Object {
  def this(options: ContextOptions) = this()
  
  var backgroundColor: Color = js.native
  
  val camera: Camera = js.native
  
  val canvas: HTMLCanvasElement = js.native
  
  def cartesianToCanvasCoordinates(position: Cartesian3): Cartesian2 = js.native
  def cartesianToCanvasCoordinates(position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  
  def clampToHeight(cartesian: Cartesian3): Cartesian3 = js.native
  def clampToHeight(
    cartesian: Cartesian3,
    objectsToExclude: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.UndefOr[scala.Nothing], width: Double): Cartesian3 = js.native
  def clampToHeight(
    cartesian: Cartesian3,
    objectsToExclude: js.UndefOr[scala.Nothing],
    width: Double,
    result: Cartesian3
  ): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.Array[_]): Cartesian3 = js.native
  def clampToHeight(
    cartesian: Cartesian3,
    objectsToExclude: js.Array[_],
    width: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.Array[_], width: Double): Cartesian3 = js.native
  def clampToHeight(cartesian: Cartesian3, objectsToExclude: js.Array[_], width: Double, result: Cartesian3): Cartesian3 = js.native
  
  def clampToHeightMostDetailed(cartesian: js.Array[Cartesian3]): js.Promise[js.Array[Cartesian3]] = js.native
  def clampToHeightMostDetailed(cartesian: js.Array[Cartesian3], objectsToExclude: js.UndefOr[scala.Nothing], width: Double): js.Promise[js.Array[Cartesian3]] = js.native
  def clampToHeightMostDetailed(cartesian: js.Array[Cartesian3], objectsToExclude: js.Array[_]): js.Promise[js.Array[Cartesian3]] = js.native
  def clampToHeightMostDetailed(cartesian: js.Array[Cartesian3], objectsToExclude: js.Array[_], width: Double): js.Promise[js.Array[Cartesian3]] = js.native
  
  def completeMorph(): Unit = js.native
  
  var completeMorphOnUserInput: Boolean = js.native
  
  def debugCommandFilter(command: js.Any): Boolean = js.native
  
  val debugFrustumStatistics: js.Any = js.native
  
  var debugShowCommands: Boolean = js.native
  
  var debugShowDepthFrustum: Double = js.native
  
  var debugShowFramesPerSecond: Boolean = js.native
  
  var debugShowFrustumPlanes: Boolean = js.native
  
  var debugShowFrustums: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  val drawingBufferHeight: Double = js.native
  
  val drawingBufferWidth: Double = js.native
  
  def drillPick(windowPosition: Cartesian2): js.Array[_] = js.native
  def drillPick(windowPosition: Cartesian2, limit: Double): js.Array[_] = js.native
  
  var eyeSeparation: Double = js.native
  
  var farToNearRatio: Double = js.native
  
  var focalLength: Double = js.native
  
  var fog: Fog = js.native
  
  var fxaa: Boolean = js.native
  
  def getCompressedTextureFormatSupported(format: String): Boolean = js.native
  
  var globe: Globe = js.native
  
  val groundPrimitives: PrimitiveCollection = js.native
  
  var highDynamicRange: Boolean = js.native
  
  var highDynamicRangeSupported: Boolean = js.native
  
  val id: String = js.native
  
  val imageryLayers: ImageryLayerCollection = js.native
  
  var imagerySplitPosition: Double = js.native
  
  var invertClassification: Boolean = js.native
  
  var invertClassificationColor: Color = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val lastRenderTime: JulianDate = js.native
  
  var light: Light = js.native
  
  var logarithmicDepthBuffer: Boolean = js.native
  
  var logarithmicDepthFarToNearRatio: Double = js.native
  
  var mapMode2D: Boolean = js.native
  
  val mapProjection: MapProjection = js.native
  
  val maximumAliasedLineWidth: Double = js.native
  
  val maximumCubeMapSize: Double = js.native
  
  var maximumRenderTimeChange: Double = js.native
  
  var minimumDisableDepthTestDistance: Double = js.native
  
  var mode: SceneMode = js.native
  
  var moon: js.UndefOr[Moon] = js.native
  
  var morphComplete: Event[js.Array[_]] = js.native
  
  var morphStart: Event[js.Array[_]] = js.native
  
  var morphTime: Double = js.native
  
  def morphTo2D(): Unit = js.native
  def morphTo2D(duration: Double): Unit = js.native
  
  def morphTo3D(): Unit = js.native
  def morphTo3D(duration: Double): Unit = js.native
  
  def morphToColumbusView(): Unit = js.native
  def morphToColumbusView(duration: Double): Unit = js.native
  
  var nearToFarDistance2D: Double = js.native
  
  val orderIndependentTranslucency: Boolean = js.native
  
  def pick(windowPosition: Cartesian2): js.Any = js.native
  def pick(windowPosition: Cartesian2, width: js.UndefOr[scala.Nothing], height: Double): js.Any = js.native
  def pick(windowPosition: Cartesian2, width: Double): js.Any = js.native
  def pick(windowPosition: Cartesian2, width: Double, height: Double): js.Any = js.native
  
  def pickPosition(windowPosition: Cartesian2): Cartesian3 = js.native
  def pickPosition(windowPosition: Cartesian2, result: Cartesian3): Cartesian3 = js.native
  
  val pickPositionSupported: Boolean = js.native
  
  var pickTranslucentDepth: Boolean = js.native
  
  var postProcessStages: PostProcessStageCollection = js.native
  
  val postRender: Event[js.Array[_]] = js.native
  
  val postUpdate: Event[js.Array[_]] = js.native
  
  val preRender: Event[js.Array[_]] = js.native
  
  val preUpdate: Event[js.Array[_]] = js.native
  
  val primitives: PrimitiveCollection = js.native
  
  val renderError: Event[js.Array[_]] = js.native
  
  def requestRender(): Unit = js.native
  
  var requestRenderMode: Boolean = js.native
  
  var rethrowRenderErrors: Boolean = js.native
  
  def sampleHeight(cartographic: Cartographic): Double = js.native
  def sampleHeight(cartographic: Cartographic, objectsToExclude: js.UndefOr[scala.Nothing], width: Double): Double = js.native
  def sampleHeight(cartographic: Cartographic, objectsToExclude: js.Array[_]): Double = js.native
  def sampleHeight(cartographic: Cartographic, objectsToExclude: js.Array[_], width: Double): Double = js.native
  
  def sampleHeightMostDetailed(cartographic: Cartographic): js.Promise[js.Array[Double]] = js.native
  def sampleHeightMostDetailed(cartographic: Cartographic, objectsToExclude: js.UndefOr[scala.Nothing], width: Double): js.Promise[js.Array[Double]] = js.native
  def sampleHeightMostDetailed(cartographic: Cartographic, objectsToExclude: js.Array[_]): js.Promise[js.Array[Double]] = js.native
  def sampleHeightMostDetailed(cartographic: Cartographic, objectsToExclude: js.Array[_], width: Double): js.Promise[js.Array[Double]] = js.native
  
  val sampleHeightSupported: Boolean = js.native
  
  val scene3DOnly: Boolean = js.native
  
  val screenSpaceCameraController: ScreenSpaceCameraController = js.native
  
  var shadowMap: ShadowMap = js.native
  
  var skyAtmosphere: js.UndefOr[SkyAtmosphere] = js.native
  
  var skyBox: js.UndefOr[SkyBox] = js.native
  
  var sun: js.UndefOr[Sun] = js.native
  
  var sunBloom: Boolean = js.native
  
  var terrainExaggeration: Double = js.native
  
  var terrainProvider: TerrainProvider = js.native
  
  val terrainProviderChanged: Event[js.Array[_]] = js.native
  
  var useDepthPicking: Boolean = js.native
  
  var useWebVR: Boolean = js.native
}
