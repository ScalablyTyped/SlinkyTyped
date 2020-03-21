package typingsSlinky.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dojox {
  type analytics = typingsSlinky.dojo.dojox.analytics_
  type collections = typingsSlinky.dojo.dojox.collections_
  type color = typingsSlinky.dojo.dojox.color_
  type drawing = typingsSlinky.dojo.dojox.drawing_
  type dtl = typingsSlinky.dojo.dojox.dtl_
  type flash = typingsSlinky.dojo.dojox.flash_
  type fx = typingsSlinky.dojo.dojox.fx_
  type gfx = typingsSlinky.dojo.dojox.gfx_
  type gfx3d = typingsSlinky.dojo.dojox.gfx3d_
  type highlight = typingsSlinky.dojo.dojox.highlight_
  type html = typingsSlinky.dojo.dojox.html_
  type image = typingsSlinky.dojo.dojox.image_
  type main = typingsSlinky.dojo.dojox.main_
  type math = typingsSlinky.dojo.dojox.math_
  type mobile = typingsSlinky.dojo.dojox.mobile_
  type mvc = typingsSlinky.dojo.dojox.mvc_
  type sketch = typingsSlinky.dojo.dojox.sketch_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/socket.html
    *
    * Provides a simple socket connection using WebSocket, or alternate
    * communication mechanisms in legacy browsers for comet-style communication. This is based
    * on the WebSocket API and returns an object that implements the WebSocket interface:
    * http://dev.w3.org/html5/websockets/#websocket
    * Provides socket connections. This can be used with virtually any Comet protocol.
    *
    * @param argsOrUrl This uses the same arguments as the other I/O functions in Dojo, or aURL to connect to. The URL should be a relative URL in order to properlywork with WebSockets (it can still be host relative, like //other-site.org/endpoint)
    */
  type socket = js.Function1[/* argsOrUrl */ js.Object, scala.Unit]
  type sql = typingsSlinky.dojo.dojox.sql_
  type timing = typingsSlinky.dojo.dojox.timing_
  type uuid = typingsSlinky.dojo.dojox.uuid_
  type validate = typingsSlinky.dojo.dojox.validate_
}
