package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.webglcontextlost
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.webglcontextrestored
import typingsSlinky.std.WebGLContextEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextEvent extends MapboxEvent[WebGLContextEvent] {
  @JSName("type")
  var type_MapContextEvent: webglcontextlost | webglcontextrestored = js.native
}

