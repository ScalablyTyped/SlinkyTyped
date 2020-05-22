package typingsSlinky.openfin.mainMod

import typingsSlinky.openfin.contextChannelsMod.SystemChannelTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "SystemChannel")
@js.native
class SystemChannel protected ()
  extends typingsSlinky.openfin.contextChannelsMod.SystemChannel {
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  def this(transport: SystemChannelTransport) = this()
}

