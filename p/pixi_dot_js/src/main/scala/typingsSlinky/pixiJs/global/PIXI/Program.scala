package typingsSlinky.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class to create a shader program.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Program")
@js.native
class Program ()
  extends typingsSlinky.pixiJs.PIXI.Program {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: js.UndefOr[scala.Nothing], name: String) = this()
  def this(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String, name: String) = this()
  def this(vertexSrc: String, fragmentSrc: js.UndefOr[scala.Nothing], name: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: String) = this()
}
/* static members */
@JSGlobal("PIXI.Program")
@js.native
object Program extends js.Object {
  
  /**
    * The default fragment shader source
    *
    * @static
    * @constant
    * @member {string}
    */
  var defaultFragmentSrc: String = js.native
  
  /**
    * The default vertex shader source
    *
    * @static
    * @constant
    * @member {string}
    */
  var defaultVertexSrc: String = js.native
  
  /**
    * A short hand function to create a program based of a vertex and fragment shader
    * this method will also check to see if there is a cached program.
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    * @param {string} [name=pixi-shader] - Name for shader
    *
    * @returns {PIXI.Program} an shiny new Pixi shader!
    */
  def from(): typingsSlinky.pixiJs.PIXI.Program = js.native
  def from(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: js.UndefOr[scala.Nothing], name: String): typingsSlinky.pixiJs.PIXI.Program = js.native
  def from(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String): typingsSlinky.pixiJs.PIXI.Program = js.native
  def from(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String, name: String): typingsSlinky.pixiJs.PIXI.Program = js.native
  def from(vertexSrc: String): typingsSlinky.pixiJs.PIXI.Program = js.native
  def from(vertexSrc: String, fragmentSrc: js.UndefOr[scala.Nothing], name: String): typingsSlinky.pixiJs.PIXI.Program = js.native
  def from(vertexSrc: String, fragmentSrc: String): typingsSlinky.pixiJs.PIXI.Program = js.native
  def from(vertexSrc: String, fragmentSrc: String, name: String): typingsSlinky.pixiJs.PIXI.Program = js.native
}
