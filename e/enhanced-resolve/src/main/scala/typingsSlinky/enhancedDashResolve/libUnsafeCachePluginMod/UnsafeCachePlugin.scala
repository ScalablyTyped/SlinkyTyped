package typingsSlinky.enhancedDashResolve.libUnsafeCachePluginMod

import typingsSlinky.enhancedDashResolve.libCommonDashTypesMod.ResolverRequest
import typingsSlinky.enhancedDashResolve.libConcordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsafeCachePlugin extends js.Object {
  var cache: Dictionary[_]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedDashResolve.libResolverMod.^): Unit
  def filterPredicate(request: ResolverRequest): Boolean
}

object UnsafeCachePlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedDashResolve.libResolverMod.^ => Unit,
    cache: Dictionary[_],
    filterPredicate: ResolverRequest => Boolean,
    source: String,
    target: String
  ): UnsafeCachePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), cache = cache.asInstanceOf[js.Any], filterPredicate = js.Any.fromFunction1(filterPredicate), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsafeCachePlugin]
  }
}

