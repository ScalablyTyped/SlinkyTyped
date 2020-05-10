package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellBackgroundFill extends js.Object {
  /**
    * The background fill property state.
    *
    * Updating the the fill on a table cell will implicitly update this field
    * to `RENDERED`, unless another value is specified in the same request. To
    * have no fill on a table cell, set this field to `NOT_RENDERED`. In this
    * case, any other fill fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.native
}

object TableCellBackgroundFill {
  @scala.inline
  def apply(): TableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellBackgroundFill]
  }
  @scala.inline
  implicit class TableCellBackgroundFillOps[Self <: TableCellBackgroundFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(js.undefined)
        ret
    }
    @scala.inline
    def withSolidFill(value: SolidFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolidFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(js.undefined)
        ret
    }
  }
  
}

