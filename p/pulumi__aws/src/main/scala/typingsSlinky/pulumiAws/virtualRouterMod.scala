package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.appmesh.VirtualRouterSpec
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualRouterMod {
  
  @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
  @js.native
  class VirtualRouter protected () extends CustomResource {
    /**
      * Create a VirtualRouter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualRouterArgs) = this()
    def this(name: String, args: VirtualRouterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the virtual router.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The creation date of the virtual router.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The last update date of the virtual router.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
      */
    val meshName: Output_[String] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: Output_[String] = js.native
    
    /**
      * The name to use for the virtual router. Must be between 1 and 255 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: Output_[String] = js.native
    
    /**
      * The virtual router specification to apply.
      */
    val spec: Output_[VirtualRouterSpec] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object VirtualRouter {
    
    /**
      * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID]): VirtualRouter = js.native
    @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VirtualRouter = js.native
    @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState): VirtualRouter = js.native
    @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): VirtualRouter = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = js.native
  }
  
  @js.native
  trait VirtualRouterArgs extends StObject {
    
    /**
      * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
      */
    val meshName: Input[String] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name to use for the virtual router. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The virtual router specification to apply.
      */
    val spec: Input[typingsSlinky.pulumiAws.inputMod.appmesh.VirtualRouterSpec] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object VirtualRouterArgs {
    
    @scala.inline
    def apply(meshName: Input[String], spec: Input[typingsSlinky.pulumiAws.inputMod.appmesh.VirtualRouterSpec]): VirtualRouterArgs = {
      val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualRouterArgs]
    }
    
    @scala.inline
    implicit class VirtualRouterArgsMutableBuilder[Self <: VirtualRouterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeshName(value: Input[String]): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshOwner(value: Input[String]): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typingsSlinky.pulumiAws.inputMod.appmesh.VirtualRouterSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait VirtualRouterState extends StObject {
    
    /**
      * The ARN of the virtual router.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The creation date of the virtual router.
      */
    val createdDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The last update date of the virtual router.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
      */
    val meshName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name to use for the virtual router. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The virtual router specification to apply.
      */
    val spec: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appmesh.VirtualRouterSpec]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object VirtualRouterState {
    
    @scala.inline
    def apply(): VirtualRouterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VirtualRouterState]
    }
    
    @scala.inline
    implicit class VirtualRouterStateMutableBuilder[Self <: VirtualRouterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      @scala.inline
      def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      @scala.inline
      def setMeshName(value: Input[String]): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshNameUndefined: Self = StObject.set(x, "meshName", js.undefined)
      
      @scala.inline
      def setMeshOwner(value: Input[String]): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceOwner(value: Input[String]): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceOwnerUndefined: Self = StObject.set(x, "resourceOwner", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typingsSlinky.pulumiAws.inputMod.appmesh.VirtualRouterSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
