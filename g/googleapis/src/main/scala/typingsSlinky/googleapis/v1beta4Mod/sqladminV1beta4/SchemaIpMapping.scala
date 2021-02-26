package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance IP Mapping.
  */
@js.native
trait SchemaIpMapping extends StObject {
  
  /**
    * The IP address assigned.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * The due time for this IP to be retired in RFC 3339 format, for example
    * 2012-11-15T16:19:00.094Z. This field is only available when the IP is
    * scheduled to be retired.
    */
  var timeToRetire: js.UndefOr[String] = js.native
  
  /**
    * The type of this IP address. A PRIMARY address is an address that can
    * accept incoming connections. An OUTGOING address is the source address of
    * connections originating from the instance, if supported.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaIpMapping {
  
  @scala.inline
  def apply(): SchemaIpMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIpMapping]
  }
  
  @scala.inline
  implicit class SchemaIpMappingMutableBuilder[Self <: SchemaIpMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setTimeToRetire(value: String): Self = StObject.set(x, "timeToRetire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToRetireUndefined: Self = StObject.set(x, "timeToRetire", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
