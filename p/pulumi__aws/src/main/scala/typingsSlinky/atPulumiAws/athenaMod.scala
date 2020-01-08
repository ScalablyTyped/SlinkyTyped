package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.athenaDatabaseMod.DatabaseArgs
import typingsSlinky.atPulumiAws.athenaDatabaseMod.DatabaseState
import typingsSlinky.atPulumiAws.athenaNamedQueryMod.NamedQueryArgs
import typingsSlinky.atPulumiAws.athenaNamedQueryMod.NamedQueryState
import typingsSlinky.atPulumiAws.athenaWorkgroupMod.WorkgroupArgs
import typingsSlinky.atPulumiAws.athenaWorkgroupMod.WorkgroupState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/athena", JSImport.Namespace)
@js.native
object athenaMod extends js.Object {
  @js.native
  class Database protected ()
    extends typingsSlinky.atPulumiAws.athenaDatabaseMod.Database {
    /**
      * Create a Database resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DatabaseArgs) = this()
    def this(name: String, args: DatabaseArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NamedQuery protected ()
    extends typingsSlinky.atPulumiAws.athenaNamedQueryMod.NamedQuery {
    /**
      * Create a NamedQuery resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NamedQueryArgs) = this()
    def this(name: String, args: NamedQueryArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Workgroup protected ()
    extends typingsSlinky.atPulumiAws.athenaWorkgroupMod.Workgroup {
    /**
      * Create a Workgroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkgroupArgs) = this()
    def this(name: String, args: WorkgroupArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Database extends js.Object {
    /**
      * Get an existing Database resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.athenaDatabaseMod.Database = js.native
    def get(name: String, id: Input[ID], state: DatabaseState): typingsSlinky.atPulumiAws.athenaDatabaseMod.Database = js.native
    def get(name: String, id: Input[ID], state: DatabaseState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.athenaDatabaseMod.Database = js.native
    /**
      * Returns true if the given object is an instance of Database.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/database.Database */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NamedQuery extends js.Object {
    /**
      * Get an existing NamedQuery resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.athenaNamedQueryMod.NamedQuery = js.native
    def get(name: String, id: Input[ID], state: NamedQueryState): typingsSlinky.atPulumiAws.athenaNamedQueryMod.NamedQuery = js.native
    def get(name: String, id: Input[ID], state: NamedQueryState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.athenaNamedQueryMod.NamedQuery = js.native
    /**
      * Returns true if the given object is an instance of NamedQuery.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/namedQuery.NamedQuery */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Workgroup extends js.Object {
    /**
      * Get an existing Workgroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.athenaWorkgroupMod.Workgroup = js.native
    def get(name: String, id: Input[ID], state: WorkgroupState): typingsSlinky.atPulumiAws.athenaWorkgroupMod.Workgroup = js.native
    def get(name: String, id: Input[ID], state: WorkgroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.athenaWorkgroupMod.Workgroup = js.native
    /**
      * Returns true if the given object is an instance of Workgroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/workgroup.Workgroup */ Boolean = js.native
  }
  
}

