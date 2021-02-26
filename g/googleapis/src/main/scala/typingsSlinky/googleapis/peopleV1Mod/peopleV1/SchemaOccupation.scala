package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s occupation.
  */
@js.native
trait SchemaOccupation extends StObject {
  
  /**
    * Metadata about the occupation.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The occupation; for example, `carpenter`.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaOccupation {
  
  @scala.inline
  def apply(): SchemaOccupation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOccupation]
  }
  
  @scala.inline
  implicit class SchemaOccupationMutableBuilder[Self <: SchemaOccupation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
