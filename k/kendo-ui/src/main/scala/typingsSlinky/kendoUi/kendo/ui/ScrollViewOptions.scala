package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollViewOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var bounceVelocityThreshold: js.UndefOr[Double] = js.native
  var change: js.UndefOr[js.Function1[/* e */ ScrollViewChangeEvent, Unit]] = js.native
  var contentHeight: js.UndefOr[Double | String] = js.native
  var dataSource: js.UndefOr[DataSource | js.Any] = js.native
  var duration: js.UndefOr[Double] = js.native
  var emptyTemplate: js.UndefOr[String] = js.native
  var enablePager: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var refresh: js.UndefOr[js.Function1[/* e */ ScrollViewRefreshEvent, Unit]] = js.native
  var template: js.UndefOr[String] = js.native
  var velocityThreshold: js.UndefOr[Double] = js.native
}

object ScrollViewOptions {
  @scala.inline
  def apply(): ScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewOptions]
  }
  @scala.inline
  implicit class ScrollViewOptionsOps[Self <: ScrollViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceVelocityThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceVelocityThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceVelocityThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceVelocityThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ScrollViewChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: DataSource | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePager")(js.undefined)
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
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: /* e */ ScrollViewRefreshEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityThreshold")(js.undefined)
        ret
    }
  }
  
}

