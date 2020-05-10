package typingsSlinky.node.http2Mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSessionOptions extends SessionOptions {
  var Http1IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, IncomingMessage]] = js.native
  var Http1ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, ServerResponse]] = js.native
  var Http2ServerRequest: js.UndefOr[
    Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      typingsSlinky.node.http2Mod.Http2ServerRequest
    ]
  ] = js.native
  var Http2ServerResponse: js.UndefOr[
    Instantiable1[/* stream */ ServerHttp2Stream, typingsSlinky.node.http2Mod.Http2ServerResponse]
  ] = js.native
}

object ServerSessionOptions {
  @scala.inline
  def apply(): ServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSessionOptions]
  }
  @scala.inline
  implicit class ServerSessionOptionsOps[Self <: ServerSessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttp1IncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http1IncomingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp1IncomingMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http1IncomingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp1ServerResponse(value: Instantiable1[/* req */ IncomingMessage, ServerResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http1ServerResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp1ServerResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http1ServerResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp2ServerRequest(
      value: Instantiable4[
          /* stream */ ServerHttp2Stream, 
          /* headers */ IncomingHttpHeaders, 
          /* options */ ReadableOptions, 
          /* rawHeaders */ js.Array[String], 
          Http2ServerRequest
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http2ServerRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp2ServerRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http2ServerRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp2ServerResponse(value: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http2ServerResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp2ServerResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http2ServerResponse")(js.undefined)
        ret
    }
  }
  
}

