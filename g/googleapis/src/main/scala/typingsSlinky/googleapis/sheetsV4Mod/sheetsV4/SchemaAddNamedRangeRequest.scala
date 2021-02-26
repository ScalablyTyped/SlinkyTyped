package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a named range to the spreadsheet.
  */
@js.native
trait SchemaAddNamedRangeRequest extends StObject {
  
  /**
    * The named range to add. The namedRangeId field is optional; if one is not
    * set, an id will be randomly generated. (It is an error to specify the ID
    * of a range that already exists.)
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.native
}
object SchemaAddNamedRangeRequest {
  
  @scala.inline
  def apply(): SchemaAddNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNamedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaAddNamedRangeRequestMutableBuilder[Self <: SchemaAddNamedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRange(value: SchemaNamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}
