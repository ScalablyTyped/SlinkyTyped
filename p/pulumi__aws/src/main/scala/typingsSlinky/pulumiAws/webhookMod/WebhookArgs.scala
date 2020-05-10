package typingsSlinky.pulumiAws.webhookMod

import typingsSlinky.pulumiAws.inputMod.codebuild.WebhookFilterGroup
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookArgs extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
    */
  val branchFilter: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the webhook's trigger. Filter group blocks are documented below.
    */
  val filterGroups: js.UndefOr[Input[js.Array[Input[WebhookFilterGroup]]]] = js.native
  /**
    * The name of the build project.
    */
  val projectName: Input[String] = js.native
}

object WebhookArgs {
  @scala.inline
  def apply(projectName: Input[String]): WebhookArgs = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
  @scala.inline
  implicit class WebhookArgsOps[Self <: WebhookArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchFilter(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterGroups(value: Input[js.Array[Input[WebhookFilterGroup]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGroups")(js.undefined)
        ret
    }
  }
  
}

