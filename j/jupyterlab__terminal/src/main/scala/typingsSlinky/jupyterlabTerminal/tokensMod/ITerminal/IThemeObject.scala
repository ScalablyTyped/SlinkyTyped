package typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type for the terminal theme.
  */
@js.native
trait IThemeObject extends js.Object {
  var background: String = js.native
  var cursor: String = js.native
  var cursorAccent: String = js.native
  var foreground: String = js.native
  var selection: String = js.native
}

object IThemeObject {
  @scala.inline
  def apply(background: String, cursor: String, cursorAccent: String, foreground: String, selection: String): IThemeObject = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], cursorAccent = cursorAccent.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeObject]
  }
  @scala.inline
  implicit class IThemeObjectOps[Self <: IThemeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorAccent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorAccent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

