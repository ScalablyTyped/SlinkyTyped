package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionStorageDescriptorSortColumn extends js.Object {
  
  /**
    * The name of the column.
    */
  var column: Input[String] = js.native
  
  /**
    * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
    */
  var sortOrder: Input[Double] = js.native
}
object PartitionStorageDescriptorSortColumn {
  
  @scala.inline
  def apply(column: Input[String], sortOrder: Input[Double]): PartitionStorageDescriptorSortColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionStorageDescriptorSortColumn]
  }
  
  @scala.inline
  implicit class PartitionStorageDescriptorSortColumnOps[Self <: PartitionStorageDescriptorSortColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumn(value: Input[String]): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: Input[Double]): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
  }
}
