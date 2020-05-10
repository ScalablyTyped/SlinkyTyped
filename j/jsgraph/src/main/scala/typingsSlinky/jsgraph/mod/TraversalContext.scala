package typingsSlinky.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalContext extends js.Object {
  var colorMap: js.Any = js.native
  var searchStatus: String = js.native
  var undiscoveredMap: js.Any = js.native
}

object TraversalContext {
  @scala.inline
  def apply(colorMap: js.Any, searchStatus: String, undiscoveredMap: js.Any): TraversalContext = {
    val __obj = js.Dynamic.literal(colorMap = colorMap.asInstanceOf[js.Any], searchStatus = searchStatus.asInstanceOf[js.Any], undiscoveredMap = undiscoveredMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalContext]
  }
  @scala.inline
  implicit class TraversalContextOps[Self <: TraversalContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndiscoveredMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undiscoveredMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

