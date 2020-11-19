package typingsSlinky.firebaseInstallations.commonMod

import org.scalajs.dom.experimental.Response
import typingsSlinky.firebaseUtil.mod.FirebaseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/installations/dist/src/api/common", "getErrorFromResponse")
@js.native
object getErrorFromResponse extends js.Object {
  
  def apply(requestName: String, response: Response): js.Promise[FirebaseError] = js.native
}
