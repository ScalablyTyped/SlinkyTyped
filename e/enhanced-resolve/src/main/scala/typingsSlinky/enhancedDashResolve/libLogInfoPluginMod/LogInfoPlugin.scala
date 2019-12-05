package typingsSlinky.enhancedDashResolve.libLogInfoPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfoPlugin extends js.Object {
  var source: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedDashResolve.libResolverMod.^): Unit
}

object LogInfoPlugin {
  @scala.inline
  def apply(apply: typingsSlinky.enhancedDashResolve.libResolverMod.^ => Unit, source: String): LogInfoPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogInfoPlugin]
  }
}

