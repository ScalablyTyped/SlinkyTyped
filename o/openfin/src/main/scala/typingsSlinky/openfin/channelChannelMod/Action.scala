package typingsSlinky.openfin.channelChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[js.Any]
  - js.Function1[/ * payload * / js.Any, js.Any]
  - js.Function2[
/ * payload * / js.Any, 
/ * id * / typingsSlinky.openfin.channelChannelMod.ProviderIdentity, 
js.Any]
*/
trait Action extends js.Object

object Action {
  @scala.inline
  implicit def apply(value: js.Function0[js.Any]): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: js.Function1[/* payload */ js.Any, js.Any]): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: js.Function2[/* payload */ js.Any, /* id */ ProviderIdentity, js.Any]): Action = value.asInstanceOf[Action]
}

