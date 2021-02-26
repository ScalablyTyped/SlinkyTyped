package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.quicksightGroupMod.GroupArgs
import typingsSlinky.pulumiAws.quicksightGroupMod.GroupState
import typingsSlinky.pulumiAws.quicksightUserMod.UserArgs
import typingsSlinky.pulumiAws.quicksightUserMod.UserState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quicksightMod {
  
  @JSImport("@pulumi/aws/quicksight", "Group")
  @js.native
  class Group protected ()
    extends typingsSlinky.pulumiAws.quicksightGroupMod.Group {
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
  /* static members */
  object Group {
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/quicksight", "Group.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.quicksightGroupMod.Group = js.native
    @JSImport("@pulumi/aws/quicksight", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.quicksightGroupMod.Group = js.native
    @JSImport("@pulumi/aws/quicksight", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState): typingsSlinky.pulumiAws.quicksightGroupMod.Group = js.native
    @JSImport("@pulumi/aws/quicksight", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.quicksightGroupMod.Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/quicksight", "Group.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/group.Group */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/quicksight", "User")
  @js.native
  class User protected ()
    extends typingsSlinky.pulumiAws.quicksightUserMod.User {
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
    @JSImport("@pulumi/aws/quicksight", "User.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.quicksightUserMod.User = js.native
    @JSImport("@pulumi/aws/quicksight", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.quicksightUserMod.User = js.native
    @JSImport("@pulumi/aws/quicksight", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState): typingsSlinky.pulumiAws.quicksightUserMod.User = js.native
    @JSImport("@pulumi/aws/quicksight", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.quicksightUserMod.User = js.native
    
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/quicksight", "User.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/user.User */ Boolean = js.native
  }
}
