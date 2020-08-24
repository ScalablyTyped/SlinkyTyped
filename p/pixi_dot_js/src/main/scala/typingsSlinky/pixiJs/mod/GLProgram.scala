package typingsSlinky.pixiJs.mod

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
@JSImport("pixi.js", "GLProgram")
@js.native
class GLProgram protected ()
  extends typingsSlinky.pixiJs.PIXI.GLProgram {
  def this(program: WebGLProgram, uniformData: js.Any) = this()
}

