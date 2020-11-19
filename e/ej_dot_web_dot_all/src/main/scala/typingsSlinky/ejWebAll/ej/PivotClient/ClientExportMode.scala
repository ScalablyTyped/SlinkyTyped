package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClientExportMode extends js.Object
@JSGlobal("ej.PivotClient.ClientExportMode")
@js.native
object ClientExportMode extends js.Object {
  
  ///Exports both the PivotChart and PivotGrid on exporting.
  @js.native
  sealed trait ChartAndGrid extends ClientExportMode
  
  ///Exports the PivotChart control alone on exporting.
  @js.native
  sealed trait ChartOnly extends ClientExportMode
  
  ///Exports the PivotGrid control alone on exporting.
  @js.native
  sealed trait GridOnly extends ClientExportMode
}
