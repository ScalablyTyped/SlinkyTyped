package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.appmeshRouteMod.RouteArgs
import typingsSlinky.pulumiAws.appmeshRouteMod.RouteState
import typingsSlinky.pulumiAws.gatewayRouteMod.GatewayRouteArgs
import typingsSlinky.pulumiAws.gatewayRouteMod.GatewayRouteState
import typingsSlinky.pulumiAws.meshMod.MeshArgs
import typingsSlinky.pulumiAws.meshMod.MeshState
import typingsSlinky.pulumiAws.virtualGatewayMod.VirtualGatewayArgs
import typingsSlinky.pulumiAws.virtualGatewayMod.VirtualGatewayState
import typingsSlinky.pulumiAws.virtualNodeMod.VirtualNodeArgs
import typingsSlinky.pulumiAws.virtualNodeMod.VirtualNodeState
import typingsSlinky.pulumiAws.virtualRouterMod.VirtualRouterArgs
import typingsSlinky.pulumiAws.virtualRouterMod.VirtualRouterState
import typingsSlinky.pulumiAws.virtualServiceMod.VirtualServiceArgs
import typingsSlinky.pulumiAws.virtualServiceMod.VirtualServiceState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appmesh {
  
  @JSImport("@pulumi/aws", "appmesh.GatewayRoute")
  @js.native
  class GatewayRoute protected ()
    extends typingsSlinky.pulumiAws.appmeshMod.GatewayRoute {
    /**
      * Create a GatewayRoute resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayRouteArgs) = this()
    def this(name: String, args: GatewayRouteArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "appmesh.GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    @JSImport("@pulumi/aws", "appmesh.GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    @JSImport("@pulumi/aws", "appmesh.GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayRouteState): typingsSlinky.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    @JSImport("@pulumi/aws", "appmesh.GatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayRouteState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    
    /**
      * Returns true if the given object is an instance of GatewayRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appmesh.GatewayRoute.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/gatewayRoute.GatewayRoute */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appmesh.Mesh")
  @js.native
  class Mesh protected ()
    extends typingsSlinky.pulumiAws.appmeshMod.Mesh {
    /**
      * Create a Mesh resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MeshArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Mesh {
    
    /**
      * Get an existing Mesh resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appmesh.Mesh.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.meshMod.Mesh = js.native
    @JSImport("@pulumi/aws", "appmesh.Mesh.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.meshMod.Mesh = js.native
    @JSImport("@pulumi/aws", "appmesh.Mesh.get")
    @js.native
    def get(name: String, id: Input[ID], state: MeshState): typingsSlinky.pulumiAws.meshMod.Mesh = js.native
    @JSImport("@pulumi/aws", "appmesh.Mesh.get")
    @js.native
    def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.meshMod.Mesh = js.native
    
    /**
      * Returns true if the given object is an instance of Mesh.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appmesh.Mesh.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appmesh.Route")
  @js.native
  class Route protected ()
    extends typingsSlinky.pulumiAws.appmeshMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Route {
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appmesh.Route.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.appmeshRouteMod.Route = js.native
    @JSImport("@pulumi/aws", "appmesh.Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.appmeshRouteMod.Route = js.native
    @JSImport("@pulumi/aws", "appmesh.Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState): typingsSlinky.pulumiAws.appmeshRouteMod.Route = js.native
    @JSImport("@pulumi/aws", "appmesh.Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.appmeshRouteMod.Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appmesh.Route.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appmesh.VirtualGateway")
  @js.native
  class VirtualGateway protected ()
    extends typingsSlinky.pulumiAws.appmeshMod.VirtualGateway {
    /**
      * Create a VirtualGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualGatewayArgs) = this()
    def this(name: String, args: VirtualGatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VirtualGateway {
    
    /**
      * Get an existing VirtualGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appmesh.VirtualGateway.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualGatewayState): typingsSlinky.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualGatewayState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appmesh.VirtualGateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualGateway.VirtualGateway */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appmesh.VirtualNode")
  @js.native
  class VirtualNode protected ()
    extends typingsSlinky.pulumiAws.appmeshMod.VirtualNode {
    /**
      * Create a VirtualNode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualNodeArgs) = this()
    def this(name: String, args: VirtualNodeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VirtualNode {
    
    /**
      * Get an existing VirtualNode resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appmesh.VirtualNode.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.virtualNodeMod.VirtualNode = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualNode.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualNodeMod.VirtualNode = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualNode.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState): typingsSlinky.pulumiAws.virtualNodeMod.VirtualNode = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualNode.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualNodeMod.VirtualNode = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualNode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appmesh.VirtualNode.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appmesh.VirtualRouter")
  @js.native
  class VirtualRouter protected ()
    extends typingsSlinky.pulumiAws.appmeshMod.VirtualRouter {
    /**
      * Create a VirtualRouter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualRouterArgs) = this()
    def this(name: String, args: VirtualRouterArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "appmesh.VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState): typingsSlinky.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualRouter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appmesh.VirtualRouter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appmesh.VirtualService")
  @js.native
  class VirtualService protected ()
    extends typingsSlinky.pulumiAws.appmeshMod.VirtualService {
    /**
      * Create a VirtualService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualServiceArgs) = this()
    def this(name: String, args: VirtualServiceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VirtualService {
    
    /**
      * Get an existing VirtualService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appmesh.VirtualService.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.virtualServiceMod.VirtualService = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualService.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualServiceMod.VirtualService = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualService.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState): typingsSlinky.pulumiAws.virtualServiceMod.VirtualService = js.native
    @JSImport("@pulumi/aws", "appmesh.VirtualService.get")
    @js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.virtualServiceMod.VirtualService = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appmesh.VirtualService.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean = js.native
  }
}
