package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetBuildsOutput extends js.Object {
  /**
    * Information about the requested builds.
    */
  var builds: js.UndefOr[Builds] = js.native
  /**
    * The IDs of builds for which information could not be found.
    */
  var buildsNotFound: js.UndefOr[BuildIds] = js.native
}

object BatchGetBuildsOutput {
  @scala.inline
  def apply(): BatchGetBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBuildsOutput]
  }
  @scala.inline
  implicit class BatchGetBuildsOutputOps[Self <: BatchGetBuildsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilds(value: Builds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builds")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildsNotFound(value: BuildIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildsNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildsNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildsNotFound")(js.undefined)
        ret
    }
  }
  
}

