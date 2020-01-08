package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.codecommitGetRepositoryMod.GetRepositoryArgs
import typingsSlinky.atPulumiAws.codecommitGetRepositoryMod.GetRepositoryResult
import typingsSlinky.atPulumiAws.codecommitRepositoryMod.RepositoryArgs
import typingsSlinky.atPulumiAws.codecommitRepositoryMod.RepositoryState
import typingsSlinky.atPulumiAws.codecommitTriggerMod.TriggerArgs
import typingsSlinky.atPulumiAws.codecommitTriggerMod.TriggerState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codecommit", JSImport.Namespace)
@js.native
object codecommitMod extends js.Object {
  @js.native
  class Repository protected ()
    extends typingsSlinky.atPulumiAws.codecommitRepositoryMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Trigger protected ()
    extends typingsSlinky.atPulumiAws.codecommitTriggerMod.Trigger {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TriggerArgs) = this()
    def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
  }
  
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  /* static members */
  @js.native
  object Repository extends js.Object {
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.codecommitRepositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typingsSlinky.atPulumiAws.codecommitRepositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.codecommitRepositoryMod.Repository = js.native
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/repository.Repository */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Trigger extends js.Object {
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.codecommitTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState): typingsSlinky.atPulumiAws.codecommitTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.codecommitTriggerMod.Trigger = js.native
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean = js.native
  }
  
}

