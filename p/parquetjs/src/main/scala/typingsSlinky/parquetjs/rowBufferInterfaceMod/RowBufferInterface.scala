package typingsSlinky.parquetjs.rowBufferInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parquetjs.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowBufferInterface extends js.Object {
  var columnData: StringDictionary[Count] = js.native
  var rowCount: Double = js.native
}

object RowBufferInterface {
  @scala.inline
  def apply(columnData: StringDictionary[Count], rowCount: Double): RowBufferInterface = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowBufferInterface]
  }
  @scala.inline
  implicit class RowBufferInterfaceOps[Self <: RowBufferInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnData(value: StringDictionary[Count]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

