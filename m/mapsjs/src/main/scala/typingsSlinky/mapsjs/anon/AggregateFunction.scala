package typingsSlinky.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateFunction extends js.Object {
  var aggregateFunction: js.UndefOr[
    js.Function3[/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any, Unit]
  ] = js.native
  var data: js.Array[js.Object] = js.native
  var mapUnitsPerPixel: Double = js.native
  var marginPixels: js.UndefOr[Double] = js.native
  var pointKey: String = js.native
  var valueFunction: js.UndefOr[js.Function1[/* row */ js.Any, Double]] = js.native
  def radiusFunction(row: js.Any): Double = js.native
}

object AggregateFunction {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    mapUnitsPerPixel: Double,
    pointKey: String,
    radiusFunction: js.Any => Double
  ): AggregateFunction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], pointKey = pointKey.asInstanceOf[js.Any], radiusFunction = js.Any.fromFunction1(radiusFunction))
    __obj.asInstanceOf[AggregateFunction]
  }
  @scala.inline
  implicit class AggregateFunctionOps[Self <: AggregateFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapUnitsPerPixel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapUnitsPerPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusFunction(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggregateFunction(value: (/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAggregateFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFunction(value: /* row */ js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValueFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFunction")(js.undefined)
        ret
    }
  }
  
}

