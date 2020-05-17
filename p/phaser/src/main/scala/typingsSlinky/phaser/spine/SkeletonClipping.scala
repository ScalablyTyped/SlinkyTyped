package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonClipping extends js.Object {
  var clipAttachment: js.Any = js.native
  var clipOutput: js.Any = js.native
  var clippedTriangles: js.Array[Double] = js.native
  var clippedVertices: js.Array[Double] = js.native
  var clippingPolygon: js.Any = js.native
  var clippingPolygons: js.Any = js.native
  var scratch: js.Any = js.native
  var triangulator: js.Any = js.native
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
  def clipEnd(): Unit = js.native
  def clipEndWithSlot(slot: Slot): Unit = js.native
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
  def isClipping(): Boolean = js.native
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
  implicit class SkeletonClippingOps[Self <: SkeletonClipping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClip(
      value: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withClipAttachment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClipEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClipEndWithSlot(value: Slot => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipEndWithSlot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClipOutput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClipStart(value: (Slot, ClippingAttachment) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClipTriangles(
      value: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipTriangles")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withClippedTriangles(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippedTriangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClippedVertices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippedVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClippingPolygon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClippingPolygons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClipping(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClipping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScratch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scratch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangulator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangulator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

