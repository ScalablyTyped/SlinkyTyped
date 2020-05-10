package typingsSlinky.reduxDevtoolsLogMonitor.mod

import typingsSlinky.base16.mod.ColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogMonitorProps extends js.Object {
  /**
    * When true, displays the action object expanded rather than collapsed.
    *
    * @default true
    */
  var expandActionRoot: js.UndefOr[Boolean] = js.native
  /**
    * When true, displays the state object expanded rather than collapsed.
    *
    * @default true
    */
  var expandStateRoot: js.UndefOr[Boolean] = js.native
  /**
    * When true, records the current scroll top every second so it
    * can be restored on refresh. This only has effect when used together
    * with persistState() enhancer from Redux DevTools.
    *
    * @default true
    */
  var preserveScrollTop: js.UndefOr[Boolean] = js.native
  /**
    * A function that selects the slice of the state for DevTools to show.
    *
    * @example state => state.thePart.iCare.about.
    * @default state => state.
    */
  var select: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  /**
    * Either a string referring to one of the themes provided by
    * redux-devtools-themes or a custom object of the same format.
    *
    * @see https://github.com/gaearon/redux-devtools-themes
    */
  var theme: js.UndefOr[String | ColorScheme] = js.native
}

object ILogMonitorProps {
  @scala.inline
  def apply(): ILogMonitorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILogMonitorProps]
  }
  @scala.inline
  implicit class ILogMonitorPropsOps[Self <: ILogMonitorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandActionRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandActionRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandActionRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandActionRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandStateRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandStateRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandStateRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandStateRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveScrollTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* state */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String | ColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

