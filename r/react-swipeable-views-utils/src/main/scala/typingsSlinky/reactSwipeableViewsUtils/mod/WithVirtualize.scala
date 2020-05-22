package typingsSlinky.reactSwipeableViewsUtils.mod

import slinky.core.TagMod
import typingsSlinky.reactSwipeableViews.mod.OnChangeIndexCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithVirtualize extends js.Object {
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  def slideRenderer(render: SlideRendererCallback): TagMod[Any]
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
}

