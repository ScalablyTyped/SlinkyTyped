package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to create a WebGL Program
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait GLProgram extends js.Object {
  /**
    * The shader program
    *
    * @member {WebGLProgram} PIXI.GLProgram#program
    */
  var program: WebGLProgram = js.native
  /**
    * holds the uniform data which contains uniform locations
    * and current uniform values used for caching and preventing unneeded GPU commands
    * @member {Object} PIXI.GLProgram#uniformData
    */
  var uniformData: js.Any = js.native
  /**
    * uniformGroups holds the various upload functions for the shader. Each uniform group
    * and program have a unique upload function generated.
    * @member {Object} PIXI.GLProgram#uniformGroups
    */
  var uniformGroups: js.Any = js.native
  /**
    * Destroys this program
    */
  def destroy(): Unit = js.native
}

object GLProgram {
  @scala.inline
  def apply(destroy: () => Unit, program: WebGLProgram, uniformData: js.Any, uniformGroups: js.Any): GLProgram = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), program = program.asInstanceOf[js.Any], uniformData = uniformData.asInstanceOf[js.Any], uniformGroups = uniformGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLProgram]
  }
  @scala.inline
  implicit class GLProgramOps[Self <: GLProgram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgram(value: WebGLProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformGroups(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

