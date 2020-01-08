package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.datasyncAgentMod.AgentArgs
import typingsSlinky.atPulumiAws.datasyncAgentMod.AgentState
import typingsSlinky.atPulumiAws.datasyncEfsLocationMod.EfsLocationArgs
import typingsSlinky.atPulumiAws.datasyncEfsLocationMod.EfsLocationState
import typingsSlinky.atPulumiAws.datasyncNfsLocationMod.NfsLocationArgs
import typingsSlinky.atPulumiAws.datasyncNfsLocationMod.NfsLocationState
import typingsSlinky.atPulumiAws.datasyncS3LocationMod.S3LocationArgs
import typingsSlinky.atPulumiAws.datasyncS3LocationMod.S3LocationState
import typingsSlinky.atPulumiAws.datasyncTaskMod.TaskArgs
import typingsSlinky.atPulumiAws.datasyncTaskMod.TaskState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync", JSImport.Namespace)
@js.native
object datasyncMod extends js.Object {
  @js.native
  class Agent protected ()
    extends typingsSlinky.atPulumiAws.datasyncAgentMod.Agent {
    /**
      * Create a Agent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AgentArgs) = this()
    def this(name: String, args: AgentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EfsLocation protected ()
    extends typingsSlinky.atPulumiAws.datasyncEfsLocationMod.EfsLocation {
    /**
      * Create a EfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EfsLocationArgs) = this()
    def this(name: String, args: EfsLocationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NfsLocation protected ()
    extends typingsSlinky.atPulumiAws.datasyncNfsLocationMod.NfsLocation {
    /**
      * Create a NfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsLocationArgs) = this()
    def this(name: String, args: NfsLocationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class S3Location protected ()
    extends typingsSlinky.atPulumiAws.datasyncS3LocationMod.S3Location {
    /**
      * Create a S3Location resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3LocationArgs) = this()
    def this(name: String, args: S3LocationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Task protected ()
    extends typingsSlinky.atPulumiAws.datasyncTaskMod.Task {
    /**
      * Create a Task resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TaskArgs) = this()
    def this(name: String, args: TaskArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Agent extends js.Object {
    /**
      * Get an existing Agent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.datasyncAgentMod.Agent = js.native
    def get(name: String, id: Input[ID], state: AgentState): typingsSlinky.atPulumiAws.datasyncAgentMod.Agent = js.native
    def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.datasyncAgentMod.Agent = js.native
    /**
      * Returns true if the given object is an instance of Agent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EfsLocation extends js.Object {
    /**
      * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.datasyncEfsLocationMod.EfsLocation = js.native
    def get(name: String, id: Input[ID], state: EfsLocationState): typingsSlinky.atPulumiAws.datasyncEfsLocationMod.EfsLocation = js.native
    def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.datasyncEfsLocationMod.EfsLocation = js.native
    /**
      * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NfsLocation extends js.Object {
    /**
      * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.datasyncNfsLocationMod.NfsLocation = js.native
    def get(name: String, id: Input[ID], state: NfsLocationState): typingsSlinky.atPulumiAws.datasyncNfsLocationMod.NfsLocation = js.native
    def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.datasyncNfsLocationMod.NfsLocation = js.native
    /**
      * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object S3Location extends js.Object {
    /**
      * Get an existing S3Location resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.datasyncS3LocationMod.S3Location = js.native
    def get(name: String, id: Input[ID], state: S3LocationState): typingsSlinky.atPulumiAws.datasyncS3LocationMod.S3Location = js.native
    def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.datasyncS3LocationMod.S3Location = js.native
    /**
      * Returns true if the given object is an instance of S3Location.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3Location.S3Location */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Task extends js.Object {
    /**
      * Get an existing Task resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.datasyncTaskMod.Task = js.native
    def get(name: String, id: Input[ID], state: TaskState): typingsSlinky.atPulumiAws.datasyncTaskMod.Task = js.native
    def get(name: String, id: Input[ID], state: TaskState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.datasyncTaskMod.Task = js.native
    /**
      * Returns true if the given object is an instance of Task.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean = js.native
  }
  
}

