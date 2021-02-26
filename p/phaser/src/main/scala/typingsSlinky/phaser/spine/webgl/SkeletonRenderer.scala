package typingsSlinky.phaser.spine.webgl

import typingsSlinky.phaser.spine.Skeleton
import typingsSlinky.phaser.spine.VertexEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkeletonRenderer extends StObject {
  
  var clipper: js.Any = js.native
  
  def draw(batcher: PolygonBatcher, skeleton: Skeleton): Unit = js.native
  def draw(
    batcher: PolygonBatcher,
    skeleton: Skeleton,
    slotRangeStart: js.UndefOr[scala.Nothing],
    slotRangeEnd: Double
  ): Unit = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Double): Unit = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Double, slotRangeEnd: Double): Unit = js.native
  
  var premultipliedAlpha: Boolean = js.native
  
  var renderable: js.Any = js.native
  
  var temp: js.Any = js.native
  
  var temp2: js.Any = js.native
  
  var temp3: js.Any = js.native
  
  var temp4: js.Any = js.native
  
  var tempColor: js.Any = js.native
  
  var tempColor2: js.Any = js.native
  
  var twoColorTint: js.Any = js.native
  
  var vertexEffect: VertexEffect = js.native
  
  var vertexSize: js.Any = js.native
  
  var vertices: js.Any = js.native
}
