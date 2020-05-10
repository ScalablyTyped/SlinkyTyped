package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDecorationOptions extends js.Object {
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var color: js.UndefOr[String | ThemeColor] = js.native
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var darkColor: js.UndefOr[String | ThemeColor] = js.native
}

object IDecorationOptions {
  @scala.inline
  def apply(): IDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDecorationOptions]
  }
  @scala.inline
  implicit class IDecorationOptionsOps[Self <: IDecorationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String | ThemeColor): Self = {
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
    def withDarkColor(value: String | ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarkColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkColor")(js.undefined)
        ret
    }
  }
  
}

