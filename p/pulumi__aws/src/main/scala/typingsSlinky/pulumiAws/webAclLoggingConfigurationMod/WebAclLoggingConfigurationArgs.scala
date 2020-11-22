package typingsSlinky.pulumiAws.webAclLoggingConfigurationMod

import typingsSlinky.pulumiAws.inputMod.wafv2.WebAclLoggingConfigurationRedactedField
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfigurationArgs extends js.Object {
  
  /**
    * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL. Currently, only 1 ARN is supported.
    */
  val logDestinationConfigs: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported.
    */
  val redactedFields: js.UndefOr[Input[js.Array[Input[WebAclLoggingConfigurationRedactedField]]]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
    */
  val resourceArn: Input[String] = js.native
}
object WebAclLoggingConfigurationArgs {
  
  @scala.inline
  def apply(logDestinationConfigs: Input[js.Array[Input[String]]], resourceArn: Input[String]): WebAclLoggingConfigurationArgs = {
    val __obj = js.Dynamic.literal(logDestinationConfigs = logDestinationConfigs.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationArgs]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationArgsOps[Self <: WebAclLoggingConfigurationArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogDestinationConfigsVarargs(value: Input[String]*): Self = this.set("logDestinationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLogDestinationConfigs(value: Input[js.Array[Input[String]]]): Self = this.set("logDestinationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedFieldsVarargs(value: Input[WebAclLoggingConfigurationRedactedField]*): Self = this.set("redactedFields", js.Array(value :_*))
    
    @scala.inline
    def setRedactedFields(value: Input[js.Array[Input[WebAclLoggingConfigurationRedactedField]]]): Self = this.set("redactedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactedFields: Self = this.set("redactedFields", js.undefined)
  }
}
