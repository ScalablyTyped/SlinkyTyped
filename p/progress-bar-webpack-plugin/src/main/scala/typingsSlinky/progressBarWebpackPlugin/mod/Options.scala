package typingsSlinky.progressBarWebpackPlugin.mod

import typingsSlinky.progress.mod.ProgressBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ProgressBarOptions {
  /**
    * optional function to call when the progress bar completes
    */
  @JSName("callback")
  var callback_Options: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * function to display a custom summary
    * (passed build time)
    */
  var customSummary: js.UndefOr[js.Function1[/* summary */ String, Unit]] = js.native
  /**
    * the format of the progress bar
    * @default ':bar'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * option to show summary of time taken
    * @default true
    */
  var summary: js.UndefOr[Boolean] = js.native
  /**
    * custom summary message if summary option is false
    */
  var summaryContent: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(total: Double): Options = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSummary(value: /* summary */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSummary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryContent")(js.undefined)
        ret
    }
  }
  
}

