package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.AnonCh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollableBoxOptions extends ElementOptions {
  /**
    * A option which causes the ignoring of childOffset. This in turn causes the
    * childBase to change every time the element is scrolled.
    */
  var alwaysScroll: js.UndefOr[Boolean] = js.native
  /**
    * A limit to the childBase. Default is Infinity.
    */
  var baseLimit: js.UndefOr[Double] = js.native
  /**
    * Object enabling a scrollbar.
    * Style of the scrollbar track if present (takes regular style options).
    */
  var scrollbar: js.UndefOr[AnonCh] = js.native
}

object ScrollableBoxOptions {
  @scala.inline
  def apply(): ScrollableBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableBoxOptions]
  }
  @scala.inline
  implicit class ScrollableBoxOptionsOps[Self <: ScrollableBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbar(value: AnonCh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(js.undefined)
        ret
    }
  }
  
}

