package typingsSlinky.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackAnimationOptions extends js.Object {
  /**
    * Configure animations for the bottom tabs
    */
  var bottomTabs: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Configure animations for the content (Screen)
    */
  var content: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Configure animations for the top bar
    */
  var topBar: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Wait for the View to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.native
}

object StackAnimationOptions {
  @scala.inline
  def apply(): StackAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackAnimationOptions]
  }
  @scala.inline
  implicit class StackAnimationOptionsOps[Self <: StackAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomTabs(value: ViewAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: ViewAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBar(value: ViewAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBar")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForRender")(js.undefined)
        ret
    }
  }
  
}

