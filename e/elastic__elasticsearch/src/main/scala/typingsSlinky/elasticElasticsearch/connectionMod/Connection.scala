package typingsSlinky.elasticElasticsearch.connectionMod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.node.utilMod.InspectOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  def apply(`object`: js.Any, options: InspectOptions): String = js.native
  
  var _agent: Agent = js.native
  
  var _openRequests: Double = js.native
  
  var _status: String = js.native
  
  def buildRequestObject(params: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: node.http.ClientRequestArgs[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify inspect.custom * / any] */ js.Any = js.native
  
  def close(): Connection = js.native
  
  var deadCount: Double = js.native
  
  var headers: Record[String, _] = js.native
  
  var id: String = js.native
  
  var makeRequest: js.Any = js.native
  
  def request(
    params: RequestOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ IncomingMessage | Null, Unit]
  ): ClientRequest = js.native
  
  var resurrectTimeout: Double = js.native
  
  var roles: ConnectionRoles = js.native
  
  def setRole(role: String, enabled: Boolean): Connection = js.native
  
  var ssl: typingsSlinky.node.tlsMod.ConnectionOptions | Null = js.native
  
  var status: String = js.native
  
  def toJSON(): js.Any = js.native
  
  var url: URL_ = js.native
}
