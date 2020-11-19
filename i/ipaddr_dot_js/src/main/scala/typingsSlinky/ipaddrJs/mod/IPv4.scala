package typingsSlinky.ipaddrJs.mod

import typingsSlinky.ipaddrJs.ipaddrJsStrings.ipv4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipaddr.js", "IPv4")
@js.native
class IPv4 protected () extends IP {
  def this(octets: js.Array[Double]) = this()
  
  def kind(): ipv4 = js.native
  
  def `match`(addr: IPv4, bits: Double): Boolean = js.native
  def `match`(mask: js.Tuple2[IPv4, Double]): Boolean = js.native
  
  var octets: js.Array[Double] = js.native
  
  def range(): IPv4Range = js.native
  
  def subnetMatch(rangeList: RangeList[IPv4]): String = js.native
  def subnetMatch(rangeList: RangeList[IPv4], defaultName: String): String = js.native
  
  def toIPv4MappedAddress(): IPv6 = js.native
}
/* static members */
@JSImport("ipaddr.js", "IPv4")
@js.native
object IPv4 extends js.Object {
  
  def broadcastAddressFromCIDR(addr: String): IPv4 = js.native
  
  def isIPv4(addr: String): Boolean = js.native
  
  def isValid(addr: String): Boolean = js.native
  
  def isValidFourPartDecimal(addr: String): Boolean = js.native
  
  def networkAddressFromCIDR(addr: String): IPv4 = js.native
  
  def parse(addr: String): IPv4 = js.native
  
  def parseCIDR(addr: String): js.Tuple2[IPv4, Double] = js.native
  
  def subnetMaskFromPrefixLength(prefix: Double): IPv4 = js.native
}
