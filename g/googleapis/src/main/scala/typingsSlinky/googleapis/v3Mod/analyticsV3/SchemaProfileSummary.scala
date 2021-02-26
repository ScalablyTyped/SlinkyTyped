package typingsSlinky.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics ProfileSummary. ProfileSummary returns basic
  * information (i.e., summary) for a profile.
  */
@js.native
trait SchemaProfileSummary extends StObject {
  
  /**
    * View (profile) ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Resource type for Analytics ProfileSummary.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * View (profile) name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether this view (profile) is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  
  /**
    * View (Profile) type. Supported types: WEB or APP.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaProfileSummary {
  
  @scala.inline
  def apply(): SchemaProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileSummary]
  }
  
  @scala.inline
  implicit class SchemaProfileSummaryMutableBuilder[Self <: SchemaProfileSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
