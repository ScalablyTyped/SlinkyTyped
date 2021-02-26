package typingsSlinky.node.dnsMod

import typingsSlinky.node.nodeStrings.A
import typingsSlinky.node.nodeStrings.AAAA
import typingsSlinky.node.nodeStrings.CNAME
import typingsSlinky.node.nodeStrings.MX
import typingsSlinky.node.nodeStrings.NAPTR
import typingsSlinky.node.nodeStrings.NS
import typingsSlinky.node.nodeStrings.PTR
import typingsSlinky.node.nodeStrings.SOA
import typingsSlinky.node.nodeStrings.SRV
import typingsSlinky.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.dnsMod.AnyARecord
  - typingsSlinky.node.dnsMod.AnyAaaaRecord
  - typingsSlinky.node.dnsMod.AnyCnameRecord
  - typingsSlinky.node.dnsMod.AnyMxRecord
  - typingsSlinky.node.dnsMod.AnyNaptrRecord
  - typingsSlinky.node.dnsMod.AnyNsRecord
  - typingsSlinky.node.dnsMod.AnyPtrRecord
  - typingsSlinky.node.dnsMod.AnySoaRecord
  - typingsSlinky.node.dnsMod.AnySrvRecord
  - typingsSlinky.node.dnsMod.AnyTxtRecord
*/
trait AnyRecord extends StObject
object AnyRecord {
  
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
  
  @scala.inline
  def AnyCnameRecord(`type`: CNAME, value: String): typingsSlinky.node.dnsMod.AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyCnameRecord]
  }
  
  @scala.inline
  def AnyMxRecord(exchange: String, priority: Double, `type`: MX): typingsSlinky.node.dnsMod.AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyMxRecord]
  }
  
  @scala.inline
  def AnyNaptrRecord(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String,
    `type`: NAPTR
  ): typingsSlinky.node.dnsMod.AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyNaptrRecord]
  }
  
  @scala.inline
  def AnyNsRecord(`type`: NS, value: String): typingsSlinky.node.dnsMod.AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyNsRecord]
  }
  
  @scala.inline
  def AnyPtrRecord(`type`: PTR, value: String): typingsSlinky.node.dnsMod.AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyPtrRecord]
  }
  
  @scala.inline
  def AnySoaRecord(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double,
    `type`: SOA
  ): typingsSlinky.node.dnsMod.AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnySoaRecord]
  }
  
  @scala.inline
  def AnySrvRecord(name: String, port: Double, priority: Double, `type`: SRV, weight: Double): typingsSlinky.node.dnsMod.AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnySrvRecord]
  }
  
  @scala.inline
  def AnyTxtRecord(entries: js.Array[String], `type`: TXT): typingsSlinky.node.dnsMod.AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.node.dnsMod.AnyTxtRecord]
  }
}
