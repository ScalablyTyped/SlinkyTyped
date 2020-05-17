package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasureList extends js.Object {
  /**
  	 * Returns the caption of the measure list used when displaying the name of the measure list to the user.
  	 *
  	 * @param value
  	 */
  def caption(value: js.Object): String = js.native
  /**
  	 * Returns an array of $.ig.Measure objects this measure list is grouping.
  	 *
  	 * @param value
  	 */
  def measures(value: js.Object): js.Array[_] = js.native
}

object MeasureList {
  @scala.inline
  def apply(caption: js.Object => String, measures: js.Object => js.Array[_]): MeasureList = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), measures = js.Any.fromFunction1(measures))
    __obj.asInstanceOf[MeasureList]
  }
  @scala.inline
  implicit class MeasureListOps[Self <: MeasureList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeasures(value: js.Object => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

