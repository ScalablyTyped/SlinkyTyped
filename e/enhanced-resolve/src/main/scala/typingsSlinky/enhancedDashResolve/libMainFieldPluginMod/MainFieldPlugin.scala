package typingsSlinky.enhancedDashResolve.libMainFieldPluginMod

import typingsSlinky.enhancedDashResolve.Anon_ForceRelative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainFieldPlugin extends js.Object {
  var options: Anon_ForceRelative
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedDashResolve.libResolverMod.^): Unit
}

object MainFieldPlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedDashResolve.libResolverMod.^ => Unit,
    options: Anon_ForceRelative,
    source: String,
    target: String
  ): MainFieldPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MainFieldPlugin]
  }
}

