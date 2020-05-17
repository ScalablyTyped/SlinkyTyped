package typingsSlinky.phaser.spine.canvas

import typingsSlinky.phaser.spine.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonRenderer extends js.Object {
  var computeMeshVertices: js.Any = js.native
  var computeRegionVertices: js.Any = js.native
  var ctx: js.Any = js.native
  var debugRendering: Boolean = js.native
  var drawImages: js.Any = js.native
  var drawTriangle: js.Any = js.native
  var drawTriangles: js.Any = js.native
  var tempColor: js.Any = js.native
  var triangleRendering: Boolean = js.native
  var vertices: js.Any = js.native
  def draw(skeleton: Skeleton): Unit = js.native
}

object SkeletonRenderer {
  @scala.inline
  def apply(
    computeMeshVertices: js.Any,
    computeRegionVertices: js.Any,
    ctx: js.Any,
    debugRendering: Boolean,
    draw: Skeleton => Unit,
    drawImages: js.Any,
    drawTriangle: js.Any,
    drawTriangles: js.Any,
    tempColor: js.Any,
    triangleRendering: Boolean,
    vertices: js.Any
  ): SkeletonRenderer = {
    val __obj = js.Dynamic.literal(computeMeshVertices = computeMeshVertices.asInstanceOf[js.Any], computeRegionVertices = computeRegionVertices.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], debugRendering = debugRendering.asInstanceOf[js.Any], draw = js.Any.fromFunction1(draw), drawImages = drawImages.asInstanceOf[js.Any], drawTriangle = drawTriangle.asInstanceOf[js.Any], drawTriangles = drawTriangles.asInstanceOf[js.Any], tempColor = tempColor.asInstanceOf[js.Any], triangleRendering = triangleRendering.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonRenderer]
  }
  @scala.inline
  implicit class SkeletonRendererOps[Self <: SkeletonRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeMeshVertices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeMeshVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeRegionVertices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeRegionVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraw(value: Skeleton => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawImages(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawTriangle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTriangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawTriangles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTriangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangleRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

