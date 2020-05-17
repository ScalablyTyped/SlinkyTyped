package typingsSlinky.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeterogeneousExpandableList extends js.Object {
  def getChildType(groupPosition: Double, childPosition: Double): Double = js.native
  def getChildTypeCount(): Double = js.native
  def getGroupType(groupPosition: Double): Double = js.native
  def getGroupTypeCount(): Double = js.native
}

object HeterogeneousExpandableList {
  @scala.inline
  def apply(
    getChildType: (Double, Double) => Double,
    getChildTypeCount: () => Double,
    getGroupType: Double => Double,
    getGroupTypeCount: () => Double
  ): HeterogeneousExpandableList = {
    val __obj = js.Dynamic.literal(getChildType = js.Any.fromFunction2(getChildType), getChildTypeCount = js.Any.fromFunction0(getChildTypeCount), getGroupType = js.Any.fromFunction1(getGroupType), getGroupTypeCount = js.Any.fromFunction0(getGroupTypeCount))
    __obj.asInstanceOf[HeterogeneousExpandableList]
  }
  @scala.inline
  implicit class HeterogeneousExpandableListOps[Self <: HeterogeneousExpandableList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetChildType(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetChildTypeCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildTypeCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupType(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGroupTypeCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupTypeCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

