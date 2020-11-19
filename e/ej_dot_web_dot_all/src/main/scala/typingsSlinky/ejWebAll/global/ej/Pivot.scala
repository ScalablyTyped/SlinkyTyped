package typingsSlinky.ejWebAll.global.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Pivot")
@js.native
object Pivot extends js.Object {
  
  @js.native
  object AnalysisMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode with Double] = js.native
    
    /* 0 */ val OLAP: typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode.OLAP with Double = js.native
    
    /* 1 */ val Pivot: typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode.Pivot with Double = js.native
  }
  
  @js.native
  object OperationalMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Pivot.OperationalMode with Double] = js.native
    
    /* 0 */ val ClientMode: typingsSlinky.ejWebAll.ej.Pivot.OperationalMode.ClientMode with Double = js.native
    
    /* 1 */ val ServerMode: typingsSlinky.ejWebAll.ej.Pivot.OperationalMode.ServerMode with Double = js.native
  }
}
