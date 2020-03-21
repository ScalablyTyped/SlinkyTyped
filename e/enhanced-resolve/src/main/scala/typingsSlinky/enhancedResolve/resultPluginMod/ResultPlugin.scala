package typingsSlinky.enhancedResolve.resultPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPlugin extends js.Object {
  var source: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit
}

object ResultPlugin {
  @scala.inline
  def apply(apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit, source: String): ResultPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultPlugin]
  }
}

