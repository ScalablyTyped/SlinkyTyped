package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowPosition extends js.Object
@JSGlobal("ej.Grid.RowPosition")
@js.native
object RowPosition extends js.Object {
  
  ///Specifies position of add new row as bottom.
  @js.native
  sealed trait Bottom extends RowPosition
  
  ///Specifies position of add new row as top.
  @js.native
  sealed trait Top extends RowPosition
}
