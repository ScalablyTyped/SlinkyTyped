package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.conditionalForwaderMod.ConditionalForwaderArgs
import typingsSlinky.pulumiAws.conditionalForwaderMod.ConditionalForwaderState
import typingsSlinky.pulumiAws.directoryMod.DirectoryArgs
import typingsSlinky.pulumiAws.directoryMod.DirectoryState
import typingsSlinky.pulumiAws.getDirectoryMod.GetDirectoryArgs
import typingsSlinky.pulumiAws.getDirectoryMod.GetDirectoryResult
import typingsSlinky.pulumiAws.logServiceMod.LogServiceArgs
import typingsSlinky.pulumiAws.logServiceMod.LogServiceState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/directoryservice", JSImport.Namespace)
@js.native
object directoryserviceMod extends js.Object {
  
  def getDirectory(args: GetDirectoryArgs): js.Promise[GetDirectoryResult] = js.native
  def getDirectory(args: GetDirectoryArgs, opts: InvokeOptions): js.Promise[GetDirectoryResult] = js.native
  
  @js.native
  class ConditionalForwader protected ()
    extends typingsSlinky.pulumiAws.conditionalForwaderMod.ConditionalForwader {
    /**
      * Create a ConditionalForwader resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConditionalForwaderArgs) = this()
    def this(name: String, args: ConditionalForwaderArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object ConditionalForwader extends js.Object {
    
    /**
      * Get an existing ConditionalForwader resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState): typingsSlinky.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    
    /**
      * Returns true if the given object is an instance of ConditionalForwader.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/conditionalForwader.ConditionalForwader */ Boolean = js.native
  }
  
  @js.native
  class Directory protected ()
    extends typingsSlinky.pulumiAws.directoryMod.Directory {
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.directoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.directoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState): typingsSlinky.pulumiAws.directoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.directoryMod.Directory = js.native
    
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/directory.Directory */ Boolean = js.native
  }
  
  @js.native
  class LogService protected ()
    extends typingsSlinky.pulumiAws.logServiceMod.LogService {
    /**
      * Create a LogService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogServiceArgs) = this()
    def this(name: String, args: LogServiceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object LogService extends js.Object {
    
    /**
      * Get an existing LogService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logServiceMod.LogService = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logServiceMod.LogService = js.native
    def get(name: String, id: Input[ID], state: LogServiceState): typingsSlinky.pulumiAws.logServiceMod.LogService = js.native
    def get(name: String, id: Input[ID], state: LogServiceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logServiceMod.LogService = js.native
    
    /**
      * Returns true if the given object is an instance of LogService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/logService.LogService */ Boolean = js.native
  }
}
