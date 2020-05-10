package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorSortColumn extends js.Object {
  /**
    * The name of the column.
    */
  var column: Input[String] = js.native
  /**
    * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
    */
  var sortOrder: Input[Double] = js.native
}

object CatalogTableStorageDescriptorSortColumn {
  @scala.inline
  def apply(column: Input[String], sortOrder: Input[Double]): CatalogTableStorageDescriptorSortColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorSortColumn]
  }
  @scala.inline
  implicit class CatalogTableStorageDescriptorSortColumnOps[Self <: CatalogTableStorageDescriptorSortColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortOrder(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

