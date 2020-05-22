package typingsSlinky.entriaRelayExperimental.relayEnvironmentProviderMod

import slinky.core.TagMod
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var environment: Environment
}

object Props {
  @scala.inline
  def apply(environment: Environment, children: TagMod[Any] = null): Props = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

