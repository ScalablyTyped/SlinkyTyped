package typingsSlinky.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult[Raw] extends js.Object {
  var bounds: BoundsTuple = js.native
  var label: String = js.native
  var raw: Raw = js.native
  var x: String = js.native
  var y: String = js.native
}

object SearchResult {
  @scala.inline
  def apply[Raw](bounds: BoundsTuple, label: String, raw: Raw, x: String, y: String): SearchResult[Raw] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult[Raw]]
  }
  @scala.inline
  implicit class SearchResultOps[Self[raw] <: SearchResult[raw], Raw] (val x: Self[Raw]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Raw] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Raw]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Raw] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Raw] with Other]
    @scala.inline
    def withBounds(value: BoundsTuple): Self[Raw] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[Raw] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: Raw): Self[Raw] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: String): Self[Raw] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: String): Self[Raw] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

