package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.appmesh.GatewayRouteSpec
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayRouteMod {
  
  @JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute")
  @js.native
  class GatewayRoute protected () extends CustomResource {
    /**
      * Create a GatewayRoute resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayRouteArgs) = this()
    def this(name: String, args: GatewayRouteArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the gateway route.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The creation date of the gateway route.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The last update date of the gateway route.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
      */
    val meshName: Output_[String] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: Output_[String] = js.native
    
    /**
      * The name to use for the gateway route. Must be between 1 and 255 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: Output_[String] = js.native
    
    /**
      * The gateway route specification to apply.
      */
    val spec: Output_[GatewayRouteSpec] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The name of the [virtual gateway](https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway.html) to associate the gateway route with. Must be between 1 and 255 characters in length.
      */
    val virtualGatewayName: Output_[String] = js.native
  }
  /* static members */
  object GatewayRoute {
    
    /**
      * Get an existing GatewayRoute resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID]): GatewayRoute = js.native
    @JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GatewayRoute = js.native
    @JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayRouteState): GatewayRoute = js.native
    @JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayRouteState, opts: CustomResourceOptions): GatewayRoute = js.native
    
    /**
      * Returns true if the given object is an instance of GatewayRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/gatewayRoute.GatewayRoute */ Boolean = js.native
  }
  
  @js.native
  trait GatewayRouteArgs extends StObject {
    
    /**
      * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
      */
    val meshName: Input[String] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name to use for the gateway route. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The gateway route specification to apply.
      */
    val spec: Input[typingsSlinky.pulumiAws.inputMod.appmesh.GatewayRouteSpec] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name of the [virtual gateway](https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway.html) to associate the gateway route with. Must be between 1 and 255 characters in length.
      */
    val virtualGatewayName: Input[String] = js.native
  }
  object GatewayRouteArgs {
    
    @scala.inline
    def apply(
      meshName: Input[String],
      spec: Input[typingsSlinky.pulumiAws.inputMod.appmesh.GatewayRouteSpec],
      virtualGatewayName: Input[String]
    ): GatewayRouteArgs = {
      val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayRouteArgs]
    }
    
    @scala.inline
    implicit class GatewayRouteArgsMutableBuilder[Self <: GatewayRouteArgs] (val x: Self) extends AnyVal {
      
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
      def setSpec(value: Input[typingsSlinky.pulumiAws.inputMod.appmesh.GatewayRouteSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVirtualGatewayName(value: Input[String]): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GatewayRouteState extends StObject {
    
    /**
      * The ARN of the gateway route.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The creation date of the gateway route.
      */
    val createdDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The last update date of the gateway route.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
      */
    val meshName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name to use for the gateway route. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The gateway route specification to apply.
      */
    val spec: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appmesh.GatewayRouteSpec]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name of the [virtual gateway](https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway.html) to associate the gateway route with. Must be between 1 and 255 characters in length.
      */
    val virtualGatewayName: js.UndefOr[Input[String]] = js.native
  }
  object GatewayRouteState {
    
    @scala.inline
    def apply(): GatewayRouteState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatewayRouteState]
    }
    
    @scala.inline
    implicit class GatewayRouteStateMutableBuilder[Self <: GatewayRouteState] (val x: Self) extends AnyVal {
      
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
      def setSpec(value: Input[typingsSlinky.pulumiAws.inputMod.appmesh.GatewayRouteSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVirtualGatewayName(value: Input[String]): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualGatewayNameUndefined: Self = StObject.set(x, "virtualGatewayName", js.undefined)
    }
  }
}
