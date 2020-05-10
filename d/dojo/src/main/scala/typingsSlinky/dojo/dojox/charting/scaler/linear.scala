package typingsSlinky.dojo.dojox.charting.scaler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/linear.html
  *
  *
  */
@js.native
trait linear extends js.Object {
  /**
    *
    * @param min
    * @param max
    * @param span
    * @param kwArgs
    * @param delta               Optional
    * @param minorDelta               Optional
    */
  def buildScaler(min: Double, max: Double, span: Double, kwArgs: js.Object, delta: Double, minorDelta: Double): js.Any = js.native
  /**
    *
    * @param scaler
    * @param kwArgs
    */
  def buildTicks(scaler: js.Object, kwArgs: js.Object): js.Any = js.native
  /**
    *
    * @param scaler
    */
  def getTransformerFromModel(scaler: js.Object): js.Function = js.native
  /**
    *
    * @param scaler
    */
  def getTransformerFromPlot(scaler: js.Object): js.Function = js.native
}

object linear {
  @scala.inline
  def apply(
    buildScaler: (Double, Double, Double, js.Object, Double, Double) => js.Any,
    buildTicks: (js.Object, js.Object) => js.Any,
    getTransformerFromModel: js.Object => js.Function,
    getTransformerFromPlot: js.Object => js.Function
  ): linear = {
    val __obj = js.Dynamic.literal(buildScaler = js.Any.fromFunction6(buildScaler), buildTicks = js.Any.fromFunction2(buildTicks), getTransformerFromModel = js.Any.fromFunction1(getTransformerFromModel), getTransformerFromPlot = js.Any.fromFunction1(getTransformerFromPlot))
    __obj.asInstanceOf[linear]
  }
  @scala.inline
  implicit class linearOps[Self <: linear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildScaler(value: (Double, Double, Double, js.Object, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildScaler")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withBuildTicks(value: (js.Object, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildTicks")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTransformerFromModel(value: js.Object => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransformerFromModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTransformerFromPlot(value: js.Object => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransformerFromPlot")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

