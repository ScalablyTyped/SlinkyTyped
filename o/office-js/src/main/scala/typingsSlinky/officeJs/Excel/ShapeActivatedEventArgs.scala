package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.ShapeActivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape that raised the Activated event.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the activated shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapeId: String = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ShapeActivated = js.native
  /**
    *
    * Gets the id of the worksheet in which the shape is activated.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String = js.native
}

object ShapeActivatedEventArgs {
  @scala.inline
  def apply(shapeId: String, `type`: ShapeActivated, worksheetId: String): ShapeActivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeActivatedEventArgs]
  }
  @scala.inline
  implicit class ShapeActivatedEventArgsOps[Self <: ShapeActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShapeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ShapeActivated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorksheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

