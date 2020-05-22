package typingsSlinky.rcTable.components

import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.tableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rc-table/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[RecordType <: DefaultRecordType](p: TableProps[RecordType]): SharedBuilder_TableProps1251172539[RecordType] = new SharedBuilder_TableProps1251172539[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[RecordType <: DefaultRecordType](): SharedBuilder_TableProps1251172539[RecordType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TableProps1251172539[RecordType](js.Array(this.component, __props.asInstanceOf[TableProps[RecordType]]))
  }
  implicit def make[RecordType <: DefaultRecordType](companion: Lib.type): SharedBuilder_TableProps1251172539[RecordType] = new SharedBuilder_TableProps1251172539[RecordType](js.Array(this.component, js.Dictionary.empty))()
}

