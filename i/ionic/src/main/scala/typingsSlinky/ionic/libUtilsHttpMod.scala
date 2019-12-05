package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CreateRequestOptions
import typingsSlinky.ionic.definitionsMod.HttpMethod
import typingsSlinky.ionic.libUtilsHttpMod.SuperAgentRequest
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/http", JSImport.Namespace)
@js.native
object libUtilsHttpMod extends js.Object {
  val PROXY_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  def createRequest(method: HttpMethod, url: String, hasProxySsl: CreateRequestOptions): js.Promise[Anon_ReqSuperAgentRequest_1070649823] = js.native
  def download(req: SuperAgentRequest, ws: WritableStream, hasProgress: Anon_Loaded): js.Promise[Unit] = js.native
  type SuperAgentRequest = typingsSlinky.superagent.superagentMod.SuperAgentRequest
}

