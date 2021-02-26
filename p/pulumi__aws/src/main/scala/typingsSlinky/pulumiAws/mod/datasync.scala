package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.agentMod.AgentArgs
import typingsSlinky.pulumiAws.agentMod.AgentState
import typingsSlinky.pulumiAws.efsLocationMod.EfsLocationArgs
import typingsSlinky.pulumiAws.efsLocationMod.EfsLocationState
import typingsSlinky.pulumiAws.locationFsxWindowsMod.LocationFsxWindowsArgs
import typingsSlinky.pulumiAws.locationFsxWindowsMod.LocationFsxWindowsState
import typingsSlinky.pulumiAws.locationSmbMod.LocationSmbArgs
import typingsSlinky.pulumiAws.locationSmbMod.LocationSmbState
import typingsSlinky.pulumiAws.nfsLocationMod.NfsLocationArgs
import typingsSlinky.pulumiAws.nfsLocationMod.NfsLocationState
import typingsSlinky.pulumiAws.s3locationMod.S3LocationArgs
import typingsSlinky.pulumiAws.s3locationMod.S3LocationState
import typingsSlinky.pulumiAws.taskMod.TaskArgs
import typingsSlinky.pulumiAws.taskMod.TaskState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasync {
  
  @JSImport("@pulumi/aws", "datasync.Agent")
  @js.native
  class Agent protected ()
    extends typingsSlinky.pulumiAws.datasyncMod.Agent {
    /**
      * Create a Agent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AgentArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AgentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Agent {
    
    /**
      * Get an existing Agent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "datasync.Agent.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.agentMod.Agent = js.native
    @JSImport("@pulumi/aws", "datasync.Agent.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.agentMod.Agent = js.native
    @JSImport("@pulumi/aws", "datasync.Agent.get")
    @js.native
    def get(name: String, id: Input[ID], state: AgentState): typingsSlinky.pulumiAws.agentMod.Agent = js.native
    @JSImport("@pulumi/aws", "datasync.Agent.get")
    @js.native
    def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.agentMod.Agent = js.native
    
    /**
      * Returns true if the given object is an instance of Agent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datasync.Agent.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "datasync.EfsLocation")
  @js.native
  class EfsLocation protected ()
    extends typingsSlinky.pulumiAws.datasyncMod.EfsLocation {
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
  /* static members */
  object EfsLocation {
    
    /**
      * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "datasync.EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.efsLocationMod.EfsLocation = js.native
    @JSImport("@pulumi/aws", "datasync.EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.efsLocationMod.EfsLocation = js.native
    @JSImport("@pulumi/aws", "datasync.EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: EfsLocationState): typingsSlinky.pulumiAws.efsLocationMod.EfsLocation = js.native
    @JSImport("@pulumi/aws", "datasync.EfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.efsLocationMod.EfsLocation = js.native
    
    /**
      * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datasync.EfsLocation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "datasync.LocationFsxWindows")
  @js.native
  class LocationFsxWindows protected ()
    extends typingsSlinky.pulumiAws.datasyncMod.LocationFsxWindows {
    /**
      * Create a LocationFsxWindows resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocationFsxWindowsArgs) = this()
    def this(name: String, args: LocationFsxWindowsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LocationFsxWindows {
    
    /**
      * Get an existing LocationFsxWindows resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "datasync.LocationFsxWindows.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = js.native
    @JSImport("@pulumi/aws", "datasync.LocationFsxWindows.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = js.native
    @JSImport("@pulumi/aws", "datasync.LocationFsxWindows.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocationFsxWindowsState): typingsSlinky.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = js.native
    @JSImport("@pulumi/aws", "datasync.LocationFsxWindows.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocationFsxWindowsState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = js.native
    
    /**
      * Returns true if the given object is an instance of LocationFsxWindows.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datasync.LocationFsxWindows.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationFsxWindows.LocationFsxWindows */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "datasync.LocationSmb")
  @js.native
  class LocationSmb protected ()
    extends typingsSlinky.pulumiAws.datasyncMod.LocationSmb {
    /**
      * Create a LocationSmb resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocationSmbArgs) = this()
    def this(name: String, args: LocationSmbArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LocationSmb {
    
    /**
      * Get an existing LocationSmb resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "datasync.LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.locationSmbMod.LocationSmb = js.native
    @JSImport("@pulumi/aws", "datasync.LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.locationSmbMod.LocationSmb = js.native
    @JSImport("@pulumi/aws", "datasync.LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocationSmbState): typingsSlinky.pulumiAws.locationSmbMod.LocationSmb = js.native
    @JSImport("@pulumi/aws", "datasync.LocationSmb.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocationSmbState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.locationSmbMod.LocationSmb = js.native
    
    /**
      * Returns true if the given object is an instance of LocationSmb.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datasync.LocationSmb.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationSmb.LocationSmb */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "datasync.NfsLocation")
  @js.native
  class NfsLocation protected ()
    extends typingsSlinky.pulumiAws.datasyncMod.NfsLocation {
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
  /* static members */
  object NfsLocation {
    
    /**
      * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "datasync.NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.nfsLocationMod.NfsLocation = js.native
    @JSImport("@pulumi/aws", "datasync.NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.nfsLocationMod.NfsLocation = js.native
    @JSImport("@pulumi/aws", "datasync.NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsLocationState): typingsSlinky.pulumiAws.nfsLocationMod.NfsLocation = js.native
    @JSImport("@pulumi/aws", "datasync.NfsLocation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.nfsLocationMod.NfsLocation = js.native
    
    /**
      * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datasync.NfsLocation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "datasync.S3Location")
  @js.native
  class S3Location protected ()
    extends typingsSlinky.pulumiAws.datasyncMod.S3Location {
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
  /* static members */
  object S3Location {
    
    /**
      * Get an existing S3Location resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "datasync.S3Location.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.s3locationMod.S3Location = js.native
    @JSImport("@pulumi/aws", "datasync.S3Location.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.s3locationMod.S3Location = js.native
    @JSImport("@pulumi/aws", "datasync.S3Location.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3LocationState): typingsSlinky.pulumiAws.s3locationMod.S3Location = js.native
    @JSImport("@pulumi/aws", "datasync.S3Location.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.s3locationMod.S3Location = js.native
    
    /**
      * Returns true if the given object is an instance of S3Location.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datasync.S3Location.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "datasync.Task")
  @js.native
  class Task protected ()
    extends typingsSlinky.pulumiAws.datasyncMod.Task {
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
  object Task {
    
    /**
      * Get an existing Task resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "datasync.Task.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.taskMod.Task = js.native
    @JSImport("@pulumi/aws", "datasync.Task.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.taskMod.Task = js.native
    @JSImport("@pulumi/aws", "datasync.Task.get")
    @js.native
    def get(name: String, id: Input[ID], state: TaskState): typingsSlinky.pulumiAws.taskMod.Task = js.native
    @JSImport("@pulumi/aws", "datasync.Task.get")
    @js.native
    def get(name: String, id: Input[ID], state: TaskState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.taskMod.Task = js.native
    
    /**
      * Returns true if the given object is an instance of Task.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datasync.Task.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean = js.native
  }
}
