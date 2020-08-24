package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Load resource data, potentially from remote sources. Caches resource on load to prevent
  * multiple requests. Add ResourceHandlers to handle different types of resources.
  * @param app - The application.
  */
@JSImport("playcanvas", "ResourceLoader")
@js.native
class ResourceLoader protected ()
  extends typingsSlinky.playcanvas.pc.ResourceLoader {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

