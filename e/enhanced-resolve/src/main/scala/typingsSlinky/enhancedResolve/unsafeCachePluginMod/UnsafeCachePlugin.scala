package typingsSlinky.enhancedResolve.unsafeCachePluginMod

import typingsSlinky.enhancedResolve.commonTypesMod.ResolverRequest
import typingsSlinky.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsafeCachePlugin extends js.Object {
  var cache: Dictionary[_] = js.native
  var source: String = js.native
  var target: String = js.native
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit = js.native
  def filterPredicate(request: ResolverRequest): Boolean = js.native
}

object UnsafeCachePlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
    cache: Dictionary[_],
    filterPredicate: ResolverRequest => Boolean,
    source: String,
    target: String
  ): UnsafeCachePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), cache = cache.asInstanceOf[js.Any], filterPredicate = js.Any.fromFunction1(filterPredicate), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsafeCachePlugin]
  }
  @scala.inline
  implicit class UnsafeCachePluginOps[Self <: UnsafeCachePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: typingsSlinky.enhancedResolve.resolverMod.^ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCache(value: Dictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterPredicate(value: ResolverRequest => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPredicate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

