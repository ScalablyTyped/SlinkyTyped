package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s bragging rights.
  */
@js.native
trait SchemaBraggingRights extends StObject {
  
  /**
    * Metadata about the bragging rights.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The bragging rights; for example, `climbed mount everest`.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaBraggingRights {
  
  @scala.inline
  def apply(): SchemaBraggingRights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBraggingRights]
  }
  
  @scala.inline
  implicit class SchemaBraggingRightsMutableBuilder[Self <: SchemaBraggingRights] (val x: Self) extends AnyVal {
    
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
