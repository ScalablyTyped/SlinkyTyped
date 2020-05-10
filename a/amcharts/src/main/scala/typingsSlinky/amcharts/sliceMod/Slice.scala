package typingsSlinky.amcharts.sliceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slice extends js.Object {
  /**
    * Opacity of a slice.
    */
  var alpha: Double = js.native
  /**
    * Color of a slice.
    */
  var color: String = js.native
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object = js.native
  /**
    * Slice description.
    */
  var description: String = js.native
  /**
    * Specifies whether the slice is hidden
    */
  var hidden: Boolean = js.native
  /**
    * Percent value of a slice.
    */
  var percents: Double = js.native
  /**
    * Specifies whether the slice is pulled or not.
    */
  var pulled: Boolean = js.native
  /**
    * Slice title
    */
  var title: String = js.native
  /**
    * Url of a slice
    */
  var url: String = js.native
  /**
    * Value of a slice
    */
  var value: Double = js.native
  /**
    * specifies whether this slice has a legend entry
    */
  var visibleInLegend: Boolean = js.native
}

object Slice {
  @scala.inline
  def apply(
    alpha: Double,
    color: String,
    dataContext: js.Object,
    description: String,
    hidden: Boolean,
    percents: Double,
    pulled: Boolean,
    title: String,
    url: String,
    value: Double,
    visibleInLegend: Boolean
  ): Slice = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dataContext = dataContext.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], percents = percents.asInstanceOf[js.Any], pulled = pulled.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visibleInLegend = visibleInLegend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slice]
  }
  @scala.inline
  implicit class SliceOps[Self <: Slice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPulled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInLegend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

