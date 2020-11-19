package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionType extends js.Object
@JSGlobal("ej.datavisualization.Chart.SelectionType")
@js.native
object SelectionType extends js.Object {
  
  //string
  @js.native
  sealed trait Multiple extends SelectionType
  
  //string
  @js.native
  sealed trait Single extends SelectionType
}
