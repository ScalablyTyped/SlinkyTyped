package typingsSlinky.prosemirrorTables.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableNodesOptions extends js.Object {
  var cellAttributes: StringDictionary[CellAttributes] = js.native
  var cellContent: String = js.native
  var tableGroup: js.UndefOr[String] = js.native
}

object TableNodesOptions {
  @scala.inline
  def apply(cellAttributes: StringDictionary[CellAttributes], cellContent: String): TableNodesOptions = {
    val __obj = js.Dynamic.literal(cellAttributes = cellAttributes.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNodesOptions]
  }
  @scala.inline
  implicit class TableNodesOptionsOps[Self <: TableNodesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellAttributes(value: StringDictionary[CellAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableGroup")(js.undefined)
        ret
    }
  }
  
}

