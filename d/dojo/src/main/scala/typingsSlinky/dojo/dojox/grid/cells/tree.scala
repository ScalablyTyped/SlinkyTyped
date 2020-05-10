package typingsSlinky.dojo.dojox.grid.cells

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/tree.html
  *
  *
  */
@js.native
trait tree extends js.Object {
  /**
    *
    * @param inItem
    * @param level
    * @param inRowIndexes
    */
  def formatAggregate(inItem: js.Any, level: js.Any, inRowIndexes: js.Any): js.Any = js.native
  /**
    *
    * @param inRowIndexes
    * @param inItem
    * @param level
    * @param summaryRow
    * @param toggleClass
    * @param cellClasses
    */
  def formatAtLevel(
    inRowIndexes: js.Any,
    inItem: js.Any,
    level: js.Any,
    summaryRow: js.Any,
    toggleClass: js.Any,
    cellClasses: js.Any
  ): String = js.native
  /**
    *
    * @param inRowIndexes
    * @param inItem
    */
  def formatIndexes(inRowIndexes: js.Any, inItem: js.Any): js.Any = js.native
  /**
    *
    * @param itemId
    */
  def getOpenState(itemId: js.Any): js.Any = js.native
}

object tree {
  @scala.inline
  def apply(
    formatAggregate: (js.Any, js.Any, js.Any) => js.Any,
    formatAtLevel: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => String,
    formatIndexes: (js.Any, js.Any) => js.Any,
    getOpenState: js.Any => js.Any
  ): tree = {
    val __obj = js.Dynamic.literal(formatAggregate = js.Any.fromFunction3(formatAggregate), formatAtLevel = js.Any.fromFunction6(formatAtLevel), formatIndexes = js.Any.fromFunction2(formatIndexes), getOpenState = js.Any.fromFunction1(getOpenState))
    __obj.asInstanceOf[tree]
  }
  @scala.inline
  implicit class treeOps[Self <: tree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatAggregate(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatAggregate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatAtLevel(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatAtLevel")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withFormatIndexes(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatIndexes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetOpenState(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

