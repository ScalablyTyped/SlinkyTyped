package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarHandle
  - typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationLinkedHandle
*/
trait NormalizationHandle extends NormalizationSelection

object NormalizationHandle {
  @scala.inline
  def NormalizationScalarHandle(handle: String, key: String, kind: String, name: String): NormalizationHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationHandle]
  }
  @scala.inline
  def NormalizationLinkedHandle(handle: String, key: String, kind: String, name: String): NormalizationHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationHandle]
  }
}

