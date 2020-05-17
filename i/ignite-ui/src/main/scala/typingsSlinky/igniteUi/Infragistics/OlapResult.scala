package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapResult extends js.Object {
  /**
  	 * Returns an array of $.ig.OlapResultAxis objects this result is built on.
  	 *
  	 * @param value
  	 */
  def axes(value: js.Object): js.Array[_] = js.native
  /**
  	 * Returns an array of $.ig.OlapResultCell objects which hold the result data.
  	 *
  	 * @param value
  	 */
  def cells(value: js.Object): js.Array[_] = js.native
  /**
  	 * Returns a value indicating whether the result object contains any data.
  	 *
  	 * @param value
  	 */
  def isEmpty(value: js.Object): Boolean = js.native
}

object OlapResult {
  @scala.inline
  def apply(axes: js.Object => js.Array[_], cells: js.Object => js.Array[_], isEmpty: js.Object => Boolean): OlapResult = {
    val __obj = js.Dynamic.literal(axes = js.Any.fromFunction1(axes), cells = js.Any.fromFunction1(cells), isEmpty = js.Any.fromFunction1(isEmpty))
    __obj.asInstanceOf[OlapResult]
  }
  @scala.inline
  implicit class OlapResultOps[Self <: OlapResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Object => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCells(value: js.Object => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

