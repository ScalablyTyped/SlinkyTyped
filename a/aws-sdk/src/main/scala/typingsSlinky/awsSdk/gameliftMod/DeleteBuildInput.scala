package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBuildInput extends js.Object {
  /**
    * A unique identifier for a build to delete. You can use either the build ID or ARN value. 
    */
  var BuildId: typingsSlinky.awsSdk.gameliftMod.BuildId = js.native
}

object DeleteBuildInput {
  @scala.inline
  def apply(BuildId: BuildId): DeleteBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBuildInput]
  }
  @scala.inline
  implicit class DeleteBuildInputOps[Self <: DeleteBuildInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildId(value: BuildId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

