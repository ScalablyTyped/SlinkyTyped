package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getRepositoryMod.GetRepositoryArgs
import typingsSlinky.pulumiAws.getRepositoryMod.GetRepositoryResult
import typingsSlinky.pulumiAws.repositoryMod.RepositoryArgs
import typingsSlinky.pulumiAws.repositoryMod.RepositoryState
import typingsSlinky.pulumiAws.triggerMod.TriggerArgs
import typingsSlinky.pulumiAws.triggerMod.TriggerState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "codecommit")
@js.native
object codecommit extends js.Object {
  @js.native
  class Repository protected ()
    extends typingsSlinky.pulumiAws.codecommitMod.Repository {
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
    extends typingsSlinky.pulumiAws.codecommitMod.Trigger {
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.repositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typingsSlinky.pulumiAws.repositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.repositoryMod.Repository = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.triggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState): typingsSlinky.pulumiAws.triggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.triggerMod.Trigger = js.native
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean = js.native
  }
  
}

