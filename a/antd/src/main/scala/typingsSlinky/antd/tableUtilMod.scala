package typingsSlinky.antd

import typingsSlinky.antd.tableInterfaceMod.ColumnTitle
import typingsSlinky.antd.tableInterfaceMod.ColumnTitleProps
import typingsSlinky.antd.tableInterfaceMod.ColumnType
import typingsSlinky.antd.tableInterfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/util", JSImport.Namespace)
@js.native
object tableUtilMod extends js.Object {
  def getColumnKey[RecordType](column: ColumnType[RecordType], defaultKey: String): Key = js.native
  def getColumnPos(index: Double): String = js.native
  def getColumnPos(index: Double, pos: String): String = js.native
  def renderColumnTitle[RecordType](title: ColumnTitle[RecordType], props: ColumnTitleProps[RecordType]): js.Any = js.native
}

