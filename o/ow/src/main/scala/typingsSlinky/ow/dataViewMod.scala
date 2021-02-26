package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataViewMod {
  
  @JSImport("ow/dist/source/predicates/data-view", "DataViewPredicate")
  @js.native
  /**
    @hidden
    */
  class DataViewPredicate ()
    extends Predicate[js.typedarray.DataView] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a DataView to have a specific byte length.
      @param byteLength - The byte length of the DataView.
      */
    def byteLength(byteLength: Double): this.type = js.native
    
    /**
      Test a DataView to have a minimum byte length.
      @param length - The minimum byte length of the DataView.
      */
    def maxByteLength(byteLength: Double): this.type = js.native
    
    /**
      Test a DataView to have a minimum byte length.
      @param byteLength - The minimum byte length of the DataView.
      */
    def minByteLength(byteLength: Double): this.type = js.native
  }
}
