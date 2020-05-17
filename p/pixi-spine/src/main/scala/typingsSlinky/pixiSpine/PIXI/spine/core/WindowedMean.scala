package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowedMean extends js.Object {
  var addedValues: Double = js.native
  var dirty: Boolean = js.native
  var lastValue: Double = js.native
  var mean: Double = js.native
  var values: js.Array[Double] = js.native
  def addValue(value: Double): Unit = js.native
  def getMean(): Double = js.native
  def hasEnoughData(): Boolean = js.native
}

object WindowedMean {
  @scala.inline
  def apply(
    addValue: Double => Unit,
    addedValues: Double,
    dirty: Boolean,
    getMean: () => Double,
    hasEnoughData: () => Boolean,
    lastValue: Double,
    mean: Double,
    values: js.Array[Double]
  ): WindowedMean = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction1(addValue), addedValues = addedValues.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], getMean = js.Any.fromFunction0(getMean), hasEnoughData = js.Any.fromFunction0(hasEnoughData), lastValue = lastValue.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowedMean]
  }
  @scala.inline
  implicit class WindowedMeanOps[Self <: WindowedMean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddedValues(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMean(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasEnoughData(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEnoughData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

