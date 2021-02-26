package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVersionErrorItem extends StObject {
  
  /**
    * The details of the error for the schema version.
    */
  var ErrorDetails: js.UndefOr[typingsSlinky.awsSdk.glueMod.ErrorDetails] = js.native
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.native
}
object SchemaVersionErrorItem {
  
  @scala.inline
  def apply(): SchemaVersionErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionErrorItem]
  }
  
  @scala.inline
  implicit class SchemaVersionErrorItemMutableBuilder[Self <: SchemaVersionErrorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
