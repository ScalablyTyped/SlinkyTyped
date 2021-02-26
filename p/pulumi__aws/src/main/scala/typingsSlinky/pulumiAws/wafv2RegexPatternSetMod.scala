package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.wafv2.RegexPatternSetRegularExpression
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafv2RegexPatternSetMod {
  
  @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet")
  @js.native
  class RegexPatternSet protected () extends CustomResource {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A friendly description of the regular expression pattern set.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    val lockToken: Output_[String] = js.native
    
    /**
      * A friendly name of the regular expression pattern set.
      */
    val name: Output_[String] = js.native
    
    /**
      * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
      */
    val regularExpressions: Output_[js.UndefOr[js.Array[RegexPatternSetRegularExpression]]] = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Output_[String] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object RegexPatternSet {
    
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID]): RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): RegexPatternSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean = js.native
  }
  
  @js.native
  trait RegexPatternSetArgs extends StObject {
    
    /**
      * A friendly description of the regular expression pattern set.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name of the regular expression pattern set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
      */
    val regularExpressions: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
        ]
      ] = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Input[String] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RegexPatternSetArgs {
    
    @scala.inline
    def apply(scope: Input[String]): RegexPatternSetArgs = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexPatternSetArgs]
    }
    
    @scala.inline
    implicit class RegexPatternSetArgsMutableBuilder[Self <: RegexPatternSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegularExpressions(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
            ]
      ): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularExpressionsUndefined: Self = StObject.set(x, "regularExpressions", js.undefined)
      
      @scala.inline
      def setRegularExpressionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]*): Self = StObject.set(x, "regularExpressions", js.Array(value :_*))
      
      @scala.inline
      def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait RegexPatternSetState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly description of the regular expression pattern set.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    val lockToken: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name of the regular expression pattern set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
      */
    val regularExpressions: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
        ]
      ] = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: js.UndefOr[Input[String]] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RegexPatternSetState {
    
    @scala.inline
    def apply(): RegexPatternSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexPatternSetState]
    }
    
    @scala.inline
    implicit class RegexPatternSetStateMutableBuilder[Self <: RegexPatternSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLockToken(value: Input[String]): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockTokenUndefined: Self = StObject.set(x, "lockToken", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegularExpressions(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
            ]
      ): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularExpressionsUndefined: Self = StObject.set(x, "regularExpressions", js.undefined)
      
      @scala.inline
      def setRegularExpressionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]*): Self = StObject.set(x, "regularExpressions", js.Array(value :_*))
      
      @scala.inline
      def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
