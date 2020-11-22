package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import typingsSlinky.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/weak-set", JSImport.Namespace)
@js.native
object weakSetMod extends js.Object {
  
  @js.native
  /**
    @hidden
    */
  class WeakSetPredicate[T /* <: js.Object */] () extends Predicate[WeakSet[T]] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a WeakSet to include all the provided items. The items are tested by identity, not structure.
      @param items - The items that should be a item in the WeakSet.
      */
    def has(items: T*): this.type = js.native
    
    /**
      Test a WeakSet to include any of the provided items. The items are tested by identity, not structure.
      @param items - The items that could be a item in the WeakSet.
      */
    def hasAny(items: T*): this.type = js.native
  }
}
