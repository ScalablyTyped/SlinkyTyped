package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterOptions extends js.Object {
  var collapse: js.UndefOr[js.Function1[/* e */ SplitterCollapseEvent, Unit]] = js.native
  var contentLoad: js.UndefOr[js.Function1[/* e */ SplitterContentLoadEvent, Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* e */ SplitterErrorEvent, Unit]] = js.native
  var expand: js.UndefOr[js.Function1[/* e */ SplitterExpandEvent, Unit]] = js.native
  var layoutChange: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[String] = js.native
  var panes: js.UndefOr[js.Array[SplitterPane]] = js.native
  var resize: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.native
}

object SplitterOptions {
  @scala.inline
  def apply(): SplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterOptions]
  }
  @scala.inline
  implicit class SplitterOptionsOps[Self <: SplitterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: /* e */ SplitterCollapseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLoad(value: /* e */ SplitterContentLoadEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContentLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* e */ SplitterErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: /* e */ SplitterExpandEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutChange(value: /* e */ SplitterEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutChange")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPanes(value: js.Array[SplitterPane]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* e */ SplitterEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
  }
  
}

