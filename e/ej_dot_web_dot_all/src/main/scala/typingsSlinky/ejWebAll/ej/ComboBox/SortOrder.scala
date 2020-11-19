package typingsSlinky.ejWebAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOrder extends js.Object
@JSGlobal("ej.ComboBox.SortOrder")
@js.native
object SortOrder extends js.Object {
  
  ///The data source is sorting with ascending order.
  @js.native
  sealed trait Ascending extends SortOrder
  
  ///The data source is sorting with descending order.
  @js.native
  sealed trait Descending extends SortOrder
  
  ///The data source is not sorting.
  @js.native
  sealed trait None extends SortOrder
}
