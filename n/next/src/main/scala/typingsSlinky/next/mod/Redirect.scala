package typingsSlinky.next.mod

import typingsSlinky.next.nextNumbers.`301`
import typingsSlinky.next.nextNumbers.`302`
import typingsSlinky.next.nextNumbers.`303`
import typingsSlinky.next.nextNumbers.`307`
import typingsSlinky.next.nextNumbers.`308`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.next.anon.Destination
  - typingsSlinky.next.anon.BasePathDestination
*/
trait Redirect extends js.Object
object Redirect {
  
  @scala.inline
  def Destination(destination: String, statusCode: `301` | `302` | `303` | `307` | `308`): Redirect = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  
  @scala.inline
  def BasePathDestination(destination: String, permanent: Boolean): Redirect = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}
