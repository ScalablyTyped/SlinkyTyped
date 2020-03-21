package typingsSlinky.enhancedResolve.concordExtensionsPluginMod

import typingsSlinky.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordExtensionsPlugin extends js.Object {
  var options: Dictionary[_]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit
}

object ConcordExtensionsPlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
    options: Dictionary[_],
    source: String,
    target: String
  ): ConcordExtensionsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConcordExtensionsPlugin]
  }
}

