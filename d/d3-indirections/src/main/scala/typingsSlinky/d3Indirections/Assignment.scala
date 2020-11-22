package typingsSlinky.d3Indirections

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
trait Assignment extends js.Object
object Assignment {
  
  @scala.inline
  def ManualAssignment(resourceUid: String, uid: String): Assignment = {
    val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
  
  @scala.inline
  def ListAssignment(resourceIndex: Double, uid: String): Assignment = {
    val __obj = js.Dynamic.literal(resourceIndex = resourceIndex.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
}
