package typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataEntry extends StObject {
  
  /** The metadata entry key. For JSON requests, the key is base64-encoded. */
  var key: js.UndefOr[String] = js.native
  
  /** The metadata entry value. For JSON requests, the value is base64-encoded. */
  var value: js.UndefOr[String] = js.native
}
object MetadataEntry {
  
  @scala.inline
  def apply(): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataEntry]
  }
  
  @scala.inline
  implicit class MetadataEntryMutableBuilder[Self <: MetadataEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
