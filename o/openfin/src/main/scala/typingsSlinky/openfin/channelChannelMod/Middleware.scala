package typingsSlinky.openfin.channelChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[js.Any]
  - js.Function1[/ * action * / java.lang.String, js.Any]
  - js.Function2[/ * action * / java.lang.String, / * payload * / js.Any, js.Any]
  - js.Function3[
/ * action * / java.lang.String, 
/ * payload * / js.Any, 
/ * id * / typingsSlinky.openfin.channelChannelMod.ProviderIdentity, 
js.Any]
*/
trait Middleware extends js.Object

object Middleware {
  @scala.inline
  implicit def apply(value: js.Function0[js.Any]): Middleware = value.asInstanceOf[Middleware]
  @scala.inline
  implicit def apply(value: js.Function1[/* action */ String, js.Any]): Middleware = value.asInstanceOf[Middleware]
  @scala.inline
  implicit def apply(value: js.Function2[/* action */ String, /* payload */ js.Any, js.Any]): Middleware = value.asInstanceOf[Middleware]
  @scala.inline
  implicit def apply(value: js.Function3[/* action */ String, /* payload */ js.Any, /* id */ ProviderIdentity, js.Any]): Middleware = value.asInstanceOf[Middleware]
}

