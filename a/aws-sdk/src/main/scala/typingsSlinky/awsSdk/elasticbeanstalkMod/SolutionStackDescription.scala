package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionStackDescription extends js.Object {
  /**
    * The permitted file types allowed for a solution stack.
    */
  var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.native
  /**
    * The name of the solution stack.
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
}

object SolutionStackDescription {
  @scala.inline
  def apply(): SolutionStackDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionStackDescription]
  }
  @scala.inline
  implicit class SolutionStackDescriptionOps[Self <: SolutionStackDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermittedFileTypes(value: SolutionStackFileTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermittedFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermittedFileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionStackName(value: SolutionStackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(js.undefined)
        ret
    }
  }
  
}

