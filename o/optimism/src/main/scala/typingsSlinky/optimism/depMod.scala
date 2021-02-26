package typingsSlinky.optimism

import typingsSlinky.optimism.anon.Dirty
import typingsSlinky.optimism.anon.Subscribe
import typingsSlinky.optimism.entryMod.AnyEntry
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depMod {
  
  @JSImport("optimism/lib/dep", "dep")
  @js.native
  def dep[TKey](): OptimisticDependencyFunction[TKey] = js.native
  @JSImport("optimism/lib/dep", "dep")
  @js.native
  def dep[TKey](options: Subscribe[TKey]): OptimisticDependencyFunction[TKey] = js.native
  
  /* Inlined std.Set<optimism.optimism/lib/entry.AnyEntry> & {  subscribe :optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe']} & optimism.optimism/lib/helpers.Unsubscribable */
  @js.native
  trait Dep_[TKey] extends StObject {
    
    def add(value: AnyEntry): this.type = js.native
    
    def clear(): Unit = js.native
    
    def delete(value: AnyEntry): Boolean = js.native
    
    /**
      * Returns an iterable of [v,v] pairs for every value `v` in the set.
      */
    def entries(): IterableIterator[js.Tuple2[AnyEntry, AnyEntry]] = js.native
    
    def forEach(
      callbackfn: js.Function3[/* value */ AnyEntry, /* value2 */ AnyEntry, /* set */ Set[AnyEntry], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ AnyEntry, /* value2 */ AnyEntry, /* set */ Set[AnyEntry], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def has(value: AnyEntry): Boolean = js.native
    
    /** Iterates over values in the set. */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[AnyEntry]] = js.native
    
    /**
      * Despite its name, returns an iterable of the values in the set.
      */
    def keys(): IterableIterator[AnyEntry] = js.native
    
    val size: Double = js.native
    
    var subscribe: js.UndefOr[js.Function1[/* args */ js.Array[TKey], Unit | js.Function0[_]]] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
    
    var unsubscribe: js.UndefOr[Unit | js.Function0[_]] = js.native
    
    /**
      * Returns an iterable of values in the set.
      */
    def values(): IterableIterator[AnyEntry] = js.native
  }
  
  type OptimisticDependencyFunction[TKey] = (js.Function1[/* key */ TKey, Unit]) with Dirty[TKey]
}
