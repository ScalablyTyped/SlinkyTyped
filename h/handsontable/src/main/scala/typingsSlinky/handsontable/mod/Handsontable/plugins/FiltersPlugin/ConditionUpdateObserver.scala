package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionUpdateObserver extends js.Object {
  var changes: js.Array[Double] = js.native
  var conditionCollection: ConditionCollection = js.native
  var grouping: Boolean = js.native
  var latestEditedColumnPosition: Double = js.native
  var latestOrderStack: js.Array[Double] = js.native
  def columnDataFactory(column: Double): js.Array[js.Object] = js.native
  def destroy(): Unit = js.native
  def flush(): Unit = js.native
  def groupChanges(): Unit = js.native
  def updateStatesAtColumn(column: Double, conditionArgsChange: js.Object): Unit = js.native
}

object ConditionUpdateObserver {
  @scala.inline
  def apply(
    changes: js.Array[Double],
    columnDataFactory: Double => js.Array[js.Object],
    conditionCollection: ConditionCollection,
    destroy: () => Unit,
    flush: () => Unit,
    groupChanges: () => Unit,
    grouping: Boolean,
    latestEditedColumnPosition: Double,
    latestOrderStack: js.Array[Double],
    updateStatesAtColumn: (Double, js.Object) => Unit
  ): ConditionUpdateObserver = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], columnDataFactory = js.Any.fromFunction1(columnDataFactory), conditionCollection = conditionCollection.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), groupChanges = js.Any.fromFunction0(groupChanges), grouping = grouping.asInstanceOf[js.Any], latestEditedColumnPosition = latestEditedColumnPosition.asInstanceOf[js.Any], latestOrderStack = latestOrderStack.asInstanceOf[js.Any], updateStatesAtColumn = js.Any.fromFunction2(updateStatesAtColumn))
    __obj.asInstanceOf[ConditionUpdateObserver]
  }
  @scala.inline
  implicit class ConditionUpdateObserverOps[Self <: ConditionUpdateObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnDataFactory(value: Double => js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDataFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConditionCollection(value: ConditionCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroupChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestEditedColumnPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestEditedColumnPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestOrderStack(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestOrderStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateStatesAtColumn(value: (Double, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStatesAtColumn")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

