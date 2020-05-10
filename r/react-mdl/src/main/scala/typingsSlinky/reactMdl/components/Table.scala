package typingsSlinky.reactMdl.components

import typingsSlinky.reactMdl.mod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  @JSImport("react-mdl", "Table")
  @js.native
  object component extends js.Object
  
  def withProps(p: TableProps): SharedBuilder_TableProps_516167192[typingsSlinky.reactMdl.mod.Table] = new SharedBuilder_TableProps_516167192[typingsSlinky.reactMdl.mod.Table](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(rows: js.Array[_]): SharedBuilder_TableProps_516167192[typingsSlinky.reactMdl.mod.Table] = {
    val __props = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    new SharedBuilder_TableProps_516167192[typingsSlinky.reactMdl.mod.Table](js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
}

