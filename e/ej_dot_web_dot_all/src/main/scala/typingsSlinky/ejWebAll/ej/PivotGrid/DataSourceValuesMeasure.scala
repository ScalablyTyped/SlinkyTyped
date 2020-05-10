package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceValuesMeasure extends js.Object {
  /** Allows you to bind the measure from the OLAP datasource by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.native
}

object DataSourceValuesMeasure {
  @scala.inline
  def apply(): DataSourceValuesMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceValuesMeasure]
  }
  @scala.inline
  implicit class DataSourceValuesMeasureOps[Self <: DataSourceValuesMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
  }
  
}

