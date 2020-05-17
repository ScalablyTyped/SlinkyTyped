package typingsSlinky.bizcharts.mod

import typingsSlinky.bizcharts.anon.OffsetX
import typingsSlinky.bizcharts.anon.OffsetY
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetProps
  extends Props[js.Any] {
  var autoSetAxis: js.UndefOr[Boolean] = js.native
  var colTitle: js.UndefOr[OffsetY] = js.native
  var eachView: js.UndefOr[
    js.Function2[/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var fields: js.UndefOr[String | js.Array[_]] = js.native
  var margin: js.UndefOr[Double | js.Array[Double]] = js.native
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  var rowTitle: js.UndefOr[OffsetX] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[FacetType] = js.native
}

object FacetProps {
  @scala.inline
  def apply(): FacetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetProps]
  }
  @scala.inline
  implicit class FacetPropsOps[Self <: FacetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSetAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSetAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSetAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withColTitle(value: OffsetY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withEachView(value: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachView")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEachView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachView")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTitle(value: OffsetX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: FacetType): Self = {
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

