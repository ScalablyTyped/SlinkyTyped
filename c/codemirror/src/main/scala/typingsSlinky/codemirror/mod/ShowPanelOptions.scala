package typingsSlinky.codemirror.mod

import typingsSlinky.codemirror.codemirrorStrings.`after-top`
import typingsSlinky.codemirror.codemirrorStrings.`before-bottom`
import typingsSlinky.codemirror.codemirrorStrings.bottom
import typingsSlinky.codemirror.codemirrorStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowPanelOptions extends js.Object {
  /**The new panel will be added after the given panel. */
  var after: js.UndefOr[Panel] = js.native
  /**The new panel will be added before the given panel. */
  var before: js.UndefOr[Panel] = js.native
  /**Controls the position of the newly added panel. The following values are recognized:  
    * `top` (default): Adds the panel at the very top.  
    *  `after-top`: Adds the panel at the bottom of the top panels.  
    *  `bottom`: Adds the panel at the very bottom.  
    *  `before-bottom`: Adds the panel at the top of the bottom panels.  
    */
  var position: js.UndefOr[top | `after-top` | bottom | `before-bottom`] = js.native
  /**The new panel will replace the given panel. */
  var replace: js.UndefOr[Panel] = js.native
  /**Whether to scroll the editor to keep the text's vertical position stable, when adding a panel above it. Defaults to false. */
  var stable: js.UndefOr[Boolean] = js.native
}

object ShowPanelOptions {
  @scala.inline
  def apply(): ShowPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowPanelOptions]
  }
  @scala.inline
  implicit class ShowPanelOptionsOps[Self <: ShowPanelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: Panel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: Panel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: top | `after-top` | bottom | `before-bottom`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Panel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withStable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stable")(js.undefined)
        ret
    }
  }
  
}

