package typingsSlinky.dojo.dojox.charting.scaler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/primitive.html
  *
  *
  */
@js.native
trait primitive extends js.Object {
  /**
    *
    * @param min
    * @param max
    * @param span
    * @param kwArgs
    */
  def buildScaler(min: Double, max: Double, span: Double, kwArgs: js.Object): js.Object = js.native
  /**
    *
    * @param scaler
    * @param kwArgs
    */
  def buildTicks(scaler: js.Object, kwArgs: js.Object): js.Object = js.native
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

object primitive {
  @scala.inline
  def apply(
    buildScaler: (Double, Double, Double, js.Object) => js.Object,
    buildTicks: (js.Object, js.Object) => js.Object,
    getTransformerFromModel: js.Object => js.Function,
    getTransformerFromPlot: js.Object => js.Function
  ): primitive = {
    val __obj = js.Dynamic.literal(buildScaler = js.Any.fromFunction4(buildScaler), buildTicks = js.Any.fromFunction2(buildTicks), getTransformerFromModel = js.Any.fromFunction1(getTransformerFromModel), getTransformerFromPlot = js.Any.fromFunction1(getTransformerFromPlot))
    __obj.asInstanceOf[primitive]
  }
  @scala.inline
  implicit class primitiveOps[Self <: primitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildScaler(value: (Double, Double, Double, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildScaler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBuildTicks(value: (js.Object, js.Object) => js.Object): Self = {
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

