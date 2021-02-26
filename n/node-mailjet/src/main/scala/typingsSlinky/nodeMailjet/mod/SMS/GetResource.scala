package typingsSlinky.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// resources
@js.native
trait GetResource extends StObject {
  
  def action(action: String): GetResourceAction = js.native
  
  def id(value: String): GetResource = js.native
  
  def request(): js.Promise[GetResponse] = js.native
  def request(params: GetParams): js.Promise[GetResponse] = js.native
}
