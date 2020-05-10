package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of a column in a table.
  */
@js.native
trait SchemaTableColumnProperties extends js.Object {
  /**
    * The width of the column. Set when the column&#39;s `width_type` is
    * FIXED_WIDTH.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
  /**
    * The width type of the column.
    */
  var widthType: js.UndefOr[String] = js.native
}

object SchemaTableColumnProperties {
  @scala.inline
  def apply(): SchemaTableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableColumnProperties]
  }
  @scala.inline
  implicit class SchemaTableColumnPropertiesOps[Self <: SchemaTableColumnProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWidth(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthType")(js.undefined)
        ret
    }
  }
  
}

