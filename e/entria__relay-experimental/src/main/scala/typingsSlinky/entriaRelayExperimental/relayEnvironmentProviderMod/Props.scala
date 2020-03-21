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
  def apply(children: TagMod[Any], environment: Environment): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

