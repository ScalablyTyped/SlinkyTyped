package typingsSlinky.ionic

import typingsSlinky.ionic.anon.Progress
import typingsSlinky.ionic.anon.`0`
import typingsSlinky.ionic.definitionsMod.CreateRequestOptions
import typingsSlinky.ionic.definitionsMod.HttpMethod
import typingsSlinky.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsHttpMod {
  
  @JSImport("ionic/lib/utils/http", "PROXY_ENVIRONMENT_VARIABLES")
  @js.native
  val PROXY_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  
  @JSImport("ionic/lib/utils/http", "createRequest")
  @js.native
  def createRequest(method: HttpMethod, url: String, hasProxySsl: CreateRequestOptions): js.Promise[`0`] = js.native
  
  @JSImport("ionic/lib/utils/http", "download")
  @js.native
  def download(req: SuperAgentRequest, ws: WritableStream, hasProgress: Progress): js.Promise[Unit] = js.native
  
  type SuperAgentRequest = typingsSlinky.superagent.mod.SuperAgentRequest
}
