package typingsSlinky.rcProgress

import slinky.core.ReactComponentClass
import typingsSlinky.rcProgress.interfaceMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("rc-progress", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-progress", "default.Circle")
    @js.native
    def Circle: ReactComponentClass[ProgressProps] = js.native
    @scala.inline
    def Circle_=(x: ReactComponentClass[ProgressProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress", "default.Line")
    @js.native
    def Line: ReactComponentClass[ProgressProps] = js.native
    @scala.inline
    def Line_=(x: ReactComponentClass[ProgressProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-progress", "Circle")
  @js.native
  val Circle: ReactComponentClass[ProgressProps] = js.native
  
  @JSImport("rc-progress", "Line")
  @js.native
  val Line: ReactComponentClass[ProgressProps] = js.native
}
