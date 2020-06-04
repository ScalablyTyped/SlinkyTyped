package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoResizeOptions extends js.Object {
  /**
    * If true, the view's height will grow and shrink together with the window. false
    * by default.
    */
  var height: Boolean
  /**
    * If true, the view's x position and width will grow and shrink proportionly with
    * the window. false by default.
    */
  var horizontal: Boolean
  /**
    * If true, the view's y position and height will grow and shrink proportinaly with
    * the window. false by default.
    */
  var vertical: Boolean
  /**
    * If true, the view's width will grow and shrink together with the window. false
    * by default.
    */
  var width: Boolean
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

