package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapResultCell extends js.Object {
  /**
  	 * Returns the position of the cell when cells are iterated row by row.
  	 *
  	 * @param value
  	 */
  def cellOrdinal(value: js.Object): Double = js.native
  /**
  	 * Returns a key value map of the cell's properties. Currently only 'Value' and 'FmtValue' properties are available.
  	 *
  	 * @param value
  	 */
  def properties(value: js.Object): js.Object = js.native
}

object OlapResultCell {
  @scala.inline
  def apply(cellOrdinal: js.Object => Double, properties: js.Object => js.Object): OlapResultCell = {
    val __obj = js.Dynamic.literal(cellOrdinal = js.Any.fromFunction1(cellOrdinal), properties = js.Any.fromFunction1(properties))
    __obj.asInstanceOf[OlapResultCell]
  }
  @scala.inline
  implicit class OlapResultCellOps[Self <: OlapResultCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellOrdinal(value: js.Object => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellOrdinal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProperties(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

