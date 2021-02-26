package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DNS resource record.
  */
@js.native
trait SchemaResourceRecord extends StObject {
  
  /**
    * Relative name of the object affected by this record. Only applicable for
    * CNAME records. Example: &#39;www&#39;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Data for this record. Values vary by record type, as defined in RFC 1035
    * (section 5) and RFC 1034 (section 3.6.1).
    */
  var rrdata: js.UndefOr[String] = js.native
  
  /**
    * Resource record type. Example: AAAA.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaResourceRecord {
  
  @scala.inline
  def apply(): SchemaResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecord]
  }
  
  @scala.inline
  implicit class SchemaResourceRecordMutableBuilder[Self <: SchemaResourceRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRrdata(value: String): Self = StObject.set(x, "rrdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrdataUndefined: Self = StObject.set(x, "rrdata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
