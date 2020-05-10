package typingsSlinky.babylonjs.engineTransformFeedbackMod.babylonjsEnginesEngineAugmentingMod

import typingsSlinky.babylonjs.WebGLProgram
import typingsSlinky.babylonjs.dataBufferMod.DataBuffer
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.WebGLTransformFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  /**
    * Begins a transform feedback operation
    * @param usePoints defines if points or triangles must be used
    */
  def beginTransformFeedback(usePoints: Boolean): Unit = js.native
  /**
    * Bind a webGL transform feedback object to the webgl context
    * @param value defines the webGL transform feedback object to bind
    */
  def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
  /**
    * Bind a webGL buffer for a transform feedback operation
    * @param value defines the webGL buffer to bind
    */
  def bindTransformFeedbackBuffer(value: Nullable[DataBuffer]): Unit = js.native
  /**
    * Creates a webGL transform feedback object
    * Please makes sure to check webGLVersion property to check if you are running webGL 2+
    * @returns the webGL transform feedback object
    */
  def createTransformFeedback(): WebGLTransformFeedback = js.native
  /**
    * Delete a webGL transform feedback object
    * @param value defines the webGL transform feedback object to delete
    */
  def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
  /**
    * Ends a transform feedback operation
    */
  def endTransformFeedback(): Unit = js.native
  /**
    * Specify the varyings to use with transform feedback
    * @param program defines the associated webGL program
    * @param value defines the list of strings representing the varying names
    */
  def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
}

object Engine {
  @scala.inline
  def apply(
    beginTransformFeedback: Boolean => Unit,
    bindTransformFeedback: Nullable[WebGLTransformFeedback] => Unit,
    bindTransformFeedbackBuffer: Nullable[DataBuffer] => Unit,
    createTransformFeedback: () => WebGLTransformFeedback,
    deleteTransformFeedback: WebGLTransformFeedback => Unit,
    endTransformFeedback: () => Unit,
    setTranformFeedbackVaryings: (WebGLProgram, js.Array[String]) => Unit
  ): Engine = {
    val __obj = js.Dynamic.literal(beginTransformFeedback = js.Any.fromFunction1(beginTransformFeedback), bindTransformFeedback = js.Any.fromFunction1(bindTransformFeedback), bindTransformFeedbackBuffer = js.Any.fromFunction1(bindTransformFeedbackBuffer), createTransformFeedback = js.Any.fromFunction0(createTransformFeedback), deleteTransformFeedback = js.Any.fromFunction1(deleteTransformFeedback), endTransformFeedback = js.Any.fromFunction0(endTransformFeedback), setTranformFeedbackVaryings = js.Any.fromFunction2(setTranformFeedbackVaryings))
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginTransformFeedback(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginTransformFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBindTransformFeedback(value: Nullable[WebGLTransformFeedback] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindTransformFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBindTransformFeedbackBuffer(value: Nullable[DataBuffer] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindTransformFeedbackBuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateTransformFeedback(value: () => WebGLTransformFeedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTransformFeedback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteTransformFeedback(value: WebGLTransformFeedback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTransformFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndTransformFeedback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTransformFeedback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTranformFeedbackVaryings(value: (WebGLProgram, js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranformFeedbackVaryings")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

