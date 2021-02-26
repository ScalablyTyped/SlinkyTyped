package typingsSlinky.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLiteral
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationVariable
*/
trait NormalizationArgument extends StObject
object NormalizationArgument {
  
  @scala.inline
  def NormalizationLiteral(kind: String, name: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLiteral = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLiteral]
  }
  
  @scala.inline
  def NormalizationVariable(kind: String, name: String, variableName: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationVariable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationVariable]
  }
}
