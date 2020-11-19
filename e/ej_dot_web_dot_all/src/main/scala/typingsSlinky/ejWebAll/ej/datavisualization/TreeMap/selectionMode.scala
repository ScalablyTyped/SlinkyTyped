package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait selectionMode extends js.Object
@JSGlobal("ej.datavisualization.TreeMap.selectionMode")
@js.native
object selectionMode extends js.Object {
  
  //specifies the default mode
  @js.native
  sealed trait Default extends selectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple extends selectionMode
}
