package typingsSlinky.ionic

import typingsSlinky.ionic.anon.Progress
import typingsSlinky.ionic.anon.`0`
import typingsSlinky.ionic.definitionsMod.CreateRequestOptions
import typingsSlinky.ionic.definitionsMod.HttpMethod
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/utils/http", JSImport.Namespace)
@js.native
object utilsHttpMod extends js.Object {
  
  val PROXY_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  
  def createRequest(method: HttpMethod, url: String, hasProxySsl: CreateRequestOptions): js.Promise[`0`] = js.native
  
  def download(req: SuperAgentRequest, ws: WritableStream, hasProgress: Progress): js.Promise[Unit] = js.native
  
  type SuperAgentRequest = typingsSlinky.superagent.mod.SuperAgentRequest
}
