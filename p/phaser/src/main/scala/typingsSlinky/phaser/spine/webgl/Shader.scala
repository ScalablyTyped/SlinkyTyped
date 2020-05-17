package typingsSlinky.phaser.spine.webgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.phaser.spine.ArrayLike
import typingsSlinky.phaser.spine.Disposable
import typingsSlinky.phaser.spine.Restorable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader
  extends Disposable
     with Restorable {
  var compile: js.Any = js.native
  var compileProgram: js.Any = js.native
  var compileShader: js.Any = js.native
  var context: js.Any = js.native
  var fragmentShader: js.Any = js.native
  var fs: js.Any = js.native
  var fsSource: js.Any = js.native
  var program: js.Any = js.native
  var tmp2x2: js.Any = js.native
  var tmp3x3: js.Any = js.native
  var tmp4x4: js.Any = js.native
  var vertexShader: js.Any = js.native
  var vs: js.Any = js.native
  var vsSource: js.Any = js.native
  def bind(): Unit = js.native
  def getAttributeLocation(attribute: String): Double = js.native
  def getFragmentShader(): String = js.native
  def getFragmentSource(): String = js.native
  def getProgram(): WebGLProgram = js.native
  def getUniformLocation(uniform: String): WebGLUniformLocation = js.native
  def getVertexShader(): String = js.native
  def getVertexShaderSource(): String = js.native
  def setUniform2f(uniform: String, value: Double, value2: Double): Unit = js.native
  def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit = js.native
  def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit = js.native
  def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  def setUniformf(uniform: String, value: Double): Unit = js.native
  def setUniformi(uniform: String, value: Double): Unit = js.native
  def unbind(): Unit = js.native
}

object Shader {
  @scala.inline
  def apply(
    bind: () => Unit,
    compile: js.Any,
    compileProgram: js.Any,
    compileShader: js.Any,
    context: js.Any,
    dispose: () => Unit,
    fragmentShader: js.Any,
    fs: js.Any,
    fsSource: js.Any,
    getAttributeLocation: String => Double,
    getFragmentShader: () => String,
    getFragmentSource: () => String,
    getProgram: () => WebGLProgram,
    getUniformLocation: String => WebGLUniformLocation,
    getVertexShader: () => String,
    getVertexShaderSource: () => String,
    program: js.Any,
    restore: () => Unit,
    setUniform2f: (String, Double, Double) => Unit,
    setUniform2x2f: (String, ArrayLike[Double]) => Unit,
    setUniform3f: (String, Double, Double, Double) => Unit,
    setUniform3x3f: (String, ArrayLike[Double]) => Unit,
    setUniform4f: (String, Double, Double, Double, Double) => Unit,
    setUniform4x4f: (String, ArrayLike[Double]) => Unit,
    setUniformf: (String, Double) => Unit,
    setUniformi: (String, Double) => Unit,
    tmp2x2: js.Any,
    tmp3x3: js.Any,
    tmp4x4: js.Any,
    unbind: () => Unit,
    vertexShader: js.Any,
    vs: js.Any,
    vsSource: js.Any
  ): Shader = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), compile = compile.asInstanceOf[js.Any], compileProgram = compileProgram.asInstanceOf[js.Any], compileShader = compileShader.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fragmentShader = fragmentShader.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], fsSource = fsSource.asInstanceOf[js.Any], getAttributeLocation = js.Any.fromFunction1(getAttributeLocation), getFragmentShader = js.Any.fromFunction0(getFragmentShader), getFragmentSource = js.Any.fromFunction0(getFragmentSource), getProgram = js.Any.fromFunction0(getProgram), getUniformLocation = js.Any.fromFunction1(getUniformLocation), getVertexShader = js.Any.fromFunction0(getVertexShader), getVertexShaderSource = js.Any.fromFunction0(getVertexShaderSource), program = program.asInstanceOf[js.Any], restore = js.Any.fromFunction0(restore), setUniform2f = js.Any.fromFunction3(setUniform2f), setUniform2x2f = js.Any.fromFunction2(setUniform2x2f), setUniform3f = js.Any.fromFunction4(setUniform3f), setUniform3x3f = js.Any.fromFunction2(setUniform3x3f), setUniform4f = js.Any.fromFunction5(setUniform4f), setUniform4x4f = js.Any.fromFunction2(setUniform4x4f), setUniformf = js.Any.fromFunction2(setUniformf), setUniformi = js.Any.fromFunction2(setUniformi), tmp2x2 = tmp2x2.asInstanceOf[js.Any], tmp3x3 = tmp3x3.asInstanceOf[js.Any], tmp4x4 = tmp4x4.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind), vertexShader = vertexShader.asInstanceOf[js.Any], vs = vs.asInstanceOf[js.Any], vsSource = vsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shader]
  }
  @scala.inline
  implicit class ShaderOps[Self <: Shader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompileProgram(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileProgram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompileShader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentShader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAttributeLocation(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFragmentShader(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFragmentShader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFragmentSource(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFragmentSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProgram(value: () => WebGLProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProgram")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUniformLocation(value: String => WebGLUniformLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniformLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVertexShader(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVertexShader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVertexShaderSource(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVertexShaderSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgram(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetUniform2f(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniform2f")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetUniform2x2f(value: (String, ArrayLike[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniform2x2f")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetUniform3f(value: (String, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniform3f")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetUniform3x3f(value: (String, ArrayLike[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniform3x3f")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetUniform4f(value: (String, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniform4f")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetUniform4x4f(value: (String, ArrayLike[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniform4x4f")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetUniformf(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniformf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetUniformi(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUniformi")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTmp2x2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp2x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmp3x3(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp3x3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmp4x4(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp4x4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnbind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVertexShader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

