package typingsSlinky.oracleOraclejet.ojnboxMod.ojNBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait CountLabelContext extends js.Object {
  var column: String = js.native
  var highlightedNodeCount: Double = js.native
  var nodeCount: Double = js.native
  var row: String = js.native
  var totalNodeCount: Double = js.native
}

object CountLabelContext {
  @scala.inline
  def apply(
    column: String,
    highlightedNodeCount: Double,
    nodeCount: Double,
    row: String,
    totalNodeCount: Double
  ): CountLabelContext = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], highlightedNodeCount = highlightedNodeCount.asInstanceOf[js.Any], nodeCount = nodeCount.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], totalNodeCount = totalNodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountLabelContext]
  }
  @scala.inline
  implicit class CountLabelContextOps[Self <: CountLabelContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

