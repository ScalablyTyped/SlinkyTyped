package typingsSlinky.ngTable.publicInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.ngTable.publicInterfacesMod.ISelectOption]
  - typingsSlinky.ngTable.publicInterfacesMod.ISelectDataFunc
*/
trait SelectData extends js.Object

object SelectData {
  @scala.inline
  implicit def apply(value: js.Array[ISelectOption]): SelectData = value.asInstanceOf[SelectData]
  @scala.inline
  implicit def apply(value: ISelectDataFunc): SelectData = value.asInstanceOf[SelectData]
}

