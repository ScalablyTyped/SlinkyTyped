package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.lustreFileSystemMod.LustreFileSystemArgs
import typingsSlinky.pulumiAws.lustreFileSystemMod.LustreFileSystemState
import typingsSlinky.pulumiAws.windowsFileSystemMod.WindowsFileSystemArgs
import typingsSlinky.pulumiAws.windowsFileSystemMod.WindowsFileSystemState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/fsx", JSImport.Namespace)
@js.native
object fsxMod extends js.Object {
  @js.native
  class LustreFileSystem protected ()
    extends typingsSlinky.pulumiAws.lustreFileSystemMod.LustreFileSystem {
    /**
      * Create a LustreFileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LustreFileSystemArgs) = this()
    def this(name: String, args: LustreFileSystemArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class WindowsFileSystem protected ()
    extends typingsSlinky.pulumiAws.windowsFileSystemMod.WindowsFileSystem {
    /**
      * Create a WindowsFileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WindowsFileSystemArgs) = this()
    def this(name: String, args: WindowsFileSystemArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object LustreFileSystem extends js.Object {
    /**
      * Get an existing LustreFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lustreFileSystemMod.LustreFileSystem = js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState): typingsSlinky.pulumiAws.lustreFileSystemMod.LustreFileSystem = js.native
    def get(name: String, id: Input[ID], state: LustreFileSystemState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lustreFileSystemMod.LustreFileSystem = js.native
    /**
      * Returns true if the given object is an instance of LustreFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/lustreFileSystem.LustreFileSystem */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WindowsFileSystem extends js.Object {
    /**
      * Get an existing WindowsFileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.windowsFileSystemMod.WindowsFileSystem = js.native
    def get(name: String, id: Input[ID], state: WindowsFileSystemState): typingsSlinky.pulumiAws.windowsFileSystemMod.WindowsFileSystem = js.native
    def get(name: String, id: Input[ID], state: WindowsFileSystemState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.windowsFileSystemMod.WindowsFileSystem = js.native
    /**
      * Returns true if the given object is an instance of WindowsFileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fsx/windowsFileSystem.WindowsFileSystem */ Boolean = js.native
  }
  
}

