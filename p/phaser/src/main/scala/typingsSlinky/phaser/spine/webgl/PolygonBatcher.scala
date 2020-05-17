package typingsSlinky.phaser.spine.webgl

import typingsSlinky.phaser.spine.ArrayLike
import typingsSlinky.phaser.spine.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonBatcher extends Disposable {
  var context: js.Any = js.native
  var drawCalls: js.Any = js.native
  var dstBlend: js.Any = js.native
  var flush: js.Any = js.native
  var indicesLength: js.Any = js.native
  var isDrawing: js.Any = js.native
  var lastTexture: js.Any = js.native
  var mesh: js.Any = js.native
  var shader: js.Any = js.native
  var srcBlend: js.Any = js.native
  var verticesLength: js.Any = js.native
  def begin(shader: Shader): Unit = js.native
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit = js.native
  def end(): Unit = js.native
  def getDrawCalls(): Double = js.native
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
}

object PolygonBatcher {
  @scala.inline
  def apply(
    begin: Shader => Unit,
    context: js.Any,
    dispose: () => Unit,
    draw: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit,
    drawCalls: js.Any,
    dstBlend: js.Any,
    end: () => Unit,
    flush: js.Any,
    getDrawCalls: () => Double,
    indicesLength: js.Any,
    isDrawing: js.Any,
    lastTexture: js.Any,
    mesh: js.Any,
    setBlendMode: (Double, Double) => Unit,
    shader: js.Any,
    srcBlend: js.Any,
    verticesLength: js.Any
  ): PolygonBatcher = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), context = context.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction3(draw), drawCalls = drawCalls.asInstanceOf[js.Any], dstBlend = dstBlend.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), flush = flush.asInstanceOf[js.Any], getDrawCalls = js.Any.fromFunction0(getDrawCalls), indicesLength = indicesLength.asInstanceOf[js.Any], isDrawing = isDrawing.asInstanceOf[js.Any], lastTexture = lastTexture.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], setBlendMode = js.Any.fromFunction2(setBlendMode), shader = shader.asInstanceOf[js.Any], srcBlend = srcBlend.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonBatcher]
  }
  @scala.inline
  implicit class PolygonBatcherOps[Self <: PolygonBatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: Shader => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraw(value: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDrawCalls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDstBlend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstBlend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDrawCalls(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDrawCalls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndicesLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDrawing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTexture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBlendMode(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBlendMode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcBlend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcBlend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticesLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticesLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

