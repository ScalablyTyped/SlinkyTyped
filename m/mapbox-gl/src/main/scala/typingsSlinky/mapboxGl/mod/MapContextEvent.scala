package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.webglcontextlost
import typingsSlinky.mapboxGl.mapboxGlStrings.webglcontextrestored
import typingsSlinky.std.WebGLContextEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContextEvent extends MapboxEvent[WebGLContextEvent] {
  
  @JSName("type")
  var type_MapContextEvent: webglcontextlost | webglcontextrestored = js.native
}
