package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("ow/dist/source/predicates/boolean", "BooleanPredicate")
  @js.native
  /**
    @hidden
    */
  class BooleanPredicate () extends Predicate[Boolean] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a boolean to be false.
      */
    def `false`: this.type = js.native
    
    /**
      Test a boolean to be true.
      */
    def `true`: this.type = js.native
  }
}
