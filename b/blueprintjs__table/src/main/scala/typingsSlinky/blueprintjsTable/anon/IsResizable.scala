package typingsSlinky.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsResizable extends js.Object {
  var isResizable: Boolean = js.native
  var minSize: Double = js.native
}

object IsResizable {
  @scala.inline
  def apply(isResizable: Boolean, minSize: Double): IsResizable = {
    val __obj = js.Dynamic.literal(isResizable = isResizable.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsResizable]
  }
  @scala.inline
  implicit class IsResizableOps[Self <: IsResizable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

