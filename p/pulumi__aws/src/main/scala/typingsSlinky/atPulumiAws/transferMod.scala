package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.transferGetServerMod.GetServerArgs
import typingsSlinky.atPulumiAws.transferGetServerMod.GetServerResult
import typingsSlinky.atPulumiAws.transferServerMod.ServerArgs
import typingsSlinky.atPulumiAws.transferServerMod.ServerState
import typingsSlinky.atPulumiAws.transferSshKeyMod.SshKeyArgs
import typingsSlinky.atPulumiAws.transferSshKeyMod.SshKeyState
import typingsSlinky.atPulumiAws.transferUserMod.UserArgs
import typingsSlinky.atPulumiAws.transferUserMod.UserState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/transfer", JSImport.Namespace)
@js.native
object transferMod extends js.Object {
  @js.native
  class Server protected ()
    extends typingsSlinky.atPulumiAws.transferServerMod.Server {
    /**
      * Create a Server resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServerArgs) = this()
    def this(name: String, args: ServerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SshKey protected ()
    extends typingsSlinky.atPulumiAws.transferSshKeyMod.SshKey {
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
  
  @js.native
  class User protected ()
    extends typingsSlinky.atPulumiAws.transferUserMod.User {
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
  
  def getServer(args: GetServerArgs): js.Promise[GetServerResult] with GetServerResult = js.native
  def getServer(args: GetServerArgs, opts: InvokeOptions): js.Promise[GetServerResult] with GetServerResult = js.native
  /* static members */
  @js.native
  object Server extends js.Object {
    /**
      * Get an existing Server resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.transferServerMod.Server = js.native
    def get(name: String, id: Input[ID], state: ServerState): typingsSlinky.atPulumiAws.transferServerMod.Server = js.native
    def get(name: String, id: Input[ID], state: ServerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.transferServerMod.Server = js.native
    /**
      * Returns true if the given object is an instance of Server.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/server.Server */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SshKey extends js.Object {
    /**
      * Get an existing SshKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.transferSshKeyMod.SshKey = js.native
    def get(name: String, id: Input[ID], state: SshKeyState): typingsSlinky.atPulumiAws.transferSshKeyMod.SshKey = js.native
    def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.transferSshKeyMod.SshKey = js.native
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/sshKey.SshKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    /**
      * Get an existing User resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.transferUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState): typingsSlinky.atPulumiAws.transferUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.transferUserMod.User = js.native
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/user.User */ Boolean = js.native
  }
  
}

