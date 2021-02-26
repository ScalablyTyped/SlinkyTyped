package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayVpcLinkMod {
  
  @JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink")
  @js.native
  class VpcLink protected () extends CustomResource {
    /**
      * Create a VpcLink resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcLinkArgs) = this()
    def this(name: String, args: VpcLinkArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * The description of the VPC link.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name used to label and identify the VPC link.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
      */
    val targetArn: Output_[String] = js.native
  }
  /* static members */
  object VpcLink {
    
    /**
      * Get an existing VpcLink resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink.get")
    @js.native
    def get(name: String, id: Input[ID]): VpcLink = js.native
    @JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcLink = js.native
    @JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcLinkState): VpcLink = js.native
    @JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcLinkState, opts: CustomResourceOptions): VpcLink = js.native
    
    /**
      * Returns true if the given object is an instance of VpcLink.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/vpcLink.VpcLink */ Boolean = js.native
  }
  
  @js.native
  trait VpcLinkArgs extends StObject {
    
    /**
      * The description of the VPC link.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name used to label and identify the VPC link.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
      */
    val targetArn: Input[String] = js.native
  }
  object VpcLinkArgs {
    
    @scala.inline
    def apply(targetArn: Input[String]): VpcLinkArgs = {
      val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcLinkArgs]
    }
    
    @scala.inline
    implicit class VpcLinkArgsMutableBuilder[Self <: VpcLinkArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpcLinkState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the VPC link.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name used to label and identify the VPC link.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
      */
    val targetArn: js.UndefOr[Input[String]] = js.native
  }
  object VpcLinkState {
    
    @scala.inline
    def apply(): VpcLinkState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcLinkState]
    }
    
    @scala.inline
    implicit class VpcLinkStateMutableBuilder[Self <: VpcLinkState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
    }
  }
}
