package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnPath extends js.Object {
  var columnPath: js.UndefOr[js.Array[String | Double | js.Date]] = js.native
  var customColumns: js.UndefOr[js.Array[String]] = js.native
  var dataIndex: js.UndefOr[Double] = js.native
  var maxRowCount: js.UndefOr[Double] = js.native
  var rowPath: js.UndefOr[js.Array[String | Double | js.Date]] = js.native
}

object AnonColumnPath {
  @scala.inline
  def apply(): AnonColumnPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColumnPath]
  }
  @scala.inline
  implicit class AnonColumnPathOps[Self <: AnonColumnPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnPath(value: js.Array[String | Double | js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRowPath(value: js.Array[String | Double | js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPath")(js.undefined)
        ret
    }
  }
  
}

