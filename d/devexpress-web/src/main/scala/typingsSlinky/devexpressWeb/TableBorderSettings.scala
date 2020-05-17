package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define a table border.
  */
@js.native
trait TableBorderSettings extends js.Object {
  /**
    * Gets or sets the border color.
    */
  var color: String = js.native
  /**
    * Gets or sets the border line style.
    */
  var style: BorderLineStyle = js.native
  /**
    * Gets or sets the border line width in twips.
    */
  var width: Double = js.native
}

object TableBorderSettings {
  @scala.inline
  def apply(color: String, style: BorderLineStyle, width: Double): TableBorderSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderSettings]
  }
  @scala.inline
  implicit class TableBorderSettingsOps[Self <: TableBorderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: BorderLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

