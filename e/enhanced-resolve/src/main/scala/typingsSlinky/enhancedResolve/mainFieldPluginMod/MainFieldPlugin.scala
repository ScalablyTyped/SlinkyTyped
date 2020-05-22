package typingsSlinky.enhancedResolve.mainFieldPluginMod

import typingsSlinky.enhancedResolve.anon.ForceRelative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainFieldPlugin extends js.Object {
  var options: ForceRelative
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit
}

object MainFieldPlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
    options: ForceRelative,
    source: String,
    target: String
  ): MainFieldPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainFieldPlugin]
  }
}

