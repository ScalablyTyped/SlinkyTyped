package typingsSlinky.node.dnsMod

import typingsSlinky.node.nodeStrings.A
import typingsSlinky.node.nodeStrings.AAAA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Use `AnyARecord` or `AnyAaaaRecord` instead. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.dnsMod.AnyARecord
  - typingsSlinky.node.dnsMod.AnyAaaaRecord
*/
trait AnyRecordWithTtl extends js.Object
object AnyRecordWithTtl {
  
  @scala.inline
  def AnyARecord(address: String, ttl: Double, `type`: A): AnyRecordWithTtl = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecordWithTtl]
  }
  
  @scala.inline
  def AnyAaaaRecord(address: String, ttl: Double, `type`: AAAA): AnyRecordWithTtl = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecordWithTtl]
  }
}
