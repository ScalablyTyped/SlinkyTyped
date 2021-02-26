package typingsSlinky.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any Indirection Resource assignment.
  *
  * This abstract type never gets sent via a PUT request.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.d3Indirections.ManualAssignment
  - typingsSlinky.d3Indirections.ListAssignment
*/
trait Assignment extends StObject
object Assignment {
  
  @scala.inline
  def ListAssignment(resourceIndex: Double, uid: String): typingsSlinky.d3Indirections.ListAssignment = {
    val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.d3Indirections.ListAssignment]
  }
  
  @scala.inline
  def ManualAssignment(resourceUid: String, uid: String): typingsSlinky.d3Indirections.ManualAssignment = {
    val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.d3Indirections.ManualAssignment]
  }
}
