package typingsSlinky.d3Indirections

import typingsSlinky.d3Indirections.anon.ResourceIndex
import typingsSlinky.d3Indirections.anon.ResourceUid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any type of indirection, received from a GET request.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.d3Indirections.ManualIndirection
  - typingsSlinky.d3Indirections.ListIndirection
*/
trait Indirection extends StObject
object Indirection {
  
  @scala.inline
  def ListIndirection(listIndirection: ResourceIndex, name: String, resourceType: ResourceType, uid: String): typingsSlinky.d3Indirections.ListIndirection = {
    val __obj = js.Dynamic.literal(listIndirection = listIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.d3Indirections.ListIndirection]
  }
  
  @scala.inline
  def ManualIndirection(manualIndirection: ResourceUid, name: String, resourceType: ResourceType, uid: String): typingsSlinky.d3Indirections.ManualIndirection = {
    val __obj = js.Dynamic.literal(manualIndirection = manualIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.d3Indirections.ManualIndirection]
  }
}
