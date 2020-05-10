package typingsSlinky.babylonjs.ipipelinecontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPipelineContext extends js.Object {
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  var isAsync: Boolean = js.native
  /**
    * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
    */
  var isReady: Boolean = js.native
  /** @hidden */
  def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ js.Any, Unit]): Unit = js.native
}

object IPipelineContext {
  @scala.inline
  def apply(
    _handlesSpectorRebuildCallback: js.Function1[/* compiledObject */ js.Any, Unit] => Unit,
    isAsync: Boolean,
    isReady: Boolean
  ): IPipelineContext = {
    val __obj = js.Dynamic.literal(_handlesSpectorRebuildCallback = js.Any.fromFunction1(_handlesSpectorRebuildCallback), isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPipelineContext]
  }
  @scala.inline
  implicit class IPipelineContextOps[Self <: IPipelineContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_handlesSpectorRebuildCallback(value: js.Function1[/* compiledObject */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_handlesSpectorRebuildCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

