package typingsSlinky.jupyterlabStatusbar.hoverMod.Popup

import typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.left
import typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.right
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a Popup widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Whether to align the popup to the left or the right of the anchor.
    */
  var align: js.UndefOr[left | right] = js.native
  /**
    * The widget to which we are attaching the popup.
    */
  var anchor: Widget = js.native
  /**
    * The content of the popup.
    */
  var body: Widget = js.native
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, body: Widget): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
  }
  
}

