package typingsSlinky.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a PointStyle within a StyleSetting
  */
@js.native
trait SchemaPointStyle extends js.Object {
  /**
    * Name of the icon. Use values defined in
    * http://www.google.com/fusiontables/DataSource?dsrcid=308519
    */
  var iconName: js.UndefOr[String] = js.native
  /**
    * Column or a bucket value from which the icon name is to be determined.
    */
  var iconStyler: js.UndefOr[SchemaStyleFunction] = js.native
}

object SchemaPointStyle {
  @scala.inline
  def apply(): SchemaPointStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointStyle]
  }
  @scala.inline
  implicit class SchemaPointStyleOps[Self <: SchemaPointStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyler(value: SchemaStyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyler")(js.undefined)
        ret
    }
  }
  
}

