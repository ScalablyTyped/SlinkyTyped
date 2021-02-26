package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.wafregional.WebAclDefaultAction
import typingsSlinky.pulumiAws.outputMod.wafregional.WebAclLoggingConfiguration
import typingsSlinky.pulumiAws.outputMod.wafregional.WebAclRule
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webAclMod {
  
  @JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl")
  @js.native
  class WebAcl protected () extends CustomResource {
    /**
      * Create a WebAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclArgs) = this()
    def this(name: String, args: WebAclArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the WAF Regional WebACL.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
      */
    val defaultAction: Output_[WebAclDefaultAction] = js.native
    
    /**
      * Configuration block to enable WAF logging. Detailed below.
      */
    val loggingConfiguration: Output_[js.UndefOr[WebAclLoggingConfiguration]] = js.native
    
    /**
      * The name or description for the Amazon CloudWatch metric of this web ACL.
      */
    val metricName: Output_[String] = js.native
    
    /**
      * The name or description of the web ACL.
      */
    val name: Output_[String] = js.native
    
    /**
      * Set of configuration blocks containing rules for the web ACL. Detailed below.
      */
    val rules: Output_[js.UndefOr[js.Array[WebAclRule]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object WebAcl {
    
    /**
      * Get an existing WebAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID]): WebAcl = js.native
    @JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WebAcl = js.native
    @JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState): WebAcl = js.native
    @JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): WebAcl = js.native
    
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAcl.WebAcl */ Boolean = js.native
  }
  
  @js.native
  trait WebAclArgs extends StObject {
    
    /**
      * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
      */
    val defaultAction: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclDefaultAction] = js.native
    
    /**
      * Configuration block to enable WAF logging. Detailed below.
      */
    val loggingConfiguration: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclLoggingConfiguration]] = js.native
    
    /**
      * The name or description for the Amazon CloudWatch metric of this web ACL.
      */
    val metricName: Input[String] = js.native
    
    /**
      * The name or description of the web ACL.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set of configuration blocks containing rules for the web ACL. Detailed below.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclRule]]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object WebAclArgs {
    
    @scala.inline
    def apply(
      defaultAction: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclDefaultAction],
      metricName: Input[String]
    ): WebAclArgs = {
      val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAclArgs]
    }
    
    @scala.inline
    implicit class WebAclArgsMutableBuilder[Self <: WebAclArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultAction(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclDefaultAction]): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclLoggingConfiguration]): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingConfigurationUndefined: Self = StObject.set(x, "loggingConfiguration", js.undefined)
      
      @scala.inline
      def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait WebAclState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the WAF Regional WebACL.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
      */
    val defaultAction: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclDefaultAction]] = js.native
    
    /**
      * Configuration block to enable WAF logging. Detailed below.
      */
    val loggingConfiguration: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclLoggingConfiguration]] = js.native
    
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
    val rules: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclRule]]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object WebAclState {
    
    @scala.inline
    def apply(): WebAclState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebAclState]
    }
    
    @scala.inline
    implicit class WebAclStateMutableBuilder[Self <: WebAclState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDefaultAction(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclDefaultAction]): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActionUndefined: Self = StObject.set(x, "defaultAction", js.undefined)
      
      @scala.inline
      def setLoggingConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclLoggingConfiguration]): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingConfigurationUndefined: Self = StObject.set(x, "loggingConfiguration", js.undefined)
      
      @scala.inline
      def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.WebAclRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
