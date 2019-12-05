package typingsSlinky.enhancedDashResolve.libTryNextPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryNextPlugin extends js.Object {
  var message: String | Null
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedDashResolve.libResolverMod.^): Unit
}

object TryNextPlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedDashResolve.libResolverMod.^ => Unit,
    source: String,
    target: String,
    message: String = null
  ): TryNextPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryNextPlugin]
  }
}

