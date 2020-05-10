package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBuildInput extends js.Object {
  /**
    * A unique identifier for a build to retrieve properties for. You can use either the build ID or ARN value. 
    */
  var BuildId: typingsSlinky.awsSdk.gameliftMod.BuildId = js.native
}

object DescribeBuildInput {
  @scala.inline
  def apply(BuildId: BuildId): DescribeBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBuildInput]
  }
  @scala.inline
  implicit class DescribeBuildInputOps[Self <: DescribeBuildInput] (val x: Self) extends AnyVal {
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

