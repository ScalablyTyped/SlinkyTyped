package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.accessPointMod.AccessPointArgs
import typingsSlinky.pulumiAws.accessPointMod.AccessPointState
import typingsSlinky.pulumiAws.fileSystemMod.FileSystemArgs
import typingsSlinky.pulumiAws.fileSystemMod.FileSystemState
import typingsSlinky.pulumiAws.fileSystemPolicyMod.FileSystemPolicyArgs
import typingsSlinky.pulumiAws.fileSystemPolicyMod.FileSystemPolicyState
import typingsSlinky.pulumiAws.getAccessPointMod.GetAccessPointArgs
import typingsSlinky.pulumiAws.getAccessPointMod.GetAccessPointResult
import typingsSlinky.pulumiAws.getAccessPointsMod.GetAccessPointsArgs
import typingsSlinky.pulumiAws.getAccessPointsMod.GetAccessPointsResult
import typingsSlinky.pulumiAws.getFileSystemMod.GetFileSystemArgs
import typingsSlinky.pulumiAws.getFileSystemMod.GetFileSystemResult
import typingsSlinky.pulumiAws.getMountTargetMod.GetMountTargetArgs
import typingsSlinky.pulumiAws.getMountTargetMod.GetMountTargetResult
import typingsSlinky.pulumiAws.mountTargetMod.MountTargetArgs
import typingsSlinky.pulumiAws.mountTargetMod.MountTargetState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object efsMod {
  
  @JSImport("@pulumi/aws/efs", "AccessPoint")
  @js.native
  class AccessPoint protected ()
    extends typingsSlinky.pulumiAws.accessPointMod.AccessPoint {
    /**
      * Create a AccessPoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccessPointArgs) = this()
    def this(name: String, args: AccessPointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AccessPoint {
    
    /**
      * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/efs", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.accessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws/efs", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.accessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws/efs", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState): typingsSlinky.pulumiAws.accessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws/efs", "AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.accessPointMod.AccessPoint = js.native
    
    /**
      * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/efs", "AccessPoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/accessPoint.AccessPoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/efs", "FileSystem")
  @js.native
  class FileSystem protected ()
    extends typingsSlinky.pulumiAws.fileSystemMod.FileSystem {
    /**
      * Create a FileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FileSystemArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FileSystemArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FileSystem {
    
    /**
      * Get an existing FileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/efs", "FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.fileSystemMod.FileSystem = js.native
    @JSImport("@pulumi/aws/efs", "FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.fileSystemMod.FileSystem = js.native
    @JSImport("@pulumi/aws/efs", "FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemState): typingsSlinky.pulumiAws.fileSystemMod.FileSystem = js.native
    @JSImport("@pulumi/aws/efs", "FileSystem.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.fileSystemMod.FileSystem = js.native
    
    /**
      * Returns true if the given object is an instance of FileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/efs", "FileSystem.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/efs", "FileSystemPolicy")
  @js.native
  class FileSystemPolicy protected ()
    extends typingsSlinky.pulumiAws.fileSystemPolicyMod.FileSystemPolicy {
    /**
      * Create a FileSystemPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FileSystemPolicyArgs) = this()
    def this(name: String, args: FileSystemPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FileSystemPolicy {
    
    /**
      * Get an existing FileSystemPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/efs", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    @JSImport("@pulumi/aws/efs", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    @JSImport("@pulumi/aws/efs", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemPolicyState): typingsSlinky.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    @JSImport("@pulumi/aws/efs", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.fileSystemPolicyMod.FileSystemPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of FileSystemPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/efs", "FileSystemPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystemPolicy.FileSystemPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/efs", "MountTarget")
  @js.native
  class MountTarget protected ()
    extends typingsSlinky.pulumiAws.mountTargetMod.MountTarget {
    /**
      * Create a MountTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MountTargetArgs) = this()
    def this(name: String, args: MountTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MountTarget {
    
    /**
      * Get an existing MountTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/efs", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.mountTargetMod.MountTarget = js.native
    @JSImport("@pulumi/aws/efs", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.mountTargetMod.MountTarget = js.native
    @JSImport("@pulumi/aws/efs", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MountTargetState): typingsSlinky.pulumiAws.mountTargetMod.MountTarget = js.native
    @JSImport("@pulumi/aws/efs", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.mountTargetMod.MountTarget = js.native
    
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/efs", "MountTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/efs", "getAccessPoint")
  @js.native
  def getAccessPoint(args: GetAccessPointArgs): js.Promise[GetAccessPointResult] = js.native
  @JSImport("@pulumi/aws/efs", "getAccessPoint")
  @js.native
  def getAccessPoint(args: GetAccessPointArgs, opts: InvokeOptions): js.Promise[GetAccessPointResult] = js.native
  
  @JSImport("@pulumi/aws/efs", "getAccessPoints")
  @js.native
  def getAccessPoints(args: GetAccessPointsArgs): js.Promise[GetAccessPointsResult] = js.native
  @JSImport("@pulumi/aws/efs", "getAccessPoints")
  @js.native
  def getAccessPoints(args: GetAccessPointsArgs, opts: InvokeOptions): js.Promise[GetAccessPointsResult] = js.native
  
  @JSImport("@pulumi/aws/efs", "getFileSystem")
  @js.native
  def getFileSystem(): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws/efs", "getFileSystem")
  @js.native
  def getFileSystem(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws/efs", "getFileSystem")
  @js.native
  def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws/efs", "getFileSystem")
  @js.native
  def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] = js.native
  
  @JSImport("@pulumi/aws/efs", "getMountTarget")
  @js.native
  def getMountTarget(args: GetMountTargetArgs): js.Promise[GetMountTargetResult] = js.native
  @JSImport("@pulumi/aws/efs", "getMountTarget")
  @js.native
  def getMountTarget(args: GetMountTargetArgs, opts: InvokeOptions): js.Promise[GetMountTargetResult] = js.native
}
