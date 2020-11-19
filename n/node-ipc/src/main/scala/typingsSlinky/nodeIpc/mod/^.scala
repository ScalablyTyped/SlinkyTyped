package typingsSlinky.nodeIpc.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.nodeIpc.mod.NodeIPC.Config
import typingsSlinky.nodeIpc.mod.NodeIPC.EmptyCallback
import typingsSlinky.nodeIpc.mod.NodeIPC.Server
import typingsSlinky.nodeIpc.nodeIpcStrings.udp4
import typingsSlinky.nodeIpc.nodeIpcStrings.udp6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ipc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var IPC: Instantiable0[typingsSlinky.nodeIpc.mod.NodeIPC.IPC] = js.native
  
  /**
    * Set these variables in the ipc.config scope to overwrite or set default values
    */
  var config: Config = js.native
  
  /**
    * https://www.npmjs.com/package/node-ipc#connectto
    * Used for connecting as a client to local Unix Sockets and Windows Sockets.
    * This is the fastest way for processes on the same machine to communicate
    * because it bypasses the network card which TCP and UDP must both use.
    * @param id is the string id of the socket being connected to.
    * The socket with this id is added to the ipc.of object when created.
    * @param path is the path of the Unix Domain Socket File, if the System is Windows,
    * this will automatically be converted to an appropriate pipe with the same information as the Unix Domain Socket File.
    * If not set this will default to ipc.config.socketRoot+ipc.config.appspace+id
    * @param callback this is the function to execute when the socket has been created
    */
  /**
    * https://www.npmjs.com/package/node-ipc#connectto
    * Used for connecting as a client to local Unix Sockets and Windows Sockets.
    * This is the fastest way for processes on the same machine to communicate
    * because it bypasses the network card which TCP and UDP must both use.
    * @param id is the string id of the socket being connected to.
    * The socket with this id is added to the ipc.of object when created.
    * @param callback this is the function to execute when the socket has been created
    */
  def connectTo(id: String): Unit = js.native
  def connectTo(id: String, callback: js.Function0[Unit]): Unit = js.native
  def connectTo(id: String, path: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def connectTo(id: String, path: String): Unit = js.native
  def connectTo(id: String, path: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * https://www.npmjs.com/package/node-ipc#connecttonet
    * Used to connect as a client to a TCP or TLS socket via the network card.
    * This can be local or remote, if local, it is recommended that you use the Unix
    * and Windows Socket Implementaion of connectTo instead as it is much faster since it avoids the network card altogether.
    * For TLS and SSL Sockets see the node-ipc TLS and SSL docs.
    * They have a few additional requirements, and things to know about and so have their own doc.
    * @param id is the string id of the socket being connected to. For TCP & TLS sockets,
    * this id is added to the ipc.of object when the socket is created with a reference to the socket
    * @param host is the host on which the TCP or TLS socket resides.
    * This will default to ipc.config.networkHost if not specified
    * @param port the port on which the TCP or TLS socket resides
    * @param callback     this is the function to execute when the socket has been created
    */
  /**
    * https://www.npmjs.com/package/node-ipc#connecttonet
    * Used to connect as a client to a TCP or TLS socket via the network card.
    * This can be local or remote, if local, it is recommended that you use the Unix
    * and Windows Socket Implementaion of connectTo instead as it is much faster since it avoids the network card altogether.
    * For TLS and SSL Sockets see the node-ipc TLS and SSL docs.
    * They have a few additional requirements, and things to know about and so have their own doc.
    * @param id is the string id of the socket being connected to. For TCP & TLS sockets,
    * this id is added to the ipc.of object when the socket is created with a reference to the socket
    * @param callback     this is the function to execute when the socket has been created
    */
  def connectToNet(id: String): Unit = js.native
  def connectToNet(id: String, callback: js.Function0[Unit]): Unit = js.native
  def connectToNet(id: String, hostOrPort: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#connecttonet
    * Used to connect as a client to a TCP or TLS socket via the network card.
    * This can be local or remote, if local, it is recommended that you use the Unix
    * and Windows Socket Implementaion of connectTo instead as it is much faster since it avoids the network card altogether.
    * For TLS and SSL Sockets see the node-ipc TLS and SSL docs.
    * They have a few additional requirements, and things to know about and so have their own doc.
    * @param id is the string id of the socket being connected to.
    * For TCP & TLS sockets, this id is added to the ipc.of object when the socket is created with a reference to the socket
    * @param host is the host on which the TCP or TLS socket resides. This will default to ipc.config.networkHost if not specified
    * @param port the port on which the TCP or TLS socket resides
    * @param callback     this is the function to execute when the socket has been created
    */
  def connectToNet(id: String, hostOrPort: Double): Unit = js.native
  def connectToNet(id: String, hostOrPort: Double, callback: js.Function0[Unit]): Unit = js.native
  def connectToNet(
    id: String,
    host: js.UndefOr[scala.Nothing],
    port: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def connectToNet(id: String, host: js.UndefOr[scala.Nothing], port: Double): Unit = js.native
  def connectToNet(id: String, host: js.UndefOr[scala.Nothing], port: Double, callback: js.Function0[Unit]): Unit = js.native
  def connectToNet(id: String, host: String): Unit = js.native
  def connectToNet(id: String, host: String, port: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def connectToNet(id: String, host: String, port: Double): Unit = js.native
  def connectToNet(id: String, host: String, port: Double, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * https://www.npmjs.com/package/node-ipc#disconnect
    * Used to disconnect a client from a Unix, Windows, TCP or TLS socket.
    * The socket and its refrence will be removed from memory and the ipc.of scope.
    * This can be local or remote. UDP clients do not maintain connections and so there are no Clients and this method has no value to them
    * @param id is the string id of the socket from which to disconnect
    */
  def disconnect(id: String): Unit = js.native
  
  /**
    * https://www.npmjs.com/package/node-ipc#log
    */
  def log(args: js.Any*): Unit = js.native
  
  /**
    * This is where socket connection refrences will be stored when connecting to them as a client via the ipc.connectTo
    * or iupc.connectToNet. They will be stored based on the ID used to create them, eg : ipc.of.mySocket
    */
  var of: js.Any = js.native
  
  /**
    * https://www.npmjs.com/package/node-ipc#serve
    * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
    * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
    * @param callback This is a function to be called after the Server has started.
    * This can also be done by binding an event to the start event like ipc.server.on('start',function(){});
    */
  def serve(): Unit = js.native
  def serve(callback: js.Function0[Unit]): Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#serve
    * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
    * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
    */
  def serve(callback: Null): Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#serve
    * Used to create local Unix Socket Server or Windows Socket Server to which Clients can bind.
    * The server can emit events to specific Client Sockets, or broadcast events to all known Client Sockets
    * @param path This is the path of the Unix Domain Socket File, if the System is Windows,
    * this will automatically be converted to an appropriate pipe with the same information as the Unix Domain Socket File.
    * If not set this will default to ipc.config.socketRoot+ipc.config.appspace+id
    * @param callback This is a function to be called after the Server has started.
    * This can also be done by binding an event to the start event like ipc.server.on('start',function(){});
    */
  def serve(path: String): Unit = js.native
  def serve(path: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param host If not specified this defaults to the first address in os.networkInterfaces().
    * For TCP, TLS & UDP servers this is most likely going to be 127.0.0.1 or ::1
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
    * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
    * @param callback Function to be called when the server is created
    */
  def serveNet(): Unit = js.native
  def serveNet(callbackOrPort: Double): Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param callback Function to be called when the server is created
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    */
  def serveNet(callbackOrPort: EmptyCallback): Unit = js.native
  def serveNet(
    host: js.UndefOr[scala.Nothing],
    port: js.UndefOr[scala.Nothing],
    UDPType: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def serveNet(host: js.UndefOr[scala.Nothing], port: Double): Unit = js.native
  def serveNet(
    host: js.UndefOr[scala.Nothing],
    port: Double,
    UDPType: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def serveNet(host: String): Unit = js.native
  def serveNet(
    host: String,
    port: js.UndefOr[scala.Nothing],
    UDPType: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param host If not specified this defaults to the first address in os.networkInterfaces().
    * For TCP, TLS & UDP servers this is most likely going to be 127.0.0.1 or ::1
    * @param port The port on which the TCP, UDP, or TLS Socket server will be bound, this defaults to 8000 if not specified
    * @param callback Function to be called when the server is created
    */
  def serveNet(host: String, port: Double): Unit = js.native
  def serveNet(host: String, port: Double, UDPType: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def serveNet(host: String, port: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * https://www.npmjs.com/package/node-ipc#servenet
    * @param UDPType If set this will create the server as a UDP socket. 'udp4' or 'udp6' are valid values.
    * This defaults to not being set. When using udp6 make sure to specify a valid IPv6 host, like ::1
    * @param callback Function to be called when the server is created
    */
  @JSName("serveNet")
  def serveNet_udp4(UDPType: udp4): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(UDPType: udp4, callback: js.Function0[Unit]): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: js.UndefOr[scala.Nothing], port: js.UndefOr[scala.Nothing], UDPType: udp4): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(
    host: js.UndefOr[scala.Nothing],
    port: js.UndefOr[scala.Nothing],
    UDPType: udp4,
    callback: js.Function0[Unit]
  ): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: js.UndefOr[scala.Nothing], port: Double, UDPType: udp4): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: js.UndefOr[scala.Nothing], port: Double, UDPType: udp4, callback: js.Function0[Unit]): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: String, port: js.UndefOr[scala.Nothing], UDPType: udp4): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: String, port: js.UndefOr[scala.Nothing], UDPType: udp4, callback: js.Function0[Unit]): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: String, port: Double, UDPType: udp4): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp4(host: String, port: Double, UDPType: udp4, callback: js.Function0[Unit]): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(UDPType: udp6): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(UDPType: udp6, callback: js.Function0[Unit]): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: js.UndefOr[scala.Nothing], port: js.UndefOr[scala.Nothing], UDPType: udp6): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(
    host: js.UndefOr[scala.Nothing],
    port: js.UndefOr[scala.Nothing],
    UDPType: udp6,
    callback: js.Function0[Unit]
  ): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: js.UndefOr[scala.Nothing], port: Double, UDPType: udp6): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: js.UndefOr[scala.Nothing], port: Double, UDPType: udp6, callback: js.Function0[Unit]): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: String, port: js.UndefOr[scala.Nothing], UDPType: udp6): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: String, port: js.UndefOr[scala.Nothing], UDPType: udp6, callback: js.Function0[Unit]): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: String, port: Double, UDPType: udp6): Unit = js.native
  @JSName("serveNet")
  def serveNet_udp6(host: String, port: Double, UDPType: udp6, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * This is a refrence to the server created by ipc.serve or ipc.serveNet
    */
  var server: Server = js.native
}
