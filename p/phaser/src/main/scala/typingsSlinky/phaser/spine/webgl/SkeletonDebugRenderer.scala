package typingsSlinky.phaser.spine.webgl

import typingsSlinky.phaser.spine.Color
import typingsSlinky.phaser.spine.Disposable
import typingsSlinky.phaser.spine.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkeletonDebugRenderer extends Disposable {
  
  var aabbColor: Color = js.native
  
  var attachmentLineColor: Color = js.native
  
  var boneLineColor: Color = js.native
  
  var boneOriginColor: Color = js.native
  
  var boneWidth: Double = js.native
  
  var bounds: js.Any = js.native
  
  var clipColor: Color = js.native
  
  var context: js.Any = js.native
  
  def draw(shapes: ShapeRenderer, skeleton: Skeleton): Unit = js.native
  def draw(shapes: ShapeRenderer, skeleton: Skeleton, ignoredBones: js.Array[String]): Unit = js.native
  
  var drawBones: Boolean = js.native
  
  var drawBoundingBoxes: Boolean = js.native
  
  var drawClipping: Boolean = js.native
  
  var drawMeshHull: Boolean = js.native
  
  var drawMeshTriangles: Boolean = js.native
  
  var drawPaths: Boolean = js.native
  
  var drawRegionAttachments: Boolean = js.native
  
  var drawSkeletonXY: Boolean = js.native
  
  var pathColor: Color = js.native
  
  var premultipliedAlpha: Boolean = js.native
  
  var scale: Double = js.native
  
  var temp: js.Any = js.native
  
  var triangleLineColor: Color = js.native
  
  var vertices: js.Any = js.native
}
