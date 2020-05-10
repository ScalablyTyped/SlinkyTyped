package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access existing data source parameters.
  */
@js.native
trait DataSourceParameter extends js.Object {
  def getName(): String = js.native
  def getSourceCell(): String | Null = js.native
  def getType(): DataSourceParameterType = js.native
}

object DataSourceParameter {
  @scala.inline
  def apply(getName: () => String, getSourceCell: () => String | Null, getType: () => DataSourceParameterType): DataSourceParameter = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getSourceCell = js.Any.fromFunction0(getSourceCell), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[DataSourceParameter]
  }
  @scala.inline
  implicit class DataSourceParameterOps[Self <: DataSourceParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceCell(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => DataSourceParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

