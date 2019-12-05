package typingsSlinky.atElasticElasticsearch.libConnectionMod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var _agent: Agent = js.native
  var _openRequests: Double = js.native
  var _status: String = js.native
  var deadCount: Double = js.native
  var headers: js.Any = js.native
  var id: String = js.native
  var makeRequest: js.Any = js.native
  var resurrectTimeout: Double = js.native
  var roles: js.Any = js.native
  var ssl: typingsSlinky.node.tlsMod.ConnectionOptions | Null = js.native
  var status: String = js.native
  var statuses: js.Any = js.native
  var url: URL = js.native
  def buildRequestObject(params: js.Any): ClientRequestArgs = js.native
  def close(): Connection = js.native
  def request(
    params: RequestOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ IncomingMessage | Null, Unit]
  ): ClientRequest = js.native
  def setRole(role: String, enabled: Boolean): Connection = js.native
  def toJSON(): js.Any = js.native
}

