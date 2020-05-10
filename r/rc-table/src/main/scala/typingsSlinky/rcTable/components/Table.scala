package typingsSlinky.rcTable.components

import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.tableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  @JSImport("rc-table/lib/Table", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[RecordType <: DefaultRecordType](p: TableProps[RecordType]): SharedBuilder_TableProps1251172539[RecordType] = new SharedBuilder_TableProps1251172539[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[RecordType <: DefaultRecordType](companion: Table.type): SharedBuilder_TableProps1251172539[RecordType] = new SharedBuilder_TableProps1251172539[RecordType](js.Array(this.component, js.Dictionary.empty))()
}

