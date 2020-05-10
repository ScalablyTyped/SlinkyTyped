package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollableTextOptions extends ScrollableBoxOptions {
  /**
    * Use pre-defined keys (i or enter for insert, e for editor, C-e for editor while inserting).
    */
  var keys: js.UndefOr[String | js.Array[String] | Boolean] = js.native
  /**
    * Whether to enable automatic mouse support for this element.
    * Use pre-defined mouse events (right-click for editor).
    */
  var mouse: js.UndefOr[Boolean | js.Function0[Unit]] = js.native
  /**
    * Use vi keys with the keys option.
    */
  var vi: js.UndefOr[Boolean] = js.native
}

object ScrollableTextOptions {
  @scala.inline
  def apply(): ScrollableTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableTextOptions]
  }
  @scala.inline
  implicit class ScrollableTextOptionsOps[Self <: ScrollableTextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: String | js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMouse(value: Boolean | js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(js.undefined)
        ret
    }
    @scala.inline
    def withVi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vi")(js.undefined)
        ret
    }
  }
  
}

