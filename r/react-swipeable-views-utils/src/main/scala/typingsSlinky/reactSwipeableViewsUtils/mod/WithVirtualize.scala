package typingsSlinky.reactSwipeableViewsUtils.mod

import slinky.core.TagMod
import typingsSlinky.reactSwipeableViews.mod.OnChangeIndexCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithVirtualize extends js.Object {
  var index: Double = js.native
  var onChangeIndex: OnChangeIndexCallback = js.native
  def slideRenderer(render: SlideRendererCallback): TagMod[Any] = js.native
}

object WithVirtualize {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
    slideRenderer: SlideRendererCallback => TagMod[Any]
  ): WithVirtualize = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex), slideRenderer = js.Any.fromFunction1(slideRenderer))
    __obj.asInstanceOf[WithVirtualize]
  }
  @scala.inline
  implicit class WithVirtualizeOps[Self <: WithVirtualize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSlideRenderer(value: SlideRendererCallback => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideRenderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

