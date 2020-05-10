package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.BindingType
import typingsSlinky.officeJs.officeJsStrings.Range
import typingsSlinky.officeJs.officeJsStrings.Table
import typingsSlinky.officeJs.officeJsStrings.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `binding.toJSON()`. */
@js.native
trait BindingData extends js.Object {
  /**
    *
    * Represents binding identifier. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[BindingType | Range | Table | Text] = js.native
}

object BindingData {
  @scala.inline
  def apply(): BindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingData]
  }
  @scala.inline
  implicit class BindingDataOps[Self <: BindingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: BindingType | Range | Table | Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

