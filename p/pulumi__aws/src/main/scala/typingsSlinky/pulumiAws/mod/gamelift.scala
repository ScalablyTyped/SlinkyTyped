package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.aliasMod.AliasArgs
import typingsSlinky.pulumiAws.aliasMod.AliasState
import typingsSlinky.pulumiAws.buildMod.BuildArgs
import typingsSlinky.pulumiAws.buildMod.BuildState
import typingsSlinky.pulumiAws.gameSessionQueueMod.GameSessionQueueArgs
import typingsSlinky.pulumiAws.gameSessionQueueMod.GameSessionQueueState
import typingsSlinky.pulumiAws.gameliftFleetMod.FleetArgs
import typingsSlinky.pulumiAws.gameliftFleetMod.FleetState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamelift {
  
  @JSImport("@pulumi/aws", "gamelift.Alias")
  @js.native
  class Alias protected ()
    extends typingsSlinky.pulumiAws.gameliftMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Alias {
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "gamelift.Alias.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.aliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "gamelift.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.aliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "gamelift.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState): typingsSlinky.pulumiAws.aliasMod.Alias = js.native
    @JSImport("@pulumi/aws", "gamelift.Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.aliasMod.Alias = js.native
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "gamelift.Alias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/alias.Alias */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "gamelift.Build")
  @js.native
  class Build protected ()
    extends typingsSlinky.pulumiAws.gameliftMod.Build {
    /**
      * Create a Build resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BuildArgs) = this()
    def this(name: String, args: BuildArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Build {
    
    /**
      * Get an existing Build resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "gamelift.Build.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.buildMod.Build = js.native
    @JSImport("@pulumi/aws", "gamelift.Build.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.buildMod.Build = js.native
    @JSImport("@pulumi/aws", "gamelift.Build.get")
    @js.native
    def get(name: String, id: Input[ID], state: BuildState): typingsSlinky.pulumiAws.buildMod.Build = js.native
    @JSImport("@pulumi/aws", "gamelift.Build.get")
    @js.native
    def get(name: String, id: Input[ID], state: BuildState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.buildMod.Build = js.native
    
    /**
      * Returns true if the given object is an instance of Build.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "gamelift.Build.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/build.Build */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "gamelift.Fleet")
  @js.native
  class Fleet protected ()
    extends typingsSlinky.pulumiAws.gameliftMod.Fleet {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Fleet {
    
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "gamelift.Fleet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gameliftFleetMod.Fleet = js.native
    @JSImport("@pulumi/aws", "gamelift.Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gameliftFleetMod.Fleet = js.native
    @JSImport("@pulumi/aws", "gamelift.Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: FleetState): typingsSlinky.pulumiAws.gameliftFleetMod.Fleet = js.native
    @JSImport("@pulumi/aws", "gamelift.Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gameliftFleetMod.Fleet = js.native
    
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "gamelift.Fleet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/fleet.Fleet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "gamelift.GameSessionQueue")
  @js.native
  class GameSessionQueue protected ()
    extends typingsSlinky.pulumiAws.gameliftMod.GameSessionQueue {
    /**
      * Create a GameSessionQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GameSessionQueueArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: GameSessionQueueArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GameSessionQueue {
    
    /**
      * Get an existing GameSessionQueue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "gamelift.GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gameSessionQueueMod.GameSessionQueue = js.native
    @JSImport("@pulumi/aws", "gamelift.GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.gameSessionQueueMod.GameSessionQueue = js.native
    @JSImport("@pulumi/aws", "gamelift.GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: GameSessionQueueState): typingsSlinky.pulumiAws.gameSessionQueueMod.GameSessionQueue = js.native
    @JSImport("@pulumi/aws", "gamelift.GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: GameSessionQueueState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gameSessionQueueMod.GameSessionQueue = js.native
    
    /**
      * Returns true if the given object is an instance of GameSessionQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "gamelift.GameSessionQueue.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/gameSessionQueue.GameSessionQueue */ Boolean = js.native
  }
}
