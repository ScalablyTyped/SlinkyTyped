package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/set", JSImport.Namespace)
@js.native
object setMod extends js.Object {
  
  @js.native
  /**
    @hidden
    */
  class SetPredicate[T] () extends Predicate[Set[T]] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a Set to be deeply equal to the provided Set.
      @param expected - Expected Set to match.
      */
    def deepEqual(expected: Set[T]): this.type = js.native
    
    /**
      Test a Set to be empty.
      */
    def empty: this.type = js.native
    
    /**
      Test a Set to include all the provided items. The items are tested by identity, not structure.
      @param items - The items that should be a item in the Set.
      */
    def has(items: T*): this.type = js.native
    
    /**
      Test a Set to include any of the provided items. The items are tested by identity, not structure.
      @param items - The items that could be a item in the Set.
      */
    def hasAny(items: T*): this.type = js.native
    
    /**
      Test a Set to have a maximum size.
      @param size - The maximum size of the Set.
      */
    def maxSize(size: Double): this.type = js.native
    
    /**
      Test a Set to have a minimum size.
      @param size - The minimum size of the Set.
      */
    def minSize(size: Double): this.type = js.native
    
    /**
      Test a Set to be not empty.
      */
    def nonEmpty: this.type = js.native
    
    /**
      Test all the items in the Set to match the provided predicate.
      @param predicate - The predicate that should be applied against every item in the Set.
      */
    def ofType(predicate: Predicate[T]): this.type = js.native
    
    /**
      Test a Set to have a specific size.
      @param size - The size of the Set.
      */
    def size(size: Double): this.type = js.native
  }
}
