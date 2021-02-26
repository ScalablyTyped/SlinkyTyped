package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.octokitTypesStrings.error
import typingsSlinky.octokitTypes.octokitTypesStrings.none
import typingsSlinky.octokitTypes.octokitTypesStrings.note
import typingsSlinky.octokitTypes.octokitTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Severity extends StObject {
  
  /**
    * A short description of the rule used to detect the alert.
    */
  var description: String = js.native
  
  /**
    * A unique identifier for the rule used to detect the alert.
    */
  var id: String = js.native
  
  /**
    * The severity of the alert.
    */
  var severity: none | note | warning | error = js.native
}
object Severity {
  
  @scala.inline
  def apply(description: String, id: String, severity: none | note | warning | error): Severity = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Severity]
  }
  
  @scala.inline
  implicit class SeverityMutableBuilder[Self <: Severity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: none | note | warning | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
