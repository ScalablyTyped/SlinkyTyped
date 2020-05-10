package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.AnonAzdatacellguid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellContents extends js.Object {
  var cell_type: CellType = js.native
  var execution_count: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[AnonAzdatacellguid] = js.native
  var outputs: js.UndefOr[js.Array[ICellOutput]] = js.native
  var source: String | js.Array[String] = js.native
}

object ICellContents {
  @scala.inline
  def apply(cell_type: CellType, source: String | js.Array[String]): ICellContents = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellContents]
  }
  @scala.inline
  implicit class ICellContentsOps[Self <: ICellContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell_type(value: CellType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: AnonAzdatacellguid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[ICellOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
  }
  
}

