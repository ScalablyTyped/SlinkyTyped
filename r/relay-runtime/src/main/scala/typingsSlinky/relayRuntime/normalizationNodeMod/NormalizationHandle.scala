package typingsSlinky.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarHandle
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle
*/
trait NormalizationHandle extends NormalizationSelection
object NormalizationHandle {
  
  @scala.inline
  def NormalizationLinkedHandle(handle: String, key: String, kind: String, name: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle]
  }
  
  @scala.inline
  def NormalizationScalarHandle(handle: String, key: String, kind: String, name: String): typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarHandle]
  }
}
