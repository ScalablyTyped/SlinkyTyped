package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.DefaultNetworkAclEgress
import typingsSlinky.pulumiAws.outputMod.ec2.DefaultNetworkAclIngress
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultNetworkAclMod {
  
  @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl")
  @js.native
  class DefaultNetworkAcl protected () extends CustomResource {
    /**
      * Create a DefaultNetworkAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultNetworkAclArgs) = this()
    def this(name: String, args: DefaultNetworkAclArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Default Network ACL
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Network ACL ID to manage. This
      * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
      */
    val defaultNetworkAclId: Output_[String] = js.native
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: Output_[js.UndefOr[js.Array[DefaultNetworkAclEgress]]] = js.native
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: Output_[js.UndefOr[js.Array[DefaultNetworkAclIngress]]] = js.native
    
    /**
      * The ID of the AWS account that owns the Default Network ACL
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A list of Subnet IDs to apply the ACL to. See the
      * notes below on managing Subnets in the Default Network ACL
      */
    val subnetIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the associated VPC
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object DefaultNetworkAcl {
    
    /**
      * Get an existing DefaultNetworkAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl.get")
    @js.native
    def get(name: String, id: Input[ID]): DefaultNetworkAcl = js.native
    @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DefaultNetworkAcl = js.native
    @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultNetworkAclState): DefaultNetworkAcl = js.native
    @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: DefaultNetworkAclState, opts: CustomResourceOptions): DefaultNetworkAcl = js.native
    
    /**
      * Returns true if the given object is an instance of DefaultNetworkAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultNetworkAcl.DefaultNetworkAcl */ Boolean = js.native
  }
  
  @js.native
  trait DefaultNetworkAclArgs extends StObject {
    
    /**
      * The Network ACL ID to manage. This
      * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
      */
    val defaultNetworkAclId: Input[String] = js.native
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]
      ] = js.native
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]
      ] = js.native
    
    /**
      * A list of Subnet IDs to apply the ACL to. See the
      * notes below on managing Subnets in the Default Network ACL
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object DefaultNetworkAclArgs {
    
    @scala.inline
    def apply(defaultNetworkAclId: Input[String]): DefaultNetworkAclArgs = {
      val __obj = js.Dynamic.literal(defaultNetworkAclId = defaultNetworkAclId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultNetworkAclArgs]
    }
    
    @scala.inline
    implicit class DefaultNetworkAclArgsMutableBuilder[Self <: DefaultNetworkAclArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultNetworkAclId(value: Input[String]): Self = StObject.set(x, "defaultNetworkAclId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgress(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setEgressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      @scala.inline
      def setIngress(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      @scala.inline
      def setIngressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait DefaultNetworkAclState extends StObject {
    
    /**
      * The ARN of the Default Network ACL
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Network ACL ID to manage. This
      * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
      */
    val defaultNetworkAclId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]
      ] = js.native
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]
      ] = js.native
    
    /**
      * The ID of the AWS account that owns the Default Network ACL
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of Subnet IDs to apply the ACL to. See the
      * notes below on managing Subnets in the Default Network ACL
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The ID of the associated VPC
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object DefaultNetworkAclState {
    
    @scala.inline
    def apply(): DefaultNetworkAclState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultNetworkAclState]
    }
    
    @scala.inline
    implicit class DefaultNetworkAclStateMutableBuilder[Self <: DefaultNetworkAclState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDefaultNetworkAclId(value: Input[String]): Self = StObject.set(x, "defaultNetworkAclId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNetworkAclIdUndefined: Self = StObject.set(x, "defaultNetworkAclId", js.undefined)
      
      @scala.inline
      def setEgress(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setEgressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      @scala.inline
      def setIngress(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      @scala.inline
      def setIngressVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
