package typingsSlinky.enhancedResolve.modulesInRootPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulesInRootPlugin extends js.Object {
  var path: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit
}

object ModulesInRootPlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
    path: String,
    source: String,
    target: String
  ): ModulesInRootPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModulesInRootPlugin]
  }
}

