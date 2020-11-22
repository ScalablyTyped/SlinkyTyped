package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/date", JSImport.Namespace)
@js.native
object dateMod extends js.Object {
  
  @js.native
  /**
    @hidden
    */
  class DatePredicate ()
    extends Predicate[js.Date] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a date to be before another date.
      @param date - Minimum value.
      */
    def after(date: js.Date): this.type = js.native
    
    /**
      Test a date to be before another date.
      @param date - Maximum value.
      */
    def before(date: js.Date): this.type = js.native
  }
}
