package typingsSlinky.ipaddrJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ipaddrJs.ipaddrJsStrings.ipv4
import typingsSlinky.ipaddrJs.ipaddrJsStrings.ipv6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  object IPv4 {
    
    @JSImport("ipaddr.js", "IPv4.broadcastAddressFromCIDR")
    @js.native
    def broadcastAddressFromCIDR(addr: String): IPv4 = js.native
    
    @JSImport("ipaddr.js", "IPv4.isIPv4")
    @js.native
    def isIPv4(addr: String): Boolean = js.native
    
    @JSImport("ipaddr.js", "IPv4.isValid")
    @js.native
    def isValid(addr: String): Boolean = js.native
    
    @JSImport("ipaddr.js", "IPv4.isValidFourPartDecimal")
    @js.native
    def isValidFourPartDecimal(addr: String): Boolean = js.native
    
    @JSImport("ipaddr.js", "IPv4.networkAddressFromCIDR")
    @js.native
    def networkAddressFromCIDR(addr: String): IPv4 = js.native
    
    @JSImport("ipaddr.js", "IPv4.parse")
    @js.native
    def parse(addr: String): IPv4 = js.native
    
    @JSImport("ipaddr.js", "IPv4.parseCIDR")
    @js.native
    def parseCIDR(addr: String): js.Tuple2[IPv4, Double] = js.native
    
    @JSImport("ipaddr.js", "IPv4.subnetMaskFromPrefixLength")
    @js.native
    def subnetMaskFromPrefixLength(prefix: Double): IPv4 = js.native
  }
  
  @JSImport("ipaddr.js", "IPv6")
  @js.native
  class IPv6 protected () extends IP {
    def this(parts: js.Array[Double]) = this()
    
    def isIPv4MappedAddress(): Boolean = js.native
    
    def kind(): ipv6 = js.native
    
    def `match`(addr: IPv6, bits: Double): Boolean = js.native
    def `match`(mask: js.Tuple2[IPv6, Double]): Boolean = js.native
    
    var parts: js.Array[Double] = js.native
    
    def range(): IPv6Range = js.native
    
    def subnetMatch(rangeList: RangeList[IPv6]): String = js.native
    def subnetMatch(rangeList: RangeList[IPv6], defaultName: String): String = js.native
    
    def toIPv4Address(): IPv4 = js.native
    
    var zoneId: js.UndefOr[String] = js.native
  }
  /* static members */
  object IPv6 {
    
    @JSImport("ipaddr.js", "IPv6.broadcastAddressFromCIDR")
    @js.native
    def broadcastAddressFromCIDR(addr: String): IPv6 = js.native
    
    @JSImport("ipaddr.js", "IPv6.isIPv6")
    @js.native
    def isIPv6(addr: String): Boolean = js.native
    
    @JSImport("ipaddr.js", "IPv6.isValid")
    @js.native
    def isValid(addr: String): Boolean = js.native
    
    @JSImport("ipaddr.js", "IPv6.parse")
    @js.native
    def parse(addr: String): IPv6 = js.native
    
    @JSImport("ipaddr.js", "IPv6.parseCIDR")
    @js.native
    def parseCIDR(addr: String): js.Tuple2[IPv6, Double] = js.native
    
    @JSImport("ipaddr.js", "IPv6.subnetMaskFromPrefixLength")
    @js.native
    def subnetMaskFromPrefixLength(prefix: Double): IPv6 = js.native
  }
  
  @JSImport("ipaddr.js", "fromByteArray")
  @js.native
  def fromByteArray(bytes: js.Array[Double]): IPv4 | IPv6 = js.native
  
  @JSImport("ipaddr.js", "isValid")
  @js.native
  def isValid(addr: String): Boolean = js.native
  
  @JSImport("ipaddr.js", "parse")
  @js.native
  def parse(addr: String): IPv4 | IPv6 = js.native
  
  @JSImport("ipaddr.js", "parseCIDR")
  @js.native
  def parseCIDR(mask: String): js.Tuple2[IPv4 | IPv6, Double] = js.native
  
  @JSImport("ipaddr.js", "process")
  @js.native
  def process(addr: String): IPv4 | IPv6 = js.native
  
  @JSImport("ipaddr.js", "subnetMatch")
  @js.native
  def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4]): String = js.native
  @JSImport("ipaddr.js", "subnetMatch")
  @js.native
  def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4], defaultName: String): String = js.native
  @JSImport("ipaddr.js", "subnetMatch")
  @js.native
  def subnetMatch(addr: IPv6, rangeList: RangeList[IPv6]): String = js.native
  @JSImport("ipaddr.js", "subnetMatch")
  @js.native
  def subnetMatch(addr: IPv6, rangeList: RangeList[IPv6], defaultName: String): String = js.native
  
  // Common methods/properties for IPv4 and IPv6 classes.
  @js.native
  trait IP extends StObject {
    
    def prefixLengthFromSubnetMask(): Double | Null = js.native
    
    def toByteArray(): js.Array[Double] = js.native
    
    def toNormalizedString(): String = js.native
  }
  object IP {
    
    @scala.inline
    def apply(
      prefixLengthFromSubnetMask: () => Double | Null,
      toByteArray: () => js.Array[Double],
      toNormalizedString: () => String
    ): IP = {
      val __obj = js.Dynamic.literal(prefixLengthFromSubnetMask = js.Any.fromFunction0(prefixLengthFromSubnetMask), toByteArray = js.Any.fromFunction0(toByteArray), toNormalizedString = js.Any.fromFunction0(toNormalizedString))
      __obj.asInstanceOf[IP]
    }
    
    @scala.inline
    implicit class IPMutableBuilder[Self <: IP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixLengthFromSubnetMask(value: () => Double | Null): Self = StObject.set(x, "prefixLengthFromSubnetMask", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToByteArray(value: () => js.Array[Double]): Self = StObject.set(x, "toByteArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToNormalizedString(value: () => String): Self = StObject.set(x, "toNormalizedString", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.broadcast
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.carrierGradeNat
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.`private`
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPv4Range extends StObject
  object IPv4Range {
    
    @scala.inline
    def broadcast: typingsSlinky.ipaddrJs.ipaddrJsStrings.broadcast = "broadcast".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.broadcast]
    
    @scala.inline
    def carrierGradeNat: typingsSlinky.ipaddrJs.ipaddrJsStrings.carrierGradeNat = "carrierGradeNat".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.carrierGradeNat]
    
    @scala.inline
    def linkLocal: typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    @scala.inline
    def loopback: typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback]
    
    @scala.inline
    def multicast: typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast]
    
    @scala.inline
    def `private`: typingsSlinky.ipaddrJs.ipaddrJsStrings.`private` = "private".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.`private`]
    
    @scala.inline
    def reserved: typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved]
    
    @scala.inline
    def unicast: typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast]
    
    @scala.inline
    def unspecified: typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.uniqueLocal
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.ipv4Mapped
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.rfc6145
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.rfc6052
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.`6to4`
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.teredo
    - typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPv6Range extends StObject
  object IPv6Range {
    
    @scala.inline
    def `6to4`: typingsSlinky.ipaddrJs.ipaddrJsStrings.`6to4` = "6to4".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.`6to4`]
    
    @scala.inline
    def ipv4Mapped: typingsSlinky.ipaddrJs.ipaddrJsStrings.ipv4Mapped = "ipv4Mapped".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.ipv4Mapped]
    
    @scala.inline
    def linkLocal: typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    @scala.inline
    def loopback: typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback]
    
    @scala.inline
    def multicast: typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast]
    
    @scala.inline
    def reserved: typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved]
    
    @scala.inline
    def rfc6052: typingsSlinky.ipaddrJs.ipaddrJsStrings.rfc6052 = "rfc6052".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.rfc6052]
    
    @scala.inline
    def rfc6145: typingsSlinky.ipaddrJs.ipaddrJsStrings.rfc6145 = "rfc6145".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.rfc6145]
    
    @scala.inline
    def teredo: typingsSlinky.ipaddrJs.ipaddrJsStrings.teredo = "teredo".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.teredo]
    
    @scala.inline
    def unicast: typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast]
    
    @scala.inline
    def uniqueLocal: typingsSlinky.ipaddrJs.ipaddrJsStrings.uniqueLocal = "uniqueLocal".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.uniqueLocal]
    
    @scala.inline
    def unspecified: typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  type RangeList[T] = StringDictionary[(js.Tuple2[T, Double]) | (js.Array[js.Tuple2[T, Double]])]
}
