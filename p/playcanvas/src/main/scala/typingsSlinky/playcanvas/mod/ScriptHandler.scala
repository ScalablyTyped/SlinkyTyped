package typingsSlinky.playcanvas.mod

import typingsSlinky.playcanvas.pc.ResourceHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler for loading JavaScript files dynamically
  Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
  or regular JavaScript files, such as third-party libraries.
  * @param app - The running {@link pc.Application}.
  */
@JSImport("playcanvas", "ScriptHandler")
@js.native
class ScriptHandler protected () extends ResourceHandler {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}
