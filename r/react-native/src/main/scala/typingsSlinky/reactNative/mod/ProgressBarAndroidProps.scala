package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.Horizontal
import typingsSlinky.reactNative.reactNativeStrings.Inverse
import typingsSlinky.reactNative.reactNativeStrings.Large
import typingsSlinky.reactNative.reactNativeStrings.LargeInverse
import typingsSlinky.reactNative.reactNativeStrings.Normal
import typingsSlinky.reactNative.reactNativeStrings.Small
import typingsSlinky.reactNative.reactNativeStrings.SmallInverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarAndroidProps extends ViewProps {
  /**
    * Whether to show the ProgressBar (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.native
  /**
    * Color of the progress bar.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * If the progress bar will show indeterminate progress.
    * Note that this can only be false if styleAttr is Horizontal.
    */
  var indeterminate: js.UndefOr[Boolean] = js.native
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * Style of the ProgressBar. One of:
    Horizontal
    Normal (default)
    Small
    Large
    Inverse
    SmallInverse
    LargeInverse
    */
  var styleAttr: js.UndefOr[Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse] = js.native
}

object ProgressBarAndroidProps {
  @scala.inline
  def apply(): ProgressBarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarAndroidProps]
  }
  @scala.inline
  implicit class ProgressBarAndroidPropsOps[Self <: ProgressBarAndroidProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleAttr(value: Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleAttr")(js.undefined)
        ret
    }
  }
  
}

