package typingsSlinky.rotJs.tileGlMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.rotJs.backendMod.Backend
import typingsSlinky.rotJs.typesMod.DisplayData
import typingsSlinky.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileGL extends Backend {
  var _gl: WebGLRenderingContext = js.native
  var _program: WebGLProgram = js.native
  var _uniforms: StringDictionary[WebGLUniformLocation | Null] = js.native
  def _initWebGL(): WebGLRenderingContext = js.native
  def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  def _updateSize(): Unit = js.native
  def _updateTexture(tileSet: HTMLImageElement): Unit = js.native
  def computeFontSize(): Double = js.native
}

object TileGL {
  @scala.inline
  def apply(
    _gl: WebGLRenderingContext,
    _initWebGL: () => WebGLRenderingContext,
    _normalizedEventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    _options: DisplayOptions,
    _program: WebGLProgram,
    _uniforms: StringDictionary[WebGLUniformLocation | Null],
    _updateSize: () => Unit,
    _updateTexture: HTMLImageElement => Unit,
    clear: () => Unit,
    computeFontSize: () => Double,
    computeSize: (Double, Double) => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): TileGL = {
    val __obj = js.Dynamic.literal(_gl = _gl.asInstanceOf[js.Any], _initWebGL = js.Any.fromFunction0(_initWebGL), _normalizedEventToPosition = js.Any.fromFunction2(_normalizedEventToPosition), _options = _options.asInstanceOf[js.Any], _program = _program.asInstanceOf[js.Any], _uniforms = _uniforms.asInstanceOf[js.Any], _updateSize = js.Any.fromFunction0(_updateSize), _updateTexture = js.Any.fromFunction1(_updateTexture), clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction0(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[TileGL]
  }
  @scala.inline
  implicit class TileGLOps[Self <: TileGL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_gl(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_initWebGL(value: () => WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initWebGL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_normalizedEventToPosition(value: (Double, Double) => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_normalizedEventToPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_program(value: WebGLProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uniforms(value: StringDictionary[WebGLUniformLocation | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_updateSize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_updateSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_updateTexture(value: HTMLImageElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_updateTexture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComputeFontSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeFontSize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

