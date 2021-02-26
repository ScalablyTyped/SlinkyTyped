package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment with an assignment.
  */
@js.native
trait SchemaAssignment extends StObject {
  
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String] = js.native
}
object SchemaAssignment {
  
  @scala.inline
  def apply(): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignment]
  }
  
  @scala.inline
  implicit class SchemaAssignmentMutableBuilder[Self <: SchemaAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
