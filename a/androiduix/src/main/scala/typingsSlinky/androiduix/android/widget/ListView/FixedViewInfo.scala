package typingsSlinky.androiduix.android.widget.ListView

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedViewInfo extends js.Object {
  var _ListView_this: typingsSlinky.androiduix.android.widget.ListView = js.native
  var data: js.Any = js.native
  var isSelectable: Boolean = js.native
  var view: View = js.native
}

object FixedViewInfo {
  @scala.inline
  def apply(
    _ListView_this: typingsSlinky.androiduix.android.widget.ListView,
    data: js.Any,
    isSelectable: Boolean,
    view: View
  ): FixedViewInfo = {
    val __obj = js.Dynamic.literal(_ListView_this = _ListView_this.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedViewInfo]
  }
  @scala.inline
  implicit class FixedViewInfoOps[Self <: FixedViewInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_ListView_this(value: typingsSlinky.androiduix.android.widget.ListView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ListView_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

