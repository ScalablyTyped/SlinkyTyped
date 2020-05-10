package typingsSlinky.highchartsReactOfficial.highchartsReactMod.HighchartsReact

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.highcharts.mod.ChartCallbackFunction
import typingsSlinky.highcharts.mod.Chart_
import typingsSlinky.highcharts.mod.Options
import typingsSlinky.highchartsReactOfficial.TypeofHighcharts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties for a Highcharts component
  */
@js.native
trait Props
  extends /* *
  *
  *  Properties
  *
  * */
/**
  * Indexer for custom properties
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Flag for `Chart.update` call (Default: true)
    */
  var allowChartUpdate: js.UndefOr[Boolean] = js.native
  /* *
    *
    *  Functions
    *
    * */
  /**
    * Callback for the chart factory
    */
  var callback: js.UndefOr[ChartCallbackFunction] = js.native
  /**
    * Reference to the chart factory (Default: chart)
    */
  var constructorType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78 */ js.Any
  ] = js.native
  /**
    * Properties of the chart container
    */
  var containerProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Highcharts namespace
    */
  var highcharts: js.UndefOr[TypeofHighcharts] = js.native
  /**
    * Immutably recreates the chart on receiving new props
    */
  var immutable: js.UndefOr[Boolean] = js.native
  /**
    * Highcharts options
    */
  var options: js.UndefOr[Options] = js.native
  /**
    * Flags for `Chart.update` call: redraw, oneToOne, and animation. (Default:
    * [true, true, true])
    */
  var updateArgs: js.UndefOr[
    js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])
  ] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowChartUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowChartUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowChartUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowChartUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: /* chart */ Chart_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withConstructorType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstructorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructorType")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHighcharts(value: TypeofHighcharts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highcharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighcharts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highcharts")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateArgs(value: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateArgs")(js.undefined)
        ret
    }
  }
  
}

