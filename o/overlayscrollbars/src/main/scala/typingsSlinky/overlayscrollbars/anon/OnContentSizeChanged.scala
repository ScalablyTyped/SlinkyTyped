package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.BasicEventCallback
import typingsSlinky.overlayscrollbars.mod.DirectionChangedCallback
import typingsSlinky.overlayscrollbars.mod.OverflowAmountChangedCallback
import typingsSlinky.overlayscrollbars.mod.OverflowChangedCallback
import typingsSlinky.overlayscrollbars.mod.ScrollEventCallback
import typingsSlinky.overlayscrollbars.mod.SizeChangedCallback
import typingsSlinky.overlayscrollbars.mod.UpdatedCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnContentSizeChanged extends js.Object {
  var onContentSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.native
  var onDestroyed: js.UndefOr[BasicEventCallback | Null] = js.native
  var onDirectionChanged: js.UndefOr[DirectionChangedCallback | Null] = js.native
  var onHostSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.native
  var onInitializationWithdrawn: js.UndefOr[BasicEventCallback | Null] = js.native
  var onInitialized: js.UndefOr[BasicEventCallback | Null] = js.native
  var onOverflowAmountChanged: js.UndefOr[OverflowAmountChangedCallback | Null] = js.native
  var onOverflowChanged: js.UndefOr[OverflowChangedCallback | Null] = js.native
  var onScroll: js.UndefOr[ScrollEventCallback | Null] = js.native
  var onScrollStart: js.UndefOr[ScrollEventCallback | Null] = js.native
  var onScrollStop: js.UndefOr[ScrollEventCallback | Null] = js.native
  var onUpdated: js.UndefOr[UpdatedCallback | Null] = js.native
}

object OnContentSizeChanged {
  @scala.inline
  def apply(): OnContentSizeChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnContentSizeChanged]
  }
  @scala.inline
  implicit class OnContentSizeChangedOps[Self <: OnContentSizeChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnContentSizeChanged(value: SizeChangedCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnContentSizeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentSizeChangedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChanged")(null)
        ret
    }
    @scala.inline
    def withOnDestroyed(value: BasicEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroyed")(null)
        ret
    }
    @scala.inline
    def withOnDirectionChanged(value: DirectionChangedCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDirectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDirectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDirectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDirectionChangedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDirectionChanged")(null)
        ret
    }
    @scala.inline
    def withOnHostSizeChanged(value: SizeChangedCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHostSizeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHostSizeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHostSizeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHostSizeChangedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHostSizeChanged")(null)
        ret
    }
    @scala.inline
    def withOnInitializationWithdrawn(value: BasicEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitializationWithdrawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInitializationWithdrawn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitializationWithdrawn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitializationWithdrawnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitializationWithdrawn")(null)
        ret
    }
    @scala.inline
    def withOnInitialized(value: BasicEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitializedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(null)
        ret
    }
    @scala.inline
    def withOnOverflowAmountChanged(value: OverflowAmountChangedCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowAmountChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOverflowAmountChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowAmountChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflowAmountChangedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowAmountChanged")(null)
        ret
    }
    @scala.inline
    def withOnOverflowChanged(value: OverflowChangedCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOverflowChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflowChangedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowChanged")(null)
        ret
    }
    @scala.inline
    def withOnScroll(value: ScrollEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(null)
        ret
    }
    @scala.inline
    def withOnScrollStart(value: ScrollEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScrollStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(null)
        ret
    }
    @scala.inline
    def withOnScrollStop(value: ScrollEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScrollStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollStopNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStop")(null)
        ret
    }
    @scala.inline
    def withOnUpdated(value: UpdatedCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdatedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(null)
        ret
    }
  }
  
}

