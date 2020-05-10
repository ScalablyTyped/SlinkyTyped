package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBuildOutput extends js.Object {
  /**
    * The updated build record.
    */
  var Build: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.Build] = js.native
}

object UpdateBuildOutput {
  @scala.inline
  def apply(): UpdateBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBuildOutput]
  }
  @scala.inline
  implicit class UpdateBuildOutputOps[Self <: UpdateBuildOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: Build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Build")(js.undefined)
        ret
    }
  }
  
}

