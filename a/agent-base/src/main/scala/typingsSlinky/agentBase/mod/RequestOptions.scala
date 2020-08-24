package typingsSlinky.agentBase.mod

import typingsSlinky.agentBase.agentBaseBooleans.`false`
import typingsSlinky.agentBase.agentBaseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.agentBase.mod.HttpRequestOptions
  - typingsSlinky.agentBase.mod.HttpsRequestOptions
*/
trait RequestOptions extends js.Object

object RequestOptions {
  @scala.inline
  def HttpRequestOptions(port: Double, secureEndpoint: `false`): RequestOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  def HttpsRequestOptions(port: Double, secureEndpoint: `true`): RequestOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

