package typingsSlinky.emberOrderedSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/ordered-set", JSImport.Default)
  @js.native
  class default[T] () extends OrderedSet[T]
  /* static members */
  object default {
    
    // Disable this to let users call like `OrderedSet.create<string>();`. This
    // is a rare case where it's preferable, because it's *much* briefer than
    // `let set: OrderedSet<string> = OrderedSet.create();`. If TS could infer
    // from usage what the type would be, this wouldn't be required, but until
    // it does, this is better than *not* allowing it.
    // tslint:disable-next-line:no-unnecessary-generics
    @JSImport("@ember/ordered-set", "default.create")
    @js.native
    def create[T](): OrderedSet[T] = js.native
  }
  
  @js.native
  trait OrderedSet[T] extends StObject {
    
    def add(value: T): this.type = js.native
    
    def clear(): Unit = js.native
    
    def copy(): OrderedSet[T] = js.native
    
    def delete(value: T): Boolean = js.native
    
    def forEach(
      callbackfn: js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ T, 
          /* value2 */ T, 
          /* set */ OrderedSet[T], 
          Unit
        ]
    ): Unit = js.native
    def forEach[Ctx](
      callbackfn: js.ThisFunction3[/* this */ Ctx, /* value */ T, /* value2 */ T, /* set */ OrderedSet[T], Unit],
      context: Ctx
    ): Unit = js.native
    
    def has(value: T): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def toArray(): js.Array[T] = js.native
  }
}
