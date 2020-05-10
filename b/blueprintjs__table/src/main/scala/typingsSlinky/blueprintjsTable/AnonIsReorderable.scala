package typingsSlinky.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsReorderable extends js.Object {
  var isReorderable: Boolean = js.native
  var isResizable: Boolean = js.native
  var loading: Boolean = js.native
}

object AnonIsReorderable {
  @scala.inline
  def apply(isReorderable: Boolean, isResizable: Boolean, loading: Boolean): AnonIsReorderable = {
    val __obj = js.Dynamic.literal(isReorderable = isReorderable.asInstanceOf[js.Any], isResizable = isResizable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsReorderable]
  }
  @scala.inline
  implicit class AnonIsReorderableOps[Self <: AnonIsReorderable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsReorderable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReorderable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

