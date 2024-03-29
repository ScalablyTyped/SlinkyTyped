package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.authorizationRuleMod.AuthorizationRuleArgs
import typingsSlinky.pulumiAws.authorizationRuleMod.AuthorizationRuleState
import typingsSlinky.pulumiAws.ec2clientvpnEndpointMod.EndpointArgs
import typingsSlinky.pulumiAws.ec2clientvpnEndpointMod.EndpointState
import typingsSlinky.pulumiAws.ec2clientvpnRouteMod.RouteArgs
import typingsSlinky.pulumiAws.ec2clientvpnRouteMod.RouteState
import typingsSlinky.pulumiAws.networkAssociationMod.NetworkAssociationArgs
import typingsSlinky.pulumiAws.networkAssociationMod.NetworkAssociationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2clientvpnMod {
  
  @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule")
  @js.native
  class AuthorizationRule protected ()
    extends typingsSlinky.pulumiAws.authorizationRuleMod.AuthorizationRule {
    /**
      * Create a AuthorizationRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AuthorizationRuleArgs) = this()
    def this(name: String, args: AuthorizationRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AuthorizationRule {
    
    /**
      * Get an existing AuthorizationRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.authorizationRuleMod.AuthorizationRule = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.authorizationRuleMod.AuthorizationRule = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: AuthorizationRuleState): typingsSlinky.pulumiAws.authorizationRuleMod.AuthorizationRule = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: AuthorizationRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.authorizationRuleMod.AuthorizationRule = js.native
    
    /**
      * Returns true if the given object is an instance of AuthorizationRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/authorizationRule.AuthorizationRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typingsSlinky.pulumiAws.ec2clientvpnEndpointMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Endpoint {
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): typingsSlinky.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/endpoint.Endpoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation")
  @js.native
  class NetworkAssociation protected ()
    extends typingsSlinky.pulumiAws.networkAssociationMod.NetworkAssociation {
    /**
      * Create a NetworkAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkAssociationArgs) = this()
    def this(name: String, args: NetworkAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NetworkAssociation {
    
    /**
      * Get an existing NetworkAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState): typingsSlinky.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2clientvpn", "Route")
  @js.native
  class Route protected ()
    extends typingsSlinky.pulumiAws.ec2clientvpnRouteMod.Route {
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
    @JSImport("@pulumi/aws/ec2clientvpn", "Route.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ec2clientvpnRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ec2clientvpnRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState): typingsSlinky.pulumiAws.ec2clientvpnRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2clientvpn", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ec2clientvpnRouteMod.Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2clientvpn", "Route.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/route.Route */ Boolean = js.native
  }
}
