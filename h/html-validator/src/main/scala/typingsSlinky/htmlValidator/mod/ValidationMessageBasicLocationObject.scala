package typingsSlinky.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationMessageBasicLocationObject extends js.Object {
  var extract: String = js.native
  var firstColumn: Double = js.native
  var hiliteLength: Double = js.native
  var hiliteStart: Double = js.native
  var lastColumn: Double = js.native
  var lastLine: Double = js.native
}

object ValidationMessageBasicLocationObject {
  @scala.inline
  def apply(
    extract: String,
    firstColumn: Double,
    hiliteLength: Double,
    hiliteStart: Double,
    lastColumn: Double,
    lastLine: Double
  ): ValidationMessageBasicLocationObject = {
    val __obj = js.Dynamic.literal(extract = extract.asInstanceOf[js.Any], firstColumn = firstColumn.asInstanceOf[js.Any], hiliteLength = hiliteLength.asInstanceOf[js.Any], hiliteStart = hiliteStart.asInstanceOf[js.Any], lastColumn = lastColumn.asInstanceOf[js.Any], lastLine = lastLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicLocationObject]
  }
  @scala.inline
  implicit class ValidationMessageBasicLocationObjectOps[Self <: ValidationMessageBasicLocationObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtract(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiliteLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiliteLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiliteStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiliteStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

