package typingsSlinky.plottable.anon

import typingsSlinky.plottable.stackingUtilsMod.StackExtent
import typingsSlinky.plottable.utilsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumExtents[D] extends js.Object {
  var maximumExtents: Map[String | Double, StackExtent[D]]
  var minimumExtents: Map[String | Double, StackExtent[D]]
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
}

