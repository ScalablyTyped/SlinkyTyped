package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ShaderCodeInliner")
@js.native
class ShaderCodeInliner protected ()
  extends typingsSlinky.babylonjs.enginesIndexMod.ShaderCodeInliner {
  /**
    * Initializes the inliner
    * @param sourceCode shader code source to inline
    * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
    */
  def this(sourceCode: String) = this()
  def this(sourceCode: String, numMaxIterations: Double) = this()
}
/* static members */
@JSImport("babylonjs/index", "ShaderCodeInliner")
@js.native
object ShaderCodeInliner extends js.Object {
  
  val _RegexpFindFunctionNameAndType: js.Any = js.native
}
