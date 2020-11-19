package typingsSlinky.actionsOnGoogle.surfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "AvailableSurfacesCapabilities")
@js.native
class AvailableSurfacesCapabilities protected () extends js.Object {
  /** @hidden */
  def this(surfaces: js.Array[Surface]) = this()
  
  /**
    * Returns true if user has an available surface which includes all given
    * capabilities. Available surfaces capabilities may exist on surfaces other
    * than that used for an ongoing conversation.
    * @public
    */
  def has(capability: SurfaceCapability): Boolean = js.native
  
  /** @public */
  var surfaces: js.Array[Surface] = js.native
}
