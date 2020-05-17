package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ElementDxElementModelAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSparklineOptions[T] extends BaseWidgetOptions[T] {
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ ElementDxElementModelAny[T], _]] = js.native
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ ElementDxElementModelAny[T], _]] = js.native
  /** Configures the tooltip. */
  @JSName("tooltip")
  var tooltip_BaseSparklineOptions: js.UndefOr[BaseSparklineTooltip] = js.native
}

object BaseSparklineOptions {
  @scala.inline
  def apply[T](): BaseSparklineOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSparklineOptions[T]]
  }
  @scala.inline
  implicit class BaseSparklineOptionsOps[Self[t] <: BaseSparklineOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnTooltipHidden(value: /* e */ ElementDxElementModelAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipHidden: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipShown(value: /* e */ ElementDxElementModelAny[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipShown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: BaseSparklineTooltip): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

