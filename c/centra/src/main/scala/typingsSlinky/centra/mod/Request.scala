package typingsSlinky.centra.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.centra.centraStrings._defaultAgent
import typingsSlinky.centra.centraStrings.agent
import typingsSlinky.centra.centraStrings.auth
import typingsSlinky.centra.centraStrings.buffer
import typingsSlinky.centra.centraStrings.createConnection
import typingsSlinky.centra.centraStrings.defaultPort
import typingsSlinky.centra.centraStrings.family
import typingsSlinky.centra.centraStrings.form
import typingsSlinky.centra.centraStrings.headers
import typingsSlinky.centra.centraStrings.host
import typingsSlinky.centra.centraStrings.hostname
import typingsSlinky.centra.centraStrings.json
import typingsSlinky.centra.centraStrings.localAddress
import typingsSlinky.centra.centraStrings.maxHeaderSize
import typingsSlinky.centra.centraStrings.method
import typingsSlinky.centra.centraStrings.path
import typingsSlinky.centra.centraStrings.port
import typingsSlinky.centra.centraStrings.protocol
import typingsSlinky.centra.centraStrings.setHost
import typingsSlinky.centra.centraStrings.socketPath
import typingsSlinky.centra.centraStrings.timeout
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var compressionEnabled: Boolean = js.native
  var coreOptions: RequestOptions = js.native
  var data: String | Buffer | Null = js.native
  var method: String = js.native
  var reqHeaders: StringDictionary[String] = js.native
  var sendDataAs: form | json | buffer | Null = js.native
  var streamEnabled: Boolean = js.native
  var timeoutTime: Double | Null = js.native
  var url: URL_ = js.native
  def body(data: js.Any): this.type = js.native
  @JSName("body")
  def body_buffer(data: js.Any, sendAs: buffer): this.type = js.native
  @JSName("body")
  def body_form(data: js.Any, sendAs: form): this.type = js.native
  @JSName("body")
  def body_json(data: js.Any, sendAs: json): this.type = js.native
  def compress(): this.type = js.native
  def header(headers: StringDictionary[String]): this.type = js.native
  def header(key: String, value: String): this.type = js.native
  @JSName("option")
  def option_agent(key: agent): this.type = js.native
  @JSName("option")
  def option_agent(key: agent, value: Boolean): this.type = js.native
  @JSName("option")
  def option_agent(key: agent, value: Agent): this.type = js.native
  @JSName("option")
  def option_auth(key: auth): this.type = js.native
  @JSName("option")
  def option_auth(key: auth, value: String): this.type = js.native
  @JSName("option")
  def option_createConnection(key: createConnection): this.type = js.native
  @JSName("option")
  def option_createConnection(
    key: createConnection,
    value: js.Function2[
      /* options */ this.type, 
      /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ): this.type = js.native
  @JSName("option")
  def option_defaultAgent(key: _defaultAgent): this.type = js.native
  @JSName("option")
  def option_defaultAgent(key: _defaultAgent, value: Agent): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: defaultPort): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: defaultPort, value: String): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: defaultPort, value: Double): this.type = js.native
  @JSName("option")
  def option_family(key: family): this.type = js.native
  @JSName("option")
  def option_family(key: family, value: Double): this.type = js.native
  @JSName("option")
  def option_headers(key: headers): this.type = js.native
  @JSName("option")
  def option_headers(key: headers, value: OutgoingHttpHeaders): this.type = js.native
  @JSName("option")
  def option_host(key: host): this.type = js.native
  @JSName("option")
  def option_host(key: host, value: String): this.type = js.native
  @JSName("option")
  def option_hostname(key: hostname): this.type = js.native
  @JSName("option")
  def option_hostname(key: hostname, value: String): this.type = js.native
  @JSName("option")
  def option_localAddress(key: localAddress): this.type = js.native
  @JSName("option")
  def option_localAddress(key: localAddress, value: String): this.type = js.native
  @JSName("option")
  def option_maxHeaderSize(key: maxHeaderSize): this.type = js.native
  @JSName("option")
  def option_maxHeaderSize(key: maxHeaderSize, value: Double): this.type = js.native
  @JSName("option")
  def option_method(key: method): this.type = js.native
  @JSName("option")
  def option_method(key: method, value: String): this.type = js.native
  @JSName("option")
  def option_path(key: path): this.type = js.native
  @JSName("option")
  def option_path(key: path, value: String): this.type = js.native
  @JSName("option")
  def option_port(key: port): this.type = js.native
  @JSName("option")
  def option_port(key: port, value: String): this.type = js.native
  @JSName("option")
  def option_port(key: port, value: Double): this.type = js.native
  @JSName("option")
  def option_protocol(key: protocol): this.type = js.native
  @JSName("option")
  def option_protocol(key: protocol, value: String): this.type = js.native
  @JSName("option")
  def option_setHost(key: setHost): this.type = js.native
  @JSName("option")
  def option_setHost(key: setHost, value: Boolean): this.type = js.native
  @JSName("option")
  def option_socketPath(key: socketPath): this.type = js.native
  @JSName("option")
  def option_socketPath(key: socketPath, value: String): this.type = js.native
  @JSName("option")
  def option_timeout(key: timeout): this.type = js.native
  @JSName("option")
  def option_timeout(key: timeout, value: Double): this.type = js.native
  def path(relativePath: String): this.type = js.native
  def query(key: String, value: js.Any): this.type = js.native
  def query(params: StringDictionary[js.Any]): this.type = js.native
  def send(): js.Promise[Response] = js.native
  def stream(): this.type = js.native
  def timeout(timeMs: Double): this.type = js.native
}

