package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The border styling properties of the TableBorderCell.
  */
@js.native
trait SchemaTableBorderProperties extends js.Object {
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The fill of the table border.
    */
  var tableBorderFill: js.UndefOr[SchemaTableBorderFill] = js.native
  /**
    * The thickness of the border.
    */
  var weight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableBorderProperties {
  @scala.inline
  def apply(): SchemaTableBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderProperties]
  }
  @scala.inline
  implicit class SchemaTableBorderPropertiesOps[Self <: SchemaTableBorderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBorderFill(value: SchemaTableBorderFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBorderFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderFill")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

