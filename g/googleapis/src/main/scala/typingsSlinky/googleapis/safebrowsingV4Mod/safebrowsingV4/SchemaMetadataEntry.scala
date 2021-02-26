package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single metadata entry.
  */
@js.native
trait SchemaMetadataEntry extends StObject {
  
  /**
    * The metadata entry key. For JSON requests, the key is base64-encoded.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The metadata entry value. For JSON requests, the value is base64-encoded.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaMetadataEntry {
  
  @scala.inline
  def apply(): SchemaMetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataEntry]
  }
  
  @scala.inline
  implicit class SchemaMetadataEntryMutableBuilder[Self <: SchemaMetadataEntry] (val x: Self) extends AnyVal {
    
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
