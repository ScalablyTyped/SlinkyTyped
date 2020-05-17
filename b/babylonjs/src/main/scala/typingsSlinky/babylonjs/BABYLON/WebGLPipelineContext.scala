package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.WebGLShader
import typingsSlinky.babylonjs.WebGLProgram
import typingsSlinky.babylonjs.WebGLRenderingContext
import typingsSlinky.std.WebGLTransformFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLPipelineContext extends IPipelineContext {
  var context: js.UndefOr[WebGLRenderingContext] = js.native
  var engine: ThinEngine = js.native
  var fragmentCompilationError: Nullable[String] = js.native
  var fragmentShader: js.UndefOr[WebGLShader] = js.native
  var isParallelCompiled: Boolean = js.native
  var onCompiled: js.UndefOr[js.Function0[Unit]] = js.native
  var program: Nullable[WebGLProgram] = js.native
  var programLinkError: Nullable[String] = js.native
  var programValidationError: Nullable[String] = js.native
  var transformFeedback: js.UndefOr[WebGLTransformFeedback | Null] = js.native
  var vertexCompilationError: Nullable[String] = js.native
  var vertexShader: js.UndefOr[WebGLShader] = js.native
  @JSName("isAsync")
  def isAsync_MWebGLPipelineContext: Boolean = js.native
  @JSName("isReady")
  def isReady_MWebGLPipelineContext: Boolean = js.native
}

object WebGLPipelineContext {
  @scala.inline
  def apply(
    _handlesSpectorRebuildCallback: js.Function1[/* compiledObject */ js.Any, Unit] => Unit,
    engine: ThinEngine,
    isAsync: () => Boolean,
    isParallelCompiled: Boolean,
    isReady: () => Boolean
  ): WebGLPipelineContext = {
    val __obj = js.Dynamic.literal(_handlesSpectorRebuildCallback = js.Any.fromFunction1(_handlesSpectorRebuildCallback), engine = engine.asInstanceOf[js.Any], isAsync = js.Any.fromFunction0(isAsync), isParallelCompiled = isParallelCompiled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady))
    __obj.asInstanceOf[WebGLPipelineContext]
  }
  @scala.inline
  implicit class WebGLPipelineContextOps[Self <: WebGLPipelineContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngine(value: ThinEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAsync(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsParallelCompiled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isParallelCompiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContext(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentCompilationError(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentCompilationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentCompilationErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentCompilationError")(null)
        ret
    }
    @scala.inline
    def withFragmentShader(value: WebGLShader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompiled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompiled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCompiled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompiled")(js.undefined)
        ret
    }
    @scala.inline
    def withProgram(value: Nullable[WebGLProgram]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgramNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(null)
        ret
    }
    @scala.inline
    def withProgramLinkError(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programLinkError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgramLinkErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programLinkError")(null)
        ret
    }
    @scala.inline
    def withProgramValidationError(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programValidationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgramValidationErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programValidationError")(null)
        ret
    }
    @scala.inline
    def withTransformFeedback(value: WebGLTransformFeedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFeedback")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformFeedbackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFeedback")(null)
        ret
    }
    @scala.inline
    def withVertexCompilationError(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCompilationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexCompilationErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCompilationError")(null)
        ret
    }
    @scala.inline
    def withVertexShader(value: WebGLShader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(js.undefined)
        ret
    }
  }
  
}

