package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormPosition extends js.Object
@JSGlobal("ej.Kanban.FormPosition")
@js.native
object FormPosition extends js.Object {
  
  ///Form position is bottom.
  @js.native
  sealed trait Bottom extends FormPosition
  
  ///Form position is right.
  @js.native
  sealed trait Right extends FormPosition
}
