package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPreview extends js.Object {
  /**
    * List of actions that will appear underneath the preview window.
    * They can be nested for sub actions.
    */
  var actions: js.UndefOr[js.Array[OptionsPreviewAction]] = js.native
  /**
    * You can control if the users gesture will result in pushing
    * the preview screen into the stack.
    */
  var commit: js.UndefOr[Boolean] = js.native
  /**
    * Height of the preview
    */
  var height: js.UndefOr[`100`] = js.native
  /**
    * Pass a react node tag to mark a SourceRect for a specific
    * peek and pop preview element.
    */
  var reactTag: js.UndefOr[Double] = js.native
  /**
    * You can set this property specify the width of the preview.
    * If the width is greater than the device width, it will be zoomed in.
    */
  var width: js.UndefOr[Double] = js.native
}

object OptionsPreview {
  @scala.inline
  def apply(): OptionsPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPreview]
  }
  @scala.inline
  implicit class OptionsPreviewOps[Self <: OptionsPreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[OptionsPreviewAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withReactTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactTag")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

