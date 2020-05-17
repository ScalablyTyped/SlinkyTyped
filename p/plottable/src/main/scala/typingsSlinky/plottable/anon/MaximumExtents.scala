package typingsSlinky.plottable.anon

import typingsSlinky.plottable.stackingUtilsMod.StackExtent
import typingsSlinky.plottable.utilsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumExtents[D] extends js.Object {
  var maximumExtents: Map[String | Double, StackExtent[D]] = js.native
  var minimumExtents: Map[String | Double, StackExtent[D]] = js.native
}

object MaximumExtents {
  @scala.inline
  def apply[D](
    maximumExtents: Map[String | Double, StackExtent[D]],
    minimumExtents: Map[String | Double, StackExtent[D]]
  ): MaximumExtents[D] = {
    val __obj = js.Dynamic.literal(maximumExtents = maximumExtents.asInstanceOf[js.Any], minimumExtents = minimumExtents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumExtents[D]]
  }
  @scala.inline
  implicit class MaximumExtentsOps[Self[d] <: MaximumExtents[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withMaximumExtents(value: Map[String | Double, StackExtent[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumExtents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumExtents(value: Map[String | Double, StackExtent[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumExtents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

