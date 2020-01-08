package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.quicksightGroupMod.GroupArgs
import typingsSlinky.atPulumiAws.quicksightGroupMod.GroupState
import typingsSlinky.atPulumiAws.quicksightUserMod.UserArgs
import typingsSlinky.atPulumiAws.quicksightUserMod.UserState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/quicksight", JSImport.Namespace)
@js.native
object quicksightMod extends js.Object {
  @js.native
  class Group protected ()
    extends typingsSlinky.atPulumiAws.quicksightGroupMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class User protected ()
    extends typingsSlinky.atPulumiAws.quicksightUserMod.User {
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
  @js.native
  object Group extends js.Object {
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.quicksightGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState): typingsSlinky.atPulumiAws.quicksightGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.quicksightGroupMod.Group = js.native
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/group.Group */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.quicksightUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState): typingsSlinky.atPulumiAws.quicksightUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.quicksightUserMod.User = js.native
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/user.User */ Boolean = js.native
  }
  
}

