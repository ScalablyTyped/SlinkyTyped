package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single metadata entry.
  */
@js.native
trait SchemaMetadataEntry extends js.Object {
  
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
  implicit class SchemaMetadataEntryOps[Self <: SchemaMetadataEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
