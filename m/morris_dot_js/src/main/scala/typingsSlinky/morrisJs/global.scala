package typingsSlinky.morrisJs

import typingsSlinky.morrisJs.morris.MorrisStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Morris")
  @js.native
  def Morris_ : MorrisStatic = js.native
  
  @scala.inline
  def Morris__=(x: MorrisStatic): Unit = js.Dynamic.global.updateDynamic("Morris")(x.asInstanceOf[js.Any])
  
  object morris {
    
    @JSGlobal("morris.DonutChart")
    @js.native
    class DonutChart ()
      extends typingsSlinky.morrisJs.morris.DonutChart
    
    @JSGlobal("morris.GridChart")
    @js.native
    class GridChart ()
      extends typingsSlinky.morrisJs.morris.GridChart
    
    @JSGlobal("morris.MorrisStatic")
    @js.native
    class MorrisStatic ()
      extends typingsSlinky.morrisJs.morris.MorrisStatic
  }
}
