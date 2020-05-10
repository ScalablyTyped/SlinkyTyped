package typingsSlinky.phosphorDatagrid.textrendererMod.TextRenderer

import typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer.ConfigOption
import typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer.ICellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a text renderer.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The background color for the cells.
    *
    * The default is `''`.
    */
  var backgroundColor: js.UndefOr[ConfigOption[String]] = js.native
  /**
    * The font for drawing the cell text.
    *
    * The default is `'12px sans-serif'`.
    */
  var font: js.UndefOr[ConfigOption[String]] = js.native
  /**
    * The format function for the renderer.
    *
    * The default is `TextRenderer.formatGeneric()`.
    */
  var format: js.UndefOr[FormatFunc] = js.native
  /**
    * The horizontal alignment for the cell text.
    *
    * The default is `'left'`.
    */
  var horizontalAlignment: js.UndefOr[ConfigOption[HorizontalAlignment]] = js.native
  /**
    * The color for the drawing the cell text.
    *
    * The default `'#000000'`.
    */
  var textColor: js.UndefOr[ConfigOption[String]] = js.native
  /**
    * The vertical alignment for the cell text.
    *
    * The default is `'center'`.
    */
  var verticalAlignment: js.UndefOr[ConfigOption[VerticalAlignment]] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorFunction1(value: /* config */ ICellConfig => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ConfigOption[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFunction1(value: /* config */ ICellConfig => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFont(value: ConfigOption[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: /* config */ ICellConfig => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignmentFunction1(value: /* config */ ICellConfig => HorizontalAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: ConfigOption[HorizontalAlignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColorFunction1(value: /* config */ ICellConfig => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextColor(value: ConfigOption[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignmentFunction1(value: /* config */ ICellConfig => VerticalAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: ConfigOption[VerticalAlignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
  }
  
}

