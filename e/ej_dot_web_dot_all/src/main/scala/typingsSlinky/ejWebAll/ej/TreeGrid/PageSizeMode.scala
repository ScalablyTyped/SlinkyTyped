package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageSizeMode extends js.Object
@JSGlobal("ej.TreeGrid.PageSizeMode")
@js.native
object PageSizeMode extends js.Object {
  
  ///To count all the parent and child records.
  @js.native
  sealed trait All extends PageSizeMode
  
  ///To count the Zeroth level parent records.
  @js.native
  sealed trait Root extends PageSizeMode
}
