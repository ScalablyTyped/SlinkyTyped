package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.anon.DisableHeight
import typingsSlinky.reactVirtualized.esAutoSizerMod.AutoSizerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/AutoSizer", JSImport.Namespace)
@js.native
object autoSizerMod extends js.Object {
  
  @js.native
  class AutoSizer protected ()
    extends typingsSlinky.reactVirtualized.esAutoSizerMod.AutoSizer {
    def this(props: AutoSizerProps) = this()
  }
  /* static members */
  @js.native
  object AutoSizer extends js.Object {
    
    var defaultProps: DisableHeight = js.native
  }
}
