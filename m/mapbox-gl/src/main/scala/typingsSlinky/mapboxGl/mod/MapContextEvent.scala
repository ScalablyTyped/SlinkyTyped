package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.webglcontextlost
import typingsSlinky.mapboxGl.mapboxGlStrings.webglcontextrestored
import typingsSlinky.std.WebGLContextEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextEvent extends MapboxEvent[WebGLContextEvent] {
  @JSName("type")
  var type_MapContextEvent: webglcontextlost | webglcontextrestored = js.native
}

