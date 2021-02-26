package typingsSlinky.node.dnsMod

import typingsSlinky.node.nodeStrings.A
import typingsSlinky.node.nodeStrings.AAAA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Use `AnyARecord` or `AnyAaaaRecord` instead. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.dnsMod.AnyARecord
  - typingsSlinky.node.dnsMod.AnyAaaaRecord
*/
trait AnyRecordWithTtl extends StObject
object AnyRecordWithTtl {
  
  @scala.inline
  def AnyARecord(address: String, ttl: Double, `type`: A): typingsSlinky.node.dnsMod.AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyARecord]
  }
  
  @scala.inline
  def AnyAaaaRecord(address: String, ttl: Double, `type`: AAAA): typingsSlinky.node.dnsMod.AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyAaaaRecord]
  }
}
