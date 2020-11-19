package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s short biography.
  */
@js.native
trait SchemaBiography extends js.Object {
  
  /**
    * The content type of the biography.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the biography.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The short biography.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaBiography {
  
  @scala.inline
  def apply(): SchemaBiography = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBiography]
  }
  
  @scala.inline
  implicit class SchemaBiographyOps[Self <: SchemaBiography] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
