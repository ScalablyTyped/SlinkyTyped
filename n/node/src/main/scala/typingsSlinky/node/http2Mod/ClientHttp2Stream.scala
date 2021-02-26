package typingsSlinky.node.http2Mod

import typingsSlinky.node.nodeStrings.continue
import typingsSlinky.node.nodeStrings.headers
import typingsSlinky.node.nodeStrings.push
import typingsSlinky.node.nodeStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientHttp2Stream extends Http2Stream {
  
  @JSName("addListener")
  def addListener_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("emit")
  def emit_continue(event: continue): Boolean = js.native
  @JSName("emit")
  def emit_headers(event: headers, headers: IncomingHttpHeaders with IncomingHttpStatusHeader, flags: Double): Boolean = js.native
  @JSName("emit")
  def emit_push(event: push, headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  @JSName("emit")
  def emit_response(event: response, headers: IncomingHttpHeaders with IncomingHttpStatusHeader, flags: Double): Boolean = js.native
  
  @JSName("on")
  def on_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  def once_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("once")
  def once_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("prependListener")
  def prependListener_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
}
