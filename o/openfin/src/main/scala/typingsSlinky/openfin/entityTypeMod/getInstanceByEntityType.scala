package typingsSlinky.openfin.entityTypeMod

import typingsSlinky.openfin.frameFrameMod.Frame
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.transportMod.default
import typingsSlinky.openfin.viewViewMod.View
import typingsSlinky.openfin.windowWindowMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/util/entity-type", "getInstanceByEntityType")
@js.native
object getInstanceByEntityType extends js.Object {
  def apply(entityType: String, wire: default, identity: Identity): View | Window | Frame = js.native
}

