package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getBundleMod.GetBundleArgs
import typingsSlinky.pulumiAws.getBundleMod.GetBundleResult
import typingsSlinky.pulumiAws.ipGroupMod.IpGroupArgs
import typingsSlinky.pulumiAws.ipGroupMod.IpGroupState
import typingsSlinky.pulumiAws.workspaceMod.WorkspaceArgs
import typingsSlinky.pulumiAws.workspaceMod.WorkspaceState
import typingsSlinky.pulumiAws.workspacesDirectoryMod.DirectoryArgs
import typingsSlinky.pulumiAws.workspacesDirectoryMod.DirectoryState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/workspaces", JSImport.Namespace)
@js.native
object workspacesMod extends js.Object {
  
  def getBundle(): js.Promise[GetBundleResult] = js.native
  def getBundle(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
  def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] = js.native
  def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
  
  @js.native
  class Directory protected ()
    extends typingsSlinky.pulumiAws.workspacesDirectoryMod.Directory {
    /**
      * Create a Directory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DirectoryArgs) = this()
    def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Directory extends js.Object {
    
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState): typingsSlinky.pulumiAws.workspacesDirectoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.workspacesDirectoryMod.Directory = js.native
    
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean = js.native
  }
  
  @js.native
  class IpGroup protected ()
    extends typingsSlinky.pulumiAws.ipGroupMod.IpGroup {
    /**
      * Create a IpGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IpGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object IpGroup extends js.Object {
    
    /**
      * Get an existing IpGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ipGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ipGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: IpGroupState): typingsSlinky.pulumiAws.ipGroupMod.IpGroup = js.native
    def get(name: String, id: Input[ID], state: IpGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ipGroupMod.IpGroup = js.native
    
    /**
      * Returns true if the given object is an instance of IpGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/ipGroup.IpGroup */ Boolean = js.native
  }
  
  @js.native
  class Workspace protected ()
    extends typingsSlinky.pulumiAws.workspaceMod.Workspace {
    /**
      * Create a Workspace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WorkspaceArgs) = this()
    def this(name: String, args: WorkspaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Workspace extends js.Object {
    
    /**
      * Get an existing Workspace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.workspaceMod.Workspace = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.workspaceMod.Workspace = js.native
    def get(name: String, id: Input[ID], state: WorkspaceState): typingsSlinky.pulumiAws.workspaceMod.Workspace = js.native
    def get(name: String, id: Input[ID], state: WorkspaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.workspaceMod.Workspace = js.native
    
    /**
      * Returns true if the given object is an instance of Workspace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/workspace.Workspace */ Boolean = js.native
  }
}
