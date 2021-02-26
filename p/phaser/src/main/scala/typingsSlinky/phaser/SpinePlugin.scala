package typingsSlinky.phaser

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.Phaser.Cache.BaseCache
import typingsSlinky.phaser.Phaser.Plugins.ScenePlugin
import typingsSlinky.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typingsSlinky.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typingsSlinky.phaser.Phaser.Textures.TextureManager
import typingsSlinky.phaser.anon.Typeofspine
import typingsSlinky.phaser.spine.Bone
import typingsSlinky.phaser.spine.Skeleton
import typingsSlinky.phaser.spine.TextureAtlas
import typingsSlinky.phaser.spine.Vector2
import typingsSlinky.phaser.spine.VertexEffect
import typingsSlinky.phaser.spine.canvas.SkeletonRenderer
import typingsSlinky.phaser.spine.webgl.SceneRenderer
import typingsSlinky.phaser.spine.webgl.SkeletonDebugRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinePlugin extends ScenePlugin {
  
  def add(x: Double, y: Double): SpineGameObject = js.native
  def add(
    x: Double,
    y: Double,
    key: js.UndefOr[scala.Nothing],
    animationName: js.UndefOr[scala.Nothing],
    loop: Boolean
  ): SpineGameObject = js.native
  def add(x: Double, y: Double, key: js.UndefOr[scala.Nothing], animationName: String): SpineGameObject = js.native
  def add(x: Double, y: Double, key: js.UndefOr[scala.Nothing], animationName: String, loop: Boolean): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String, animationName: js.UndefOr[scala.Nothing], loop: Boolean): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String, animationName: String): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String, animationName: String, loop: Boolean): SpineGameObject = js.native
  
  var cache: BaseCache = js.native
  
  def createAnimationState(skeleton: Skeleton): js.Any = js.native
  
  def createSkeleton(key: String): js.Any | Null = js.native
  def createSkeleton(key: String, skeletonJSON: js.Object): js.Any | Null = js.native
  
  var drawDebug: Boolean = js.native
  
  def getAtlasCanvas(key: String): TextureAtlas = js.native
  
  def getAtlasWebGL(key: String): TextureAtlas = js.native
  
  def getBounds(skeleton: Skeleton): js.Any = js.native
  
  def getVector2(x: Double, y: Double): Vector2 = js.native
  
  def getVector3(x: Double, y: Double, z: Double): Vector2 = js.native
  
  var gl: WebGLRenderingContext = js.native
  
  val isWebGL: Boolean = js.native
  
  var json: BaseCache = js.native
  
  def make(config: SpineGameObjectConfig): SpineGameObject = js.native
  def make(config: SpineGameObjectConfig, addToScene: Boolean): SpineGameObject = js.native
  
  def onResize(): Unit = js.native
  
  var plugin: Typeofspine = js.native
  
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  
  var sceneRenderer: SceneRenderer = js.native
  
  def setDebugBones(): SpinePlugin = js.native
  def setDebugBones(value: Boolean): SpinePlugin = js.native
  
  def setDebugBoundingBoxes(): SpinePlugin = js.native
  def setDebugBoundingBoxes(value: Boolean): SpinePlugin = js.native
  
  def setDebugClipping(): SpinePlugin = js.native
  def setDebugClipping(value: Boolean): SpinePlugin = js.native
  
  def setDebugMeshHull(): SpinePlugin = js.native
  def setDebugMeshHull(value: Boolean): SpinePlugin = js.native
  
  def setDebugMeshTriangles(): SpinePlugin = js.native
  def setDebugMeshTriangles(value: Boolean): SpinePlugin = js.native
  
  def setDebugPaths(): SpinePlugin = js.native
  def setDebugPaths(value: Boolean): SpinePlugin = js.native
  
  def setDebugRegionAttachments(): SpinePlugin = js.native
  def setDebugRegionAttachments(value: Boolean): SpinePlugin = js.native
  
  def setDebugSkeletonXY(): SpinePlugin = js.native
  def setDebugSkeletonXY(value: Boolean): SpinePlugin = js.native
  
  def setEffect(): SpinePlugin = js.native
  def setEffect(effect: VertexEffect): SpinePlugin = js.native
  
  var skeletonDebugRenderer: SkeletonDebugRenderer = js.native
  
  var skeletonRenderer: SkeletonRenderer | typingsSlinky.phaser.spine.webgl.SkeletonRenderer = js.native
  
  var spineTextures: BaseCache = js.native
  
  var textures: TextureManager = js.native
  
  def worldToLocal(x: Double, y: Double, skeleton: Skeleton): Vector2 = js.native
  def worldToLocal(x: Double, y: Double, skeleton: Skeleton, bone: Bone): Vector2 = js.native
}
