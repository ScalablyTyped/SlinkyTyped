package typingsSlinky.hapi.mod

import typingsSlinky.hapi.hapiStrings.http
import typingsSlinky.hapi.hapiStrings.https
import typingsSlinky.hapi.hapiStrings.socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerInfo extends StObject {
  
  /**
    * the active IP address the connection was bound to after starting. Set to undefined until the server has been
    * started or when using a non TCP port (e.g. UNIX domain socket).
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * server creation timestamp.
    */
  var created: Double = js.native
  
  /**
    * The [host](https://github.com/hapijs/hapi/blob/master/API.md#server.options.host) configuration value.
    */
  var host: String = js.native
  
  /**
    * a unique server identifier (using the format '{hostname}:{pid}:{now base36}').
    */
  var id: String = js.native
  
  /**
    * the connection [port](https://github.com/hapijs/hapi/blob/master/API.md#server.options.port) based on the following rules:
    *  * before the server has been started: the configured port value.
    *  * after the server has been started: the actual port assigned when no port is configured or was set to 0.
    */
  var port: Double | String = js.native
  
  /**
    *  the protocol used:
    * * 'http' - HTTP.
    * * 'https' - HTTPS.
    * * 'socket' - UNIX domain socket or Windows named pipe.
    */
  var protocol: http | https | socket = js.native
  
  /**
    * server start timestamp (0 when stopped).
    */
  var started: Double = js.native
  
  /**
    * a string representing the connection (e.g. 'http://example.com:8080' or 'socket:/unix/domain/socket/path'). Contains
    * the uri value if set, otherwise constructed from the available settings. If no port is configured or is set
    * to 0, the uri will not include a port component until the server is started.
    */
  var uri: String = js.native
}
object ServerInfo {
  
  @scala.inline
  def apply(
    created: Double,
    host: String,
    id: String,
    port: Double | String,
    protocol: http | https | socket,
    started: Double,
    uri: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  @scala.inline
  implicit class ServerInfoMutableBuilder[Self <: ServerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: http | https | socket): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
