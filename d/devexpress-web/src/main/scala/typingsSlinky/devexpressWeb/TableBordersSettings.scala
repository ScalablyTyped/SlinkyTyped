package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define table borders.
  */
@js.native
trait TableBordersSettings extends js.Object {
  /**
    * Gets or sets the background color of table borders.
    */
  var backgroundColor: String = js.native
  /**
    * Gets or sets the bottom border's settings.
    */
  var bottom: TableBorderSettings = js.native
  /**
    * Gets or sets the inside horizontal border's settings.
    */
  var insideHorizontal: TableBorderSettings = js.native
  /**
    * Gets or sets the inside vertical border's settings.
    */
  var insideVertical: TableBorderSettings = js.native
  /**
    * Gets or sets the left border's settings.
    */
  var left: TableBorderSettings = js.native
  /**
    * Gets or sets the right border's settings.
    */
  var right: TableBorderSettings = js.native
  /**
    * Gets or sets the top border's settings.
    */
  var top: TableBorderSettings = js.native
}

object TableBordersSettings {
  @scala.inline
  def apply(
    backgroundColor: String,
    bottom: TableBorderSettings,
    insideHorizontal: TableBorderSettings,
    insideVertical: TableBorderSettings,
    left: TableBorderSettings,
    right: TableBorderSettings,
    top: TableBorderSettings
  ): TableBordersSettings = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], insideHorizontal = insideHorizontal.asInstanceOf[js.Any], insideVertical = insideVertical.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBordersSettings]
  }
  @scala.inline
  implicit class TableBordersSettingsOps[Self <: TableBordersSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottom(value: TableBorderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideHorizontal(value: TableBorderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideVertical(value: TableBorderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: TableBorderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: TableBorderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: TableBorderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

