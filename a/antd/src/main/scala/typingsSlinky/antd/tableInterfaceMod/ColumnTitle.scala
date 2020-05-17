package typingsSlinky.antd.tableInterfaceMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - js.Function1[
/ * props * / typingsSlinky.antd.tableInterfaceMod.ColumnTitleProps[RecordType], 
typingsSlinky.react.mod.ReactNode]
*/
trait ColumnTitle[RecordType] extends js.Object

object ColumnTitle {
  @scala.inline
  implicit def apply[RecordType](value: js.Function1[/* props */ ColumnTitleProps[RecordType], TagMod[Any]]): ColumnTitle[RecordType] = value.asInstanceOf[ColumnTitle[RecordType]]
  @scala.inline
  implicit def apply[RecordType](value: TagMod[Any]): ColumnTitle[RecordType] = value.asInstanceOf[ColumnTitle[RecordType]]
}

