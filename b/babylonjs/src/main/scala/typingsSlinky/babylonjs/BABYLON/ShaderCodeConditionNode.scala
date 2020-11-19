package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderCodeConditionNode extends ShaderCodeNode
object ShaderCodeConditionNode {
  
  @scala.inline
  def apply(
    children: js.Array[ShaderCodeNode],
    isValid: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    line: String,
    process: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String
  ): ShaderCodeConditionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isValid = js.Any.fromFunction1(isValid), line = line.asInstanceOf[js.Any], process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[ShaderCodeConditionNode]
  }
}
