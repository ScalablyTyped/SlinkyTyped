package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressBar extends IComponent {
  /** [Method] Returns true if the progress bar is currently in a wait operation
  		* @returns Boolean True if waiting, else false
  		*/
  var isWaiting: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IProgressBar: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resets the progress bar value to 0 and text to empty string
  		* @param hide Boolean True to hide the progress bar.
  		* @returns Ext.ProgressBar this
  		*/
  var reset: js.UndefOr[js.Function1[/* hide */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var textEl: js.UndefOr[js.Any] = js.native
  /** [Method] Updates the progress bar value and optionally its text
  		* @param value Number A floating point value between 0 and 1 (e.g., .5)
  		* @param text String The string to display in the progress text element
  		* @param animate Boolean Whether to animate the transition of the progress bar. If this value is not specified, the default for the class is used
  		* @returns Ext.ProgressBar this
  		*/
  var updateProgress: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[Double], 
      /* text */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Updates the progress bar text
  		* @param text String The string to display in the progress text element
  		* @returns Ext.ProgressBar this
  		*/
  var updateText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.native
  /** [Method] Initiates an auto updating progress bar
  		* @param config Object Configuration options
  		* @returns Ext.ProgressBar this
  		*/
  @JSName("wait")
  var wait_FIProgressBar: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.native
}

object IProgressBar {
  @scala.inline
  def apply(): IProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressBar]
  }
  @scala.inline
  implicit class IProgressBarOps[Self <: IProgressBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsWaiting(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaiting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: /* hide */ js.UndefOr[Boolean] => IProgressBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEl")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateProgress(
      value: (/* value */ js.UndefOr[Double], /* text */ js.UndefOr[java.lang.String], /* animate */ js.UndefOr[Boolean]) => IProgressBar
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProgress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdateProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateText(value: /* text */ js.UndefOr[java.lang.String] => IProgressBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateText")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: /* config */ js.UndefOr[js.Any] => IProgressBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
  }
  
}

