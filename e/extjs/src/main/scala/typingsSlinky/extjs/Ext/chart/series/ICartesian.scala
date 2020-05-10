package typingsSlinky.extjs.Ext.chart.series

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICartesian extends ISeries {
  /** [Config Option] (String/String[]) */
  var axis: js.UndefOr[js.Any] = js.native
  /** [Method] Iterates over a given record s values for each of this series s yFields executing a given function for each value
  		* @param record Ext.data.Model
  		* @param fn Function
  		* @param scope Object
  		*/
  var eachYValue: js.UndefOr[
    js.Function3[
      /* record */ js.UndefOr[IModel], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Calculate the min and max values for this series s xField
  		* @returns Array [min, max]
  		*/
  var getMinMaxXValues: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Calculate the min and max values for this series s yField s
  		* @returns Array [min, max]
  		*/
  var getMinMaxYValues: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns an array of functions each of which returns the value of the yField corresponding to function s index in the
  		* @returns Array array of accessor functions
  		*/
  var getYValueAccessors: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the number of yField values taking into account fields combined via legend drag drop
  		* @returns Number
  		*/
  var getYValueCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
  /** [Config Option] (String/String[]) */
  var yField: js.UndefOr[js.Any] = js.native
}

object ICartesian {
  @scala.inline
  def apply(): ICartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesian]
  }
  @scala.inline
  implicit class ICartesianOps[Self <: ICartesian] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withEachYValue(
      value: (/* record */ js.UndefOr[IModel], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachYValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEachYValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachYValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinMaxXValues(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinMaxXValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinMaxXValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinMaxXValues")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinMaxYValues(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinMaxYValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinMaxYValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinMaxYValues")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYValueAccessors(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYValueAccessors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYValueAccessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYValueAccessors")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYValueCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYValueCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYValueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYValueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withXField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(js.undefined)
        ret
    }
    @scala.inline
    def withYField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(js.undefined)
        ret
    }
  }
  
}

