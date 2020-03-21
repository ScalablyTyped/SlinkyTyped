package typingsSlinky.firebaseInstallations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  requestName  :string} & @firebase/installations.@firebase/installations/dist/src/util/errors.ServerErrorData */
trait requestNamestringServerEr extends js.Object {
  var requestName: String
  var serverCode: Double
  var serverMessage: String
  var serverStatus: String
}

object requestNamestringServerEr {
  @scala.inline
  def apply(requestName: String, serverCode: Double, serverMessage: String, serverStatus: String): requestNamestringServerEr = {
    val __obj = js.Dynamic.literal(requestName = requestName.asInstanceOf[js.Any], serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[requestNamestringServerEr]
  }
}

