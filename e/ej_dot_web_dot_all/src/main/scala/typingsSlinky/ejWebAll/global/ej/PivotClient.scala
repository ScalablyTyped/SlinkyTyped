package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotClient")
@js.native
class PivotClient protected ()
  extends typingsSlinky.ejWebAll.ej.PivotClient {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.PivotClient.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.PivotClient.Model) = this()
}
/* static members */
@JSGlobal("ej.PivotClient")
@js.native
object PivotClient extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.PivotClient = js.native
  
  @js.native
  object ClientExportMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotClient.ClientExportMode with Double] = js.native
    
    /* 0 */ val ChartAndGrid: typingsSlinky.ejWebAll.ej.PivotClient.ClientExportMode.ChartAndGrid with Double = js.native
    
    /* 1 */ val ChartOnly: typingsSlinky.ejWebAll.ej.PivotClient.ClientExportMode.ChartOnly with Double = js.native
    
    /* 2 */ val GridOnly: typingsSlinky.ejWebAll.ej.PivotClient.ClientExportMode.GridOnly with Double = js.native
  }
  
  @js.native
  object ControlPlacement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotClient.ControlPlacement with Double] = js.native
    
    /* 0 */ val Tab: typingsSlinky.ejWebAll.ej.PivotClient.ControlPlacement.Tab with Double = js.native
    
    /* 1 */ val Tile: typingsSlinky.ejWebAll.ej.PivotClient.ControlPlacement.Tile with Double = js.native
  }
  
  @js.native
  object DefaultView extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotClient.DefaultView with Double] = js.native
    
    /* 0 */ val Chart: typingsSlinky.ejWebAll.ej.PivotClient.DefaultView.Chart with Double = js.native
    
    /* 1 */ val Grid: typingsSlinky.ejWebAll.ej.PivotClient.DefaultView.Grid with Double = js.native
  }
  
  @js.native
  object DisplayMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotClient.DisplayMode with Double] = js.native
    
    /* 2 */ val ChartAndGrid: typingsSlinky.ejWebAll.ej.PivotClient.DisplayMode.ChartAndGrid with Double = js.native
    
    /* 0 */ val ChartOnly: typingsSlinky.ejWebAll.ej.PivotClient.DisplayMode.ChartOnly with Double = js.native
    
    /* 1 */ val GridOnly: typingsSlinky.ejWebAll.ej.PivotClient.DisplayMode.GridOnly with Double = js.native
  }
}
