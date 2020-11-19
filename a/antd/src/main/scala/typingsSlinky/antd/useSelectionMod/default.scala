package typingsSlinky.antd.useSelectionMod

import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.TableRowSelection
import typingsSlinky.antd.tableInterfaceMod.TransformColumns
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/table/hooks/useSelection", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[RecordType](rowSelection: js.UndefOr[scala.Nothing], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = js.native
  def apply[RecordType](rowSelection: TableRowSelection[RecordType], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = js.native
}
