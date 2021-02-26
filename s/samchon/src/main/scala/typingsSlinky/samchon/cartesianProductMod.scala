package typingsSlinky.samchon

import typingsSlinky.samchon.icasegeneratorMod.ICaseGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartesianProductMod {
  
  @JSImport("samchon/library/case_generators/CartesianProduct", "CartesianProduct")
  @js.native
  class CartesianProduct protected () extends ICaseGenerator {
    /**
      * Initializer Constructor.
      *
      * @param digits Max number (size) of each digit.
      */
    def this(digits: Double*) = this()
    
    /**
      * Get digits, Max number (size) of each digit.
      */
    def digits(): js.Array[Double] = js.native
    
    /**
      * @hidden
      */
    var digits_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var dividers_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
  }
}
