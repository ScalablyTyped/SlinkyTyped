package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.gamelift.GameSessionQueuePlayerLatencyPolicy
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameSessionQueueMod {
  
  @JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue")
  @js.native
  class GameSessionQueue protected () extends CustomResource {
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
    
    /**
      * Game Session Queue ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * List of fleet/alias ARNs used by session queue for placing game sessions.
      */
    val destinations: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Name of the session queue.
      */
    val name: Output_[String] = js.native
    
    /**
      * One or more policies used to choose fleet based on player latency. See below.
      */
    val playerLatencyPolicies: Output_[js.UndefOr[js.Array[GameSessionQueuePlayerLatencyPolicy]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Maximum time a game session request can remain in the queue.
      */
    val timeoutInSeconds: Output_[js.UndefOr[Double]] = js.native
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
    @JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID]): GameSessionQueue = js.native
    @JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GameSessionQueue = js.native
    @JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: GameSessionQueueState): GameSessionQueue = js.native
    @JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: GameSessionQueueState, opts: CustomResourceOptions): GameSessionQueue = js.native
    
    /**
      * Returns true if the given object is an instance of GameSessionQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/gameSessionQueue.GameSessionQueue */ Boolean = js.native
  }
  
  @js.native
  trait GameSessionQueueArgs extends StObject {
    
    /**
      * List of fleet/alias ARNs used by session queue for placing game sessions.
      */
    val destinations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Name of the session queue.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more policies used to choose fleet based on player latency. See below.
      */
    val playerLatencyPolicies: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.gamelift.GameSessionQueuePlayerLatencyPolicy]
          ]
        ]
      ] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Maximum time a game session request can remain in the queue.
      */
    val timeoutInSeconds: js.UndefOr[Input[Double]] = js.native
  }
  object GameSessionQueueArgs {
    
    @scala.inline
    def apply(): GameSessionQueueArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GameSessionQueueArgs]
    }
    
    @scala.inline
    implicit class GameSessionQueueArgsMutableBuilder[Self <: GameSessionQueueArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
      
      @scala.inline
      def setDestinationsVarargs(value: Input[String]*): Self = StObject.set(x, "destinations", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlayerLatencyPolicies(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.gamelift.GameSessionQueuePlayerLatencyPolicy]
              ]
            ]
      ): Self = StObject.set(x, "playerLatencyPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerLatencyPoliciesUndefined: Self = StObject.set(x, "playerLatencyPolicies", js.undefined)
      
      @scala.inline
      def setPlayerLatencyPoliciesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.gamelift.GameSessionQueuePlayerLatencyPolicy]*): Self = StObject.set(x, "playerLatencyPolicies", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimeoutInSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    }
  }
  
  @js.native
  trait GameSessionQueueState extends StObject {
    
    /**
      * Game Session Queue ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of fleet/alias ARNs used by session queue for placing game sessions.
      */
    val destinations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Name of the session queue.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more policies used to choose fleet based on player latency. See below.
      */
    val playerLatencyPolicies: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.gamelift.GameSessionQueuePlayerLatencyPolicy]
          ]
        ]
      ] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Maximum time a game session request can remain in the queue.
      */
    val timeoutInSeconds: js.UndefOr[Input[Double]] = js.native
  }
  object GameSessionQueueState {
    
    @scala.inline
    def apply(): GameSessionQueueState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GameSessionQueueState]
    }
    
    @scala.inline
    implicit class GameSessionQueueStateMutableBuilder[Self <: GameSessionQueueState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDestinations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
      
      @scala.inline
      def setDestinationsVarargs(value: Input[String]*): Self = StObject.set(x, "destinations", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlayerLatencyPolicies(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.gamelift.GameSessionQueuePlayerLatencyPolicy]
              ]
            ]
      ): Self = StObject.set(x, "playerLatencyPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerLatencyPoliciesUndefined: Self = StObject.set(x, "playerLatencyPolicies", js.undefined)
      
      @scala.inline
      def setPlayerLatencyPoliciesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.gamelift.GameSessionQueuePlayerLatencyPolicy]*): Self = StObject.set(x, "playerLatencyPolicies", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimeoutInSeconds(value: Input[Double]): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    }
  }
}
