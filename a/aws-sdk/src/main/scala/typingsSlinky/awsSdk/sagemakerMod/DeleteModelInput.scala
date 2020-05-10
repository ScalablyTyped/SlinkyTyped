package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteModelInput extends js.Object {
  /**
    * The name of the model to delete.
    */
  var ModelName: typingsSlinky.awsSdk.sagemakerMod.ModelName = js.native
}

object DeleteModelInput {
  @scala.inline
  def apply(ModelName: ModelName): DeleteModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelInput]
  }
  @scala.inline
  implicit class DeleteModelInputOps[Self <: DeleteModelInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelName(value: ModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

