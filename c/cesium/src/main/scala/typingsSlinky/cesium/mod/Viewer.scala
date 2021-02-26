package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.cesium.anon.Duration
import typingsSlinky.cesium.mod.Viewer.ViewerMixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Viewer")
@js.native
class Viewer protected () extends StObject {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, options: typingsSlinky.cesium.anon.Animation) = this()
  def this(container: Element, options: typingsSlinky.cesium.anon.Animation) = this()
  
  var allowDataSourcesToSuspendAnimation: Boolean = js.native
  
  val animation: Animation = js.native
  
  val baseLayerPicker: BaseLayerPicker = js.native
  
  val bottomContainer: Element = js.native
  
  val camera: Camera = js.native
  
  val canvas: HTMLCanvasElement = js.native
  
  val cesiumWidget: CesiumWidget = js.native
  
  val clock: Clock = js.native
  
  var clockTrackedDataSource: DataSource = js.native
  
  val clockViewModel: ClockViewModel = js.native
  
  val container: Element = js.native
  
  val dataSourceDisplay: DataSourceDisplay = js.native
  
  val dataSources: DataSourceCollection = js.native
  
  def destroy(): Unit = js.native
  
  val entities: EntityCollection = js.native
  
  def extend(mixin: ViewerMixin, options: js.Any): Unit = js.native
  
  def flyTo(target: js.Array[Entity]): js.Promise[Boolean] = js.native
  def flyTo(target: js.Array[Entity], options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource]): js.Promise[Boolean] = js.native
  def flyTo(target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource], options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: DataSource): js.Promise[Boolean] = js.native
  def flyTo(target: DataSource, options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: Entity): js.Promise[Boolean] = js.native
  def flyTo(target: EntityCollection): js.Promise[Boolean] = js.native
  def flyTo(target: EntityCollection, options: Duration): js.Promise[Boolean] = js.native
  def flyTo(target: Entity, options: Duration): js.Promise[Boolean] = js.native
  
  def forceResize(): Unit = js.native
  
  val fullscreenButton: FullscreenButton = js.native
  
  val geocoder: Geocoder = js.native
  
  val homeButton: HomeButton = js.native
  
  val imageryLayers: ImageryLayerCollection = js.native
  
  val infoBox: InfoBox = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val navigationHelpButton: NavigationHelpButton = js.native
  
  val projectionPicker: ProjectionPicker = js.native
  
  def render(): Unit = js.native
  
  def resize(): Unit = js.native
  
  var resolutionScale: Double = js.native
  
  val scene: Scene = js.native
  
  val sceneModePicker: SceneModePicker = js.native
  
  val screenSpaceEventHandler: ScreenSpaceEventHandler = js.native
  
  var selectedEntity: Entity = js.native
  
  val selectedEntityChanged: Event[js.Array[js.UndefOr[Entity]]] = js.native
  
  val selectionIndicator: SelectionIndicator = js.native
  
  val shadowMap: ShadowMap = js.native
  
  var shadows: Boolean = js.native
  
  var targetFrameRate: Double = js.native
  
  var terrainProvider: TerrainProvider = js.native
  
  var terrainShadows: ShadowMode = js.native
  
  val timeline: Timeline = js.native
  
  var trackedEntity: Entity = js.native
  
  val trackedEntityChanged: Event[js.Array[js.UndefOr[Entity]]] = js.native
  
  var useBrowserRecommendedResolution: Boolean = js.native
  
  var useDefaultRenderLoop: Boolean = js.native
  
  val vrButton: VRButton = js.native
  
  def zoomTo(target: js.Array[Entity]): js.Promise[Boolean] = js.native
  def zoomTo(target: js.Array[Entity], offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource]): js.Promise[Boolean] = js.native
  def zoomTo(
    target: js.Promise[Entity | js.Array[Entity] | EntityCollection | DataSource],
    offset: HeadingPitchRange
  ): js.Promise[Boolean] = js.native
  def zoomTo(target: DataSource): js.Promise[Boolean] = js.native
  def zoomTo(target: DataSource, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(target: Entity): js.Promise[Boolean] = js.native
  def zoomTo(target: EntityCollection): js.Promise[Boolean] = js.native
  def zoomTo(target: EntityCollection, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
  def zoomTo(target: Entity, offset: HeadingPitchRange): js.Promise[Boolean] = js.native
}
object Viewer {
  
  type ViewerMixin = js.Function2[/* viewer */ Viewer, /* options */ js.Any, Unit]
}
