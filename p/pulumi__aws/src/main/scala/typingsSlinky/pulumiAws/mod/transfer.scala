package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getServerMod.GetServerArgs
import typingsSlinky.pulumiAws.getServerMod.GetServerResult
import typingsSlinky.pulumiAws.serverMod.ServerArgs
import typingsSlinky.pulumiAws.serverMod.ServerState
import typingsSlinky.pulumiAws.transferSshKeyMod.SshKeyArgs
import typingsSlinky.pulumiAws.transferSshKeyMod.SshKeyState
import typingsSlinky.pulumiAws.transferUserMod.UserArgs
import typingsSlinky.pulumiAws.transferUserMod.UserState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transfer {
  
  @JSImport("@pulumi/aws", "transfer.Server")
  @js.native
  class Server protected ()
    extends typingsSlinky.pulumiAws.transferMod.Server {
    /**
      * Create a Server resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ServerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Server {
    
    /**
      * Get an existing Server resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "transfer.Server.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.serverMod.Server = js.native
    @JSImport("@pulumi/aws", "transfer.Server.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.serverMod.Server = js.native
    @JSImport("@pulumi/aws", "transfer.Server.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServerState): typingsSlinky.pulumiAws.serverMod.Server = js.native
    @JSImport("@pulumi/aws", "transfer.Server.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.serverMod.Server = js.native
    
    /**
      * Returns true if the given object is an instance of Server.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "transfer.Server.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/server.Server */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "transfer.SshKey")
  @js.native
  class SshKey protected ()
    extends typingsSlinky.pulumiAws.transferMod.SshKey {
    /**
      * Create a SshKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SshKeyArgs) = this()
    def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SshKey {
    
    /**
      * Get an existing SshKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "transfer.SshKey.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.transferSshKeyMod.SshKey = js.native
    @JSImport("@pulumi/aws", "transfer.SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.transferSshKeyMod.SshKey = js.native
    @JSImport("@pulumi/aws", "transfer.SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: SshKeyState): typingsSlinky.pulumiAws.transferSshKeyMod.SshKey = js.native
    @JSImport("@pulumi/aws", "transfer.SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.transferSshKeyMod.SshKey = js.native
    
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "transfer.SshKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/sshKey.SshKey */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "transfer.User")
  @js.native
  class User protected ()
    extends typingsSlinky.pulumiAws.transferMod.User {
    /**
      * Create a User resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserArgs) = this()
    def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object User {
    
    /**
      * Get an existing User resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "transfer.User.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.transferUserMod.User = js.native
    @JSImport("@pulumi/aws", "transfer.User.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.transferUserMod.User = js.native
    @JSImport("@pulumi/aws", "transfer.User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState): typingsSlinky.pulumiAws.transferUserMod.User = js.native
    @JSImport("@pulumi/aws", "transfer.User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.transferUserMod.User = js.native
    
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "transfer.User.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/user.User */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "transfer.getServer")
  @js.native
  def getServer(args: GetServerArgs): js.Promise[GetServerResult] = js.native
  @JSImport("@pulumi/aws", "transfer.getServer")
  @js.native
  def getServer(args: GetServerArgs, opts: InvokeOptions): js.Promise[GetServerResult] = js.native
}
