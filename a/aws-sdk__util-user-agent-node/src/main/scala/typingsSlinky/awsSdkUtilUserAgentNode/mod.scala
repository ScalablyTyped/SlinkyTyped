package typingsSlinky.awsSdkUtilUserAgentNode

import typingsSlinky.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-user-agent-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def appendToUserAgent(request: HttpRequest[js.typedarray.Uint8Array], userAgentPartial: String): Unit = js.native
  def defaultUserAgent(packageName: String, packageVersion: String): String = js.native
}

