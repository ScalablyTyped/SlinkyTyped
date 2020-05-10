package typingsSlinky.reactSplitterLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterLayoutProps extends js.Object {
  /**
    * Custom CSS class name applied to the layout div.
    * You can use this to customize layout style.
    * Refers to the original stylesheet to see what you can customize.
    */
  var customClassName: js.UndefOr[String] = js.native
  /**
    * Called when dragging finishes.
    *
    * No parameter will be passed to event handlers.
    */
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when dragging is started.
    *
    * No parameter will be passed to event handlers.
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the size of secondary pane is changed.
    *
    * Event handlers will be passed with a single parameter of number type representing
    * new size of secondary pane.
    * When percentage is set to false, the value is in pixel size.
    * When percentage is set to true, the value is in percentage.
    */
  var onSecondaryPaneSizeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Determine whether the width of each pane should be calculated in percentage or by pixels.
    * The default value is false, which means width is calculated in pixels.
    *
    * @default false
    */
  var percentage: js.UndefOr[Boolean] = js.native
  /**
    * Index of the primary pane.
    * Since SplitterLayout supports at most 2 children, only 0 or 1 is allowed.
    *
    * A primary pane is used to show users primary content, while a secondary pane is the other pane.
    * When window size changes and percentage is set to false, primary pane's size is flexible
    * and secondary pane's size is kept unchanged. However, when the window size is not enough
    * for showing both minimal primary pane and minimal secondary pane,
    * the primary pane's size is served first.
    *
    * @default 0
    */
  var primaryIndex: js.UndefOr[TPrimaryIndex] = js.native
  /**
    * Minimal size of primary pane.
    * When percentage is set to false, this value is pixel size (25 means 25px).
    * When percentage is set to true, this value is percentage (25 means 25%).
    *
    * @default 0
    */
  var primaryMinSize: js.UndefOr[Double] = js.native
  /**
    * Initial size of secondary pane when page loads.
    * If this prop is not defined, SplitterLayout tries to split the layout with equal sizes.
    * (Note: equal size may not apply when there are nested layouts.)
    *
    * @default undefined
    */
  var secondaryInitialSize: js.UndefOr[Double] = js.native
  /**
    * Minimal size of secondary pane.
    */
  var secondaryMinSize: js.UndefOr[Double] = js.native
  /**
    * Determine whether the layout should be a horizontal split or a vertical split.
    *
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object SplitterLayoutProps {
  @scala.inline
  def apply(): SplitterLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterLayoutProps]
  }
  @scala.inline
  implicit class SplitterLayoutPropsOps[Self <: SplitterLayoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSecondaryPaneSizeChange(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSecondaryPaneSizeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSecondaryPaneSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSecondaryPaneSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryIndex(value: TPrimaryIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryMinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryInitialSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryInitialSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryInitialSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryInitialSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryMinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

