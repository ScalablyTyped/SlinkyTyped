package typingsSlinky.nodeSqlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableColumnAst extends js.Object {
  var ast: js.Array[AST] | AST = js.native
  var columnsList: js.Array[String] = js.native
  var tableList: js.Array[String] = js.native
}

object TableColumnAst {
  @scala.inline
  def apply(ast: js.Array[AST] | AST, columnsList: js.Array[String], tableList: js.Array[String]): TableColumnAst = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], columnsList = columnsList.asInstanceOf[js.Any], tableList = tableList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnAst]
  }
  @scala.inline
  implicit class TableColumnAstOps[Self <: TableColumnAst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: js.Array[AST] | AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

