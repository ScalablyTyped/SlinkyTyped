package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ShaderCodeInliner")
@js.native
class ShaderCodeInliner protected ()
  extends typingsSlinky.babylonjs.legacyMod.ShaderCodeInliner {
  /**
    * Initializes the inliner
    * @param sourceCode shader code source to inline
    * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
    */
  def this(sourceCode: String) = this()
  def this(sourceCode: String, numMaxIterations: Double) = this()
}
/* static members */
object ShaderCodeInliner {
  
  @JSImport("babylonjs", "ShaderCodeInliner._RegexpFindFunctionNameAndType")
  @js.native
  val _RegexpFindFunctionNameAndType: js.Any = js.native
}
