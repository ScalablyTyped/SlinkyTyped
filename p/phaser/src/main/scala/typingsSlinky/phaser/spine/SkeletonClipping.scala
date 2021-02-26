package typingsSlinky.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkeletonClipping extends StObject {
  
  def clip(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    clippingArea: js.Array[Double],
    output: js.Array[Double]
  ): Boolean = js.native
  
  var clipAttachment: js.Any = js.native
  
  def clipEnd(): Unit = js.native
  
  def clipEndWithSlot(slot: Slot): Unit = js.native
  
  var clipOutput: js.Any = js.native
  
  def clipStart(slot: Slot, clip: ClippingAttachment): Double = js.native
  
  def clipTriangles(
    vertices: ArrayLike[Double],
    verticesLength: Double,
    triangles: ArrayLike[Double],
    trianglesLength: Double,
    uvs: ArrayLike[Double],
    light: Color,
    dark: Color,
    twoColor: Boolean
  ): Unit = js.native
  
  var clippedTriangles: js.Array[Double] = js.native
  
  var clippedVertices: js.Array[Double] = js.native
  
  var clippingPolygon: js.Any = js.native
  
  var clippingPolygons: js.Any = js.native
  
  def isClipping(): Boolean = js.native
  
  var scratch: js.Any = js.native
  
  var triangulator: js.Any = js.native
}
object SkeletonClipping {
  
  @scala.inline
  def apply(
    clip: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean,
    clipAttachment: js.Any,
    clipEnd: () => Unit,
    clipEndWithSlot: Slot => Unit,
    clipOutput: js.Any,
    clipStart: (Slot, ClippingAttachment) => Double,
    clipTriangles: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Unit,
    clippedTriangles: js.Array[Double],
    clippedVertices: js.Array[Double],
    clippingPolygon: js.Any,
    clippingPolygons: js.Any,
    isClipping: () => Boolean,
    scratch: js.Any,
    triangulator: js.Any
  ): SkeletonClipping = {
    val __obj = js.Dynamic.literal(clip = js.Any.fromFunction8(clip), clipAttachment = clipAttachment.asInstanceOf[js.Any], clipEnd = js.Any.fromFunction0(clipEnd), clipEndWithSlot = js.Any.fromFunction1(clipEndWithSlot), clipOutput = clipOutput.asInstanceOf[js.Any], clipStart = js.Any.fromFunction2(clipStart), clipTriangles = js.Any.fromFunction8(clipTriangles), clippedTriangles = clippedTriangles.asInstanceOf[js.Any], clippedVertices = clippedVertices.asInstanceOf[js.Any], clippingPolygon = clippingPolygon.asInstanceOf[js.Any], clippingPolygons = clippingPolygons.asInstanceOf[js.Any], isClipping = js.Any.fromFunction0(isClipping), scratch = scratch.asInstanceOf[js.Any], triangulator = triangulator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonClipping]
  }
  
  @scala.inline
  implicit class SkeletonClippingMutableBuilder[Self <: SkeletonClipping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(
      value: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean
    ): Self = StObject.set(x, "clip", js.Any.fromFunction8(value))
    
    @scala.inline
    def setClipAttachment(value: js.Any): Self = StObject.set(x, "clipAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipEnd(value: () => Unit): Self = StObject.set(x, "clipEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClipEndWithSlot(value: Slot => Unit): Self = StObject.set(x, "clipEndWithSlot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClipOutput(value: js.Any): Self = StObject.set(x, "clipOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipStart(value: (Slot, ClippingAttachment) => Double): Self = StObject.set(x, "clipStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClipTriangles(
      value: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Unit
    ): Self = StObject.set(x, "clipTriangles", js.Any.fromFunction8(value))
    
    @scala.inline
    def setClippedTriangles(value: js.Array[Double]): Self = StObject.set(x, "clippedTriangles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippedTrianglesVarargs(value: Double*): Self = StObject.set(x, "clippedTriangles", js.Array(value :_*))
    
    @scala.inline
    def setClippedVertices(value: js.Array[Double]): Self = StObject.set(x, "clippedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippedVerticesVarargs(value: Double*): Self = StObject.set(x, "clippedVertices", js.Array(value :_*))
    
    @scala.inline
    def setClippingPolygon(value: js.Any): Self = StObject.set(x, "clippingPolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingPolygons(value: js.Any): Self = StObject.set(x, "clippingPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClipping(value: () => Boolean): Self = StObject.set(x, "isClipping", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScratch(value: js.Any): Self = StObject.set(x, "scratch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangulator(value: js.Any): Self = StObject.set(x, "triangulator", value.asInstanceOf[js.Any])
  }
}
