package typingsSlinky.pulumiAws.codepipelineWebhookMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration
import typingsSlinky.pulumiAws.inputMod.codepipeline.WebhookFilter
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookArgs extends js.Object {
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: Input[String] = js.native
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[Input[WebhookAuthenticationConfiguration]] = js.native
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: Input[js.Array[Input[WebhookFilter]]] = js.native
  /**
    * The name of the webhook.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: Input[String] = js.native
  /**
    * The name of the pipeline.
    */
  val targetPipeline: Input[String] = js.native
}

object WebhookArgs {
  @scala.inline
  def apply(
    authentication: Input[String],
    filters: Input[js.Array[Input[WebhookFilter]]],
    targetAction: Input[String],
    targetPipeline: Input[String]
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], targetAction = targetAction.asInstanceOf[js.Any], targetPipeline = targetPipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
  @scala.inline
  implicit class WebhookArgsOps[Self <: WebhookArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthentication(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: Input[js.Array[Input[WebhookFilter]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetAction(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPipeline(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationConfiguration(value: Input[WebhookAuthenticationConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

