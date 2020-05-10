package typingsSlinky.heatmapJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseHeatmapConfiguration[V /* <: String */] extends js.Object {
  /**
    * A background color string in form of hexcode, color name, or rgb(a)
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The blur factor that will be applied to all datapoints. The higher the
    * blur factor is, the smoother the gradients will be
    * Default value: 0.85
    */
  var blur: js.UndefOr[Double] = js.native
  /**
    * An object that represents the gradient.
    * Syntax: {[key: number in range [0,1]]: color}
    */
  var gradient: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The maximal opacity the highest value in the heatmap will have. (will be
    * overridden if opacity set)
    * Default value: 0.6
    */
  var maxOpacity: js.UndefOr[Double] = js.native
  /**
    * The minimum opacity the lowest value in the heatmap will have (will be
    * overridden if opacity set)
    */
  var minOpacity: js.UndefOr[Double] = js.native
  /**
    * Pass a callback to receive extrema change updates. Useful for DOM
    * legends.
    */
  var onExtremaChange: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A global opacity for the whole heatmap. This overrides maxOpacity and
    * minOpacity if set
    * Default value: 0.6
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * The radius each datapoint will have (if not specified on the datapoint
    * itself)
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * Scales the radius based on map zoom.
    */
  var scaleRadius: js.UndefOr[Boolean] = js.native
  /**
    * Indicate whether the heatmap should use a global extrema or a local
    * extrema (the maximum and minimum of the currently displayed viewport)
    */
  var useLocalExtrema: js.UndefOr[Boolean] = js.native
  /**
    * The property name of the value/weight in a datapoint
    * Default value: 'value'
    */
  var valueField: js.UndefOr[V] = js.native
}

object BaseHeatmapConfiguration {
  @scala.inline
  def apply[V](): BaseHeatmapConfiguration[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseHeatmapConfiguration[V]]
  }
  @scala.inline
  implicit class BaseHeatmapConfigurationOps[Self[v] <: BaseHeatmapConfiguration[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlur: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withGradient(value: StringDictionary[String]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOpacity(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOpacity: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOpacity(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOpacity: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExtremaChange(value: () => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExtremaChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExtremaChange: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExtremaChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleRadius(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleRadius: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLocalExtrema(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalExtrema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLocalExtrema: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalExtrema")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

