package typingsSlinky.mcustomscrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlwaysTriggerOffsets extends js.Object {
  /**
    * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
    * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
    * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
    */
  var alwaysTriggerOffsets: js.UndefOr[Boolean] = js.native
  /**
    * A function to call right before scrollbar(s) are updated.
    */
  var onBeforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when plugin markup is created.
    */
  var onCreate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
    */
  var onImageLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when scrollbars have initialized
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when content becomes wide enough and horizontal scrollbar is added.
    */
  var onOverflowX: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
    */
  var onOverflowXNone: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when content becomes long enough and vertical scrollbar is added.
    */
  var onOverflowY: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when content becomes short enough and vertical scrollbar is removed.
    */
  var onOverflowYNone: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
    */
  var onScroll: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
    */
  var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
    */
  var onSelectorChange: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
    */
  var onTotalScroll: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
    */
  var onTotalScrollBack: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Set an offset for which the onTotalScrollBack callback is triggered.
    * Its value is in pixels
    */
  var onTotalScrollBackOffset: js.UndefOr[Double] = js.native
  /**
    * Set an offset for which the onTotalScroll callback is triggered.
    * Its value is in pixels.
    */
  var onTotalScrollOffset: js.UndefOr[Double] = js.native
  /**
    * A function to call when scrollbar(s) are updated.
    */
  var onUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * User defined callback function, triggered while scrolling
    */
  var whileScrolling: js.UndefOr[js.Function0[Unit]] = js.native
}

object AlwaysTriggerOffsets {
  @scala.inline
  def apply(): AlwaysTriggerOffsets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysTriggerOffsets]
  }
  @scala.inline
  implicit class AlwaysTriggerOffsetsOps[Self <: AlwaysTriggerOffsets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysTriggerOffsets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysTriggerOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysTriggerOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysTriggerOffsets")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnImageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflowX(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOverflowX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowX")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflowXNone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowXNone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOverflowXNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowXNone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflowY(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOverflowY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowY")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOverflowYNone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowYNone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOverflowYNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOverflowYNone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnScrollStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectorChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectorChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSelectorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectorChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTotalScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTotalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTotalScrollBack(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScrollBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTotalScrollBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScrollBack")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTotalScrollBackOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScrollBackOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTotalScrollBackOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScrollBackOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTotalScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTotalScrollOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTotalScrollOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withWhileScrolling(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whileScrolling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWhileScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whileScrolling")(js.undefined)
        ret
    }
  }
  
}

