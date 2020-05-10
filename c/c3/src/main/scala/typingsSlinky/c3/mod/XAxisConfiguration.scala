package typingsSlinky.c3.mod

import typingsSlinky.c3.c3Strings.category
import typingsSlinky.c3.c3Strings.indexed
import typingsSlinky.c3.c3Strings.timeseries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxisConfiguration extends AxisConfiguration {
  /**
    * Set category names on category axis.
    * This must be an array that includes category names in string. If category names are included in the date by `data.x` option, this is not required.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set default extent for subchart and zoom. This can be an array or function that returns an array.
    */
  var extent: js.UndefOr[js.Array[Double] | js.Function0[js.Array[Double]]] = js.native
  /**
    * Set height of x axis.
    * The height of x axis can be set manually by this option. If you need more space for x axis, please use this option for that. The unit is pixel.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Set how to treat the timezone of x values.
    * If `true` (default), treat x value as localtime. If `false`, convert to UTC internally.
    */
  var localtime: js.UndefOr[Boolean] = js.native
  var selection: js.UndefOr[js.Any] = js.native
  var tick: js.UndefOr[XTickConfiguration] = js.native
  /**
    * Set type of x axis.
    * Defaults to `"indexed"`.
    */
  var `type`: js.UndefOr[timeseries | category | indexed] = js.native
}

object XAxisConfiguration {
  @scala.inline
  def apply(): XAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisConfiguration]
  }
  @scala.inline
  implicit class XAxisConfigurationOps[Self <: XAxisConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withExtentFunction0(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtent(value: js.Array[Double] | js.Function0[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaltime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaltime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localtime")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withTick(value: XTickConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: timeseries | category | indexed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

