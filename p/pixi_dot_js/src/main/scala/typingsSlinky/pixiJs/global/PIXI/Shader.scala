package typingsSlinky.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A helper class for shaders
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Shader")
@js.native
class Shader ()
  extends typingsSlinky.pixiJs.PIXI.Shader {
  def this(program: typingsSlinky.pixiJs.PIXI.Program) = this()
  def this(program: js.UndefOr[scala.Nothing], uniforms: js.Any) = this()
  def this(program: typingsSlinky.pixiJs.PIXI.Program, uniforms: js.Any) = this()
}
/* static members */
@JSGlobal("PIXI.Shader")
@js.native
object Shader extends js.Object {
  
  /**
    * A short hand function to create a shader based of a vertex and fragment shader
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    * @param {object} [uniforms] - Custom uniforms to use to augment the built-in ones.
    *
    * @returns {PIXI.Shader} an shiny new Pixi shader!
    */
  def from(): typingsSlinky.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: js.UndefOr[scala.Nothing], uniforms: js.Any): typingsSlinky.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String): typingsSlinky.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String, uniforms: js.Any): typingsSlinky.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: String): typingsSlinky.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: String, fragmentSrc: js.UndefOr[scala.Nothing], uniforms: js.Any): typingsSlinky.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: String, fragmentSrc: String): typingsSlinky.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: String, fragmentSrc: String, uniforms: js.Any): typingsSlinky.pixiJs.PIXI.Shader = js.native
}
