package typingsSlinky.cswDashAasDashJs.distComponentsContextAuthContextProviderMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextProps extends js.Object {
  var children: TagMod[Any]
  var config: AuthContextConfig
}

object AuthContextProps {
  @scala.inline
  def apply(children: TagMod[Any], config: AuthContextConfig): AuthContextProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthContextProps]
  }
}

