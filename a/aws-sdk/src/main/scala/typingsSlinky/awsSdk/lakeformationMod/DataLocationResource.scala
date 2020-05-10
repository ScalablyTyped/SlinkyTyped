package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLocationResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
    */
  var ResourceArn: ResourceArnString = js.native
}

object DataLocationResource {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DataLocationResource = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLocationResource]
  }
  @scala.inline
  implicit class DataLocationResourceOps[Self <: DataLocationResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: ResourceArnString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

