package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.anon.DisableHeight
import typingsSlinky.reactVirtualized.esAutoSizerMod.AutoSizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoSizerMod {
  
  @JSImport("react-virtualized/dist/commonjs/AutoSizer", "AutoSizer")
  @js.native
  class AutoSizer protected ()
    extends typingsSlinky.reactVirtualized.esAutoSizerMod.AutoSizer {
    def this(props: AutoSizerProps) = this()
  }
  /* static members */
  object AutoSizer {
    
    @JSImport("react-virtualized/dist/commonjs/AutoSizer", "AutoSizer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/AutoSizer", "AutoSizer.defaultProps")
    @js.native
    def defaultProps: DisableHeight = js.native
    @scala.inline
    def defaultProps_=(x: DisableHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
