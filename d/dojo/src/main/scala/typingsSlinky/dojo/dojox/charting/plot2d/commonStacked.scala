package typingsSlinky.dojo.dojox.charting.plot2d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/commonStacked.html
  *
  *
  */
@js.native
trait commonStacked extends js.Object {
  /**
    *
    * @param series
    */
  def collectStats(series: js.Any): js.Any = js.native
  /**
    *
    * @param series
    * @param i
    * @param index
    */
  def getIndexValue(series: js.Any, i: js.Any, index: js.Any): js.Array[_] = js.native
  /**
    *
    * @param series
    * @param i
    * @param x
    */
  def getValue(series: js.Any, i: js.Any, x: js.Any): js.Array[_] = js.native
}

object commonStacked {
  @scala.inline
  def apply(
    collectStats: js.Any => js.Any,
    getIndexValue: (js.Any, js.Any, js.Any) => js.Array[_],
    getValue: (js.Any, js.Any, js.Any) => js.Array[_]
  ): commonStacked = {
    val __obj = js.Dynamic.literal(collectStats = js.Any.fromFunction1(collectStats), getIndexValue = js.Any.fromFunction3(getIndexValue), getValue = js.Any.fromFunction3(getValue))
    __obj.asInstanceOf[commonStacked]
  }
  @scala.inline
  implicit class commonStackedOps[Self <: commonStacked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectStats(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectStats")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIndexValue(value: (js.Any, js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetValue(value: (js.Any, js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

