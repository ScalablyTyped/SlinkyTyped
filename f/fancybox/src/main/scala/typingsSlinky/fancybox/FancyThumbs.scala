package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyThumbs extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.native
  @JSName("$grid")
  var $grid: js.UndefOr[JQuery] = js.native
  @JSName("$list")
  var $list: js.UndefOr[JQuery] = js.native
  var instance: FancyBoxInstance = js.native
  var isActive: Boolean = js.native
  var isVisible: Boolean = js.native
  var opts: FancyThumbsOptions = js.native
  def create(): Unit = js.native
  def focus(duration: Double): Unit = js.native
  def hide(): Unit = js.native
  def init(instance: FancyBoxInstance): Unit = js.native
  def show(): Unit = js.native
  def toggle(): Unit = js.native
  def update(): Unit = js.native
}

object FancyThumbs {
  @scala.inline
  def apply(
    create: () => Unit,
    focus: Double => Unit,
    hide: () => Unit,
    init: FancyBoxInstance => Unit,
    instance: FancyBoxInstance,
    isActive: Boolean,
    isVisible: Boolean,
    opts: FancyThumbsOptions,
    show: () => Unit,
    toggle: () => Unit,
    update: () => Unit
  ): FancyThumbs = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), focus = js.Any.fromFunction1(focus), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction1(init), instance = instance.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[FancyThumbs]
  }
  @scala.inline
  implicit class FancyThumbsOps[Self <: FancyThumbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: FancyBoxInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstance(value: FancyBoxInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: FancyThumbsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with$button(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$button: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$button")(js.undefined)
        ret
    }
    @scala.inline
    def with$grid(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$grid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$grid")(js.undefined)
        ret
    }
    @scala.inline
    def with$list(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$list: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$list")(js.undefined)
        ret
    }
  }
  
}

