package typingsSlinky.roadsServer.http2ServerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.http2Mod.Http2Server
import typingsSlinky.node.http2Mod.ServerHttp2Stream
import typingsSlinky.roads.mod.Response
import typingsSlinky.roads.mod.Road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * This is the road object that will handle all requests
    * @type {Road}
    */
  var road: Road = js.native
  /**
    * This is the node.js http2 server from the http2 library.
    * @todo  support HTTPS
    * @type HTTPServer
    */
  var server: Http2Server = js.native
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    *
    * @param {number} port
    * @param {string} hostname
    */
  def listen(port: Double, hostname: String): Http2Server = js.native
  /**
    * Standard logic for turning each request into a road request, and communicating the response
    * back to the client
    *
    * @param {ServerHttp2Stream} stream
    * @param {object} headers
    */
  /* protected */ def onStream(stream: ServerHttp2Stream, headers: StringDictionary[js.Any]): Unit = js.native
  /**
    * Helper function to write a roads Response object to an HTTPResponse object
    *
    * @param {ServerHttp2Stream} stream
    * @param {Response} response
    */
  /* protected */ def sendResponse(stream: ServerHttp2Stream, response: Response): Unit = js.native
}

object Server {
  @scala.inline
  def apply(
    listen: (Double, String) => Http2Server,
    onStream: (ServerHttp2Stream, StringDictionary[js.Any]) => Unit,
    road: Road,
    sendResponse: (ServerHttp2Stream, Response) => Unit,
    server: Http2Server
  ): Server = {
    val __obj = js.Dynamic.literal(listen = js.Any.fromFunction2(listen), onStream = js.Any.fromFunction2(onStream), road = road.asInstanceOf[js.Any], sendResponse = js.Any.fromFunction2(sendResponse), server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListen(value: (Double, String) => Http2Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnStream(value: (ServerHttp2Stream, StringDictionary[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRoad(value: Road): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("road")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendResponse(value: (ServerHttp2Stream, Response) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withServer(value: Http2Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

