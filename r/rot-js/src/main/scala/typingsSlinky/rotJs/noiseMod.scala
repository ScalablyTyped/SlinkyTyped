package typingsSlinky.rotJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/noise", JSImport.Namespace)
@js.native
object noiseMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    @js.native
    /**
      * @param gradients Random gradients
      */
    class Simplex ()
      extends typingsSlinky.rotJs.simplexMod.default {
      def this(gradients: Double) = this()
    }
    @js.native
    object Simplex
      extends TopLevel[
              Instantiable1[/* gradients */ js.UndefOr[Double], typingsSlinky.rotJs.simplexMod.default]
            ]
  }
}
