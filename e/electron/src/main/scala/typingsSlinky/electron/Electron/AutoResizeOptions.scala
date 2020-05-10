package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoResizeOptions extends js.Object {
  /**
    * If true, the view's height will grow and shrink together with the window. false
    * by default.
    */
  var height: Boolean = js.native
  /**
    * If true, the view's x position and width will grow and shrink proportionly with
    * the window. false by default.
    */
  var horizontal: Boolean = js.native
  /**
    * If true, the view's y position and height will grow and shrink proportinaly with
    * the window. false by default.
    */
  var vertical: Boolean = js.native
  /**
    * If true, the view's width will grow and shrink together with the window. false
    * by default.
    */
  var width: Boolean = js.native
}

object AutoResizeOptions {
  @scala.inline
  def apply(height: Boolean, horizontal: Boolean, vertical: Boolean, width: Boolean): AutoResizeOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoResizeOptions]
  }
  @scala.inline
  implicit class AutoResizeOptionsOps[Self <: AutoResizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

