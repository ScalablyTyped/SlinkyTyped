package typingsSlinky.oauthJs.OAuth

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureMethod extends js.Object {
  var key: String = js.native
  def getSignature(baseString: String): String = js.native
  /** Set the key string for signing. */
  def initialize(name: String, accessor: Accessor): Unit = js.native
  /** Add a signature to the message. */
  def sign(message: Message): String = js.native
}

@JSGlobal("OAuth.SignatureMethod")
@js.native
object SignatureMethod extends TopLevel[SignatureMethodStatic]

