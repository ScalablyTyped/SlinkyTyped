package typingsSlinky.pulumiAws.webAclMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.wafregional.WebAclDefaultAction
import typingsSlinky.pulumiAws.inputMod.wafregional.WebAclLoggingConfiguration
import typingsSlinky.pulumiAws.inputMod.wafregional.WebAclRule
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the WAF Regional WebACL.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: js.UndefOr[Input[WebAclDefaultAction]] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[Input[WebAclLoggingConfiguration]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Set of configuration blocks containing rules for the web ACL. Detailed below.
    */
  val rules: js.UndefOr[Input[js.Array[Input[WebAclRule]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object WebAclState {
  @scala.inline
  def apply(): WebAclState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclState]
  }
  @scala.inline
  implicit class WebAclStateOps[Self <: WebAclState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAction(value: Input[WebAclDefaultAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingConfiguration(value: Input[WebAclLoggingConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(js.undefined)
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
    def withRules(value: Input[js.Array[Input[WebAclRule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
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

