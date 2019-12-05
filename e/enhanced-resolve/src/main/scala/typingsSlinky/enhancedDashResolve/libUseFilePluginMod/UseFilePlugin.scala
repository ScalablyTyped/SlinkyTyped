package typingsSlinky.enhancedDashResolve.libUseFilePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseFilePlugin extends js.Object {
  var filename: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedDashResolve.libResolverMod.^): Unit
}

object UseFilePlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedDashResolve.libResolverMod.^ => Unit,
    filename: String,
    source: String,
    target: String
  ): UseFilePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseFilePlugin]
  }
}

