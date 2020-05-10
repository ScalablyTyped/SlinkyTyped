package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesSunburstDataOptions extends js.Object {
  var dataLabels: js.UndefOr[
    SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject]
  ] = js.native
  /**
    * (Highcharts) The name decides the text for a word.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Use this option to build a tree structure. The value should
    * be the id of the point which is the parent. If no points has a matching
    * id, or this option is undefined, then the parent will be set to the root.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Whether to display a slice offset from the center. When a
    * sunburst point is sliced, its children are also offset.
    */
  var sliced: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The value of the point, resulting in a relative area of the
    * point in the sunburst.
    */
  var value: js.UndefOr[Double | Null] = js.native
  /**
    * (Highcharts) The weighting of a word. The weight decides the relative
    * size of a word compared to the rest of the collection.
    */
  var weight: js.UndefOr[Double] = js.native
}

object SeriesSunburstDataOptions {
  @scala.inline
  def apply(): SeriesSunburstDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSunburstDataOptions]
  }
  @scala.inline
  implicit class SeriesSunburstDataOptionsOps[Self <: SeriesSunburstDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLabels(value: SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withSliced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliced")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

