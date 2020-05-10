package typingsSlinky.pulumiAws.webhookMod

import typingsSlinky.pulumiAws.inputMod.codebuild.WebhookFilterGroup
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookState extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
    */
  val branchFilter: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the webhook's trigger. Filter group blocks are documented below.
    */
  val filterGroups: js.UndefOr[Input[js.Array[Input[WebhookFilterGroup]]]] = js.native
  /**
    * The CodeBuild endpoint where webhook events are sent.
    */
  val payloadUrl: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the build project.
    */
  val projectName: js.UndefOr[Input[String]] = js.native
  /**
    * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
    */
  val secret: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to the webhook.
    */
  val url: js.UndefOr[Input[String]] = js.native
}

object WebhookState {
  @scala.inline
  def apply(): WebhookState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookState]
  }
  @scala.inline
  implicit class WebhookStateOps[Self <: WebhookState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPayloadUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

